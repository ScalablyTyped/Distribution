package typings.chevrotainTypes.mod

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "CstParser")
@js.native
open class CstParser ()
  extends StObject
     with BaseParser {
  
  /**
    * Overrides a Grammar Rule
    * See usage example in: https://github.com/chevrotain/chevrotain/blob/master/examples/parser/versioning/versioning.js
    */
  /* protected */ def OVERRIDE_RULE[F /* <: js.Function0[Unit] */](name: String, implementation: F): ParserMethod[Parameters[F], CstNode] = js.native
  /* protected */ def OVERRIDE_RULE[F /* <: js.Function0[Unit] */](name: String, implementation: F, config: IRuleConfig[CstNode]): ParserMethod[Parameters[F], CstNode] = js.native
  
  /**
    * Creates a Grammar Rule
    *
    * Note that any parameters of your implementation must be optional as it will
    * be called without parameters during the grammar recording phase.
    */
  /* protected */ def RULE[F /* <: js.Function0[Unit] */](name: String, implementation: F): ParserMethod[Parameters[F], CstNode] = js.native
  /* protected */ def RULE[F /* <: js.Function0[Unit] */](name: String, implementation: F, config: IRuleConfig[CstNode]): ParserMethod[Parameters[F], CstNode] = js.native
  
  /**
    * The Parsing DSL Method is used by one rule to call another.
    * It is equivalent to a non-Terminal in EBNF notation.
    *
    * This may seem redundant as it does not actually do much.
    * However using it is **mandatory** for all sub rule invocations.
    *
    * Calling another rule without wrapping in SUBRULE(...)
    * will cause errors/mistakes in the Parser's self analysis phase,
    * which will lead to errors in error recovery/automatic lookahead calculation
    * and any other functionality relying on the Parser's self analysis
    * output.
    *
    * As in CONSUME the index in the method name indicates the occurrence
    * of the sub rule invocation in its rule.
    *
    */
  /* protected */ def SUBRULE[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE1[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE1[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE2[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE2[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE3[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE3[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE4[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE4[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE5[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE5[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE6[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE6[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE7[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE7[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE8[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE8[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * @see SUBRULE
    * @hidden
    */
  /* protected */ def SUBRULE9[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def SUBRULE9[ARGS /* <: js.Array[Any] */](ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
  
  /**
    * Like `SUBRULE` with the numerical suffix as a parameter, e.g:
    * subrule(0, X) === SUBRULE(X)
    * subrule(1, X) === SUBRULE1(X)
    * subrule(2, X) === SUBRULE2(X)
    * ...
    * @see SUBRULE
    */
  /* protected */ def subrule[ARGS /* <: js.Array[Any] */](idx: Double, ruleToCall: ParserMethod[ARGS, CstNode]): CstNode = js.native
  /* protected */ def subrule[ARGS /* <: js.Array[Any] */](idx: Double, ruleToCall: ParserMethod[ARGS, CstNode], options: SubruleMethodOpts[ARGS]): CstNode = js.native
}
