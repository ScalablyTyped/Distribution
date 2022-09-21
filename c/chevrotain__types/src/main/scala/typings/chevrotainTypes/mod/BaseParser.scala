package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.Instantiable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class does not actually exist nor is exposed at runtime.
  * This is just a helper to avoid duplications in the Type Definitions
  * Of `CstParser` and `EmbeddedActionsParser`
  */
@js.native
trait BaseParser extends StObject {
  
  /**
    * The Semantic Actions wrapper.
    * Should be used to wrap semantic actions that either:
    * - May fail when executing in "recording phase".
    * - Have global side effects that should be avoided during "recording phase".
    *
    * For more information see:
    *   - https://chevrotain.io/docs/guide/internals.html#grammar-recording
    */
  /* protected */ def ACTION[T](impl: js.Function0[T]): T = js.native
  
  /* protected */ def AT_LEAST_ONE(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * Convenience method, same as MANY but the repetition is of one or more.
    * failing to match at least one repetition will result in a parsing error and
    * cause a parsing error.
    *
    * @see MANY
    *
    * @param actionORMethodDef  - The grammar action to optionally invoke multiple times
    *                             or an "OPTIONS" object describing the grammar action and optional properties.
    *
    */
  /* protected */ def AT_LEAST_ONE(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE1(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE1(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE2(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE2(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE3(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE3(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE4(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE4(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE5(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE5(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE6(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE6(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE7(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE7(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE8(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE8(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def AT_LEAST_ONE9(actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * @see AT_LEAST_ONE
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE9(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /**
    * Convenience method, same as MANY_SEP but the repetition is of one or more.
    * failing to match at least one repetition will result in a parsing error and
    * cause the parser to attempt error recovery.
    *
    * Note that an additional optional property ERR_MSG can be used to provide custom error messages.
    *
    * @see MANY_SEP
    *
    * @param options - An object defining the grammar of each iteration and the separator between iterations
    *
    * @return {ISeparatedIterationResult<OUT>}
    */
  /* protected */ def AT_LEAST_ONE_SEP(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP1(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP2(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP3(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP4(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP5(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP6(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP7(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP8(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see AT_LEAST_ONE_SEP
    * @hidden
    */
  /* protected */ def AT_LEAST_ONE_SEP9(options: AtLeastOneSepMethodOpts[Any]): Unit = js.native
  
  /**
    * @param grammarRule - The rule to try and parse in backtracking mode.
    * @param args - argument to be passed to the grammar rule execution
    *
    * @return a lookahead function that will try to parse the given grammarRule and will return true if succeed.
    */
  /* protected */ def BACKTRACK[T](grammarRule: js.Function1[/* repeated */ Any, T]): js.Function0[Boolean] = js.native
  /* protected */ def BACKTRACK[T](grammarRule: js.Function1[/* repeated */ Any, T], args: js.Array[Any]): js.Function0[Boolean] = js.native
  
  /**
    *
    * A Parsing DSL method use to consume a single Token.
    * In EBNF terms this is equivalent to a Terminal.
    *
    * A Token will be consumed, IFF the next token in the token vector matches `tokType`.
    * otherwise the parser may attempt to perform error recovery (if enabled).
    *
    * The index in the method name indicates the unique occurrence of a terminal consumption
    * inside a the top level rule. What this means is that if a terminal appears
    * more than once in a single rule, each appearance must have a **different** index.
    *
    * For example:
    * ```
    *   this.RULE("qualifiedName", () => {
    *   this.CONSUME1(Identifier);
    *     this.MANY(() => {
    *       this.CONSUME1(Dot);
    *       // here we use CONSUME2 because the terminal
    *       // 'Identifier' has already appeared previously in the
    *       // the rule 'parseQualifiedName'
    *       this.CONSUME2(Identifier);
    *     });
    *   })
    * ```
    *
    * - See more details on the [unique suffixes requirement](http://chevrotain.io/docs/FAQ.html#NUMERICAL_SUFFIXES).
    *
    * @param tokType - The Type of the token to be consumed.
    * @param options - optional properties to modify the behavior of CONSUME.
    */
  /* protected */ def CONSUME(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME1(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME1(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME2(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME2(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME3(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME3(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME4(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME4(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME5(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME5(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME6(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME6(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME7(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME7(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME8(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME8(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * @see CONSUME
    * @hidden
    */
  /* protected */ def CONSUME9(tokType: TokenType): IToken = js.native
  /* protected */ def CONSUME9(tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  /**
    * Look-Ahead for the Token Vector
    * LA(1) is the next Token ahead.
    * LA(n) is the nth Token ahead.
    * LA(0) is the previously consumed Token.
    *
    * Looking beyond the end of the Token Vector or before its begining
    * will return in an IToken of type EOF {@link EOF}.
    * This behavior can be used to avoid infinite loops.
    *
    * This is often used to implement custom lookahead logic for GATES.
    * https://chevrotain.io/docs/features/gates.html
    */
  /* protected */ def LA(howMuch: Double): IToken = js.native
  
  /* protected */ def MANY(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * Parsing DSL method, that indicates a repetition of zero or more.
    * This is equivalent to EBNF repetition \{...\}.
    *
    * Note that there are two syntax forms:
    * - Passing the grammar action directly:
    *   ```
    *     this.MANY(() => {
    *       this.CONSUME(Comma)
    *       this.CONSUME(Digit)
    *      })
    *   ```
    *
    * - using an "options" object:
    *   ```
    *     this.MANY({
    *       GATE: predicateFunc,
    *       DEF: () => {
    *              this.CONSUME(Comma)
    *              this.CONSUME(Digit)
    *            }
    *     });
    *   ```
    *
    * The optional 'GATE' property in "options" object form can be used to add constraints
    * to invoking the grammar action.
    *
    * As in CONSUME the index in the method name indicates the occurrence
    * of the repetition production in it's top rule.
    *
    * @param actionORMethodDef - The grammar action to optionally invoke multiple times
    *                             or an "OPTIONS" object describing the grammar action and optional properties.
    *
    */
  /* protected */ def MANY(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY1(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY1(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY2(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY2(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY3(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY3(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY4(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY4(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY5(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY5(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY6(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY6(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY7(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY7(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY8(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY8(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def MANY9(actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * @see MANY
    * @hidden
    */
  /* protected */ def MANY9(actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /**
    * Parsing DSL method, that indicates a repetition of zero or more with a separator
    * Token between the repetitions.
    *
    * Example:
    *
    * ```
    *     this.MANY_SEP({
    *         SEP:Comma,
    *         DEF: () => {
    *             this.CONSUME(Number};
    *             // ...
    *         })
    * ```
    *
    * Note that because this DSL method always requires more than one argument the options object is always required
    * and it is not possible to use a shorter form like in the MANY DSL method.
    *
    * Note that for the purposes of deciding on whether or not another iteration exists
    * Only a single Token is examined (The separator). Therefore if the grammar being implemented is
    * so "crazy" to require multiple tokens to identify an item separator please use the more basic DSL methods
    * to implement it.
    *
    * As in CONSUME the index in the method name indicates the occurrence
    * of the repetition production in it's top rule.
    *
    * @param options - An object defining the grammar of each iteration and the separator between iterations
    *
    */
  /* protected */ def MANY_SEP(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP1(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP2(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP3(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP4(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP5(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP6(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP7(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP8(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /**
    * @see MANY_SEP
    * @hidden
    */
  /* protected */ def MANY_SEP9(options: ManySepMethodOpts[Any]): Unit = js.native
  
  /* protected */ def OPTION[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * Parsing DSL Method that Indicates an Optional production.
    * in EBNF notation this is equivalent to: "[...]".
    *
    * Note that there are two syntax forms:
    * - Passing the grammar action directly:
    *   ```
    *     this.OPTION(() => {
    *       this.CONSUME(Digit)}
    *     );
    *   ```
    *
    * - using an "options" object:
    *   ```
    *     this.OPTION({
    *       GATE:predicateFunc,
    *       DEF: () => {
    *         this.CONSUME(Digit)
    *     }});
    *   ```
    *
    * The optional 'GATE' property in "options" object form can be used to add constraints
    * to invoking the grammar action.
    *
    * As in CONSUME the index in the method name indicates the occurrence
    * of the optional production in it's top rule.
    *
    * @param  actionORMethodDef - The grammar action to optionally invoke once
    *                             or an "OPTIONS" object describing the grammar action and optional properties.
    *
    * @returns The `GrammarAction` return value (OUT) if the optional syntax is encountered
    *          or `undefined` if not.
    */
  /* protected */ def OPTION[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION1[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION1[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION2[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION2[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION3[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION3[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION4[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION4[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION5[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION5[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION6[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION6[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION7[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION7[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION8[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION8[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OPTION9[OUT](actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * @see OPTION
    * @hidden
    */
  /* protected */ def OPTION9[OUT](actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /* protected */ def OR(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  
  /* protected */ def OR1(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR1(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR1")
  def OR1_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR1")
  def OR1_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR2(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR2(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR2")
  def OR2_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR2")
  def OR2_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR3(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR3(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR3")
  def OR3_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR3")
  def OR3_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR4(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR4(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR4")
  def OR4_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR4")
  def OR4_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR5(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR5(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR5")
  def OR5_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR5")
  def OR5_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR6(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR6(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR6")
  def OR6_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR6")
  def OR6_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR7(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR7(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR7")
  def OR7_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR7")
  def OR7_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR8(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR8(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR8")
  def OR8_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR8")
  def OR8_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /* protected */ def OR9(altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def OR9(altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /**
    * @see OR
    * @hidden
    */
  /* protected */ @JSName("OR9")
  def OR9_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR9")
  def OR9_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /**
    * Parsing DSL method that indicates a choice between a set of alternatives must be made.
    * This is equivalent to an EBNF alternation (A | B | C | D ...), except
    * that the alternatives are ordered like in a PEG grammar.
    * This means that the **first** matching alternative is always chosen.
    *
    * There are several forms for the inner alternatives array:
    *
    * - Passing alternatives array directly:
    *   ```
    *     this.OR([
    *       { ALT:() => { this.CONSUME(One) }},
    *       { ALT:() => { this.CONSUME(Two) }},
    *       { ALT:() => { this.CONSUME(Three) }}
    *     ])
    *   ```
    *
    * - Passing alternative array directly with predicates (GATE):
    *   ```
    *     this.OR([
    *       { GATE: predicateFunc1, ALT:() => { this.CONSUME(One) }},
    *       { GATE: predicateFuncX, ALT:() => { this.CONSUME(Two) }},
    *       { GATE: predicateFuncX, ALT:() => { this.CONSUME(Three) }}
    *     ])
    *   ```
    *
    * - These syntax forms can also be mixed:
    *   ```
    *     this.OR([
    *       {
    *         GATE: predicateFunc1,
    *         ALT:() => { this.CONSUME(One) }
    *       },
    *       { ALT:() => { this.CONSUME(Two) }},
    *       { ALT:() => { this.CONSUME(Three) }}
    *     ])
    *   ```
    *
    * - Additionally an "options" object may be used:
    *   ```
    *     this.OR({
    *       DEF:[
    *         { ALT:() => { this.CONSUME(One) }},
    *         { ALT:() => { this.CONSUME(Two) }},
    *         { ALT:() => { this.CONSUME(Three) }}
    *       ],
    *       // OPTIONAL property
    *       ERR_MSG: "A Number"
    *     })
    *   ```
    *
    * The 'predicateFuncX' in the long form can be used to add constraints to choosing the alternative.
    *
    * As in CONSUME the index in the method name indicates the occurrence
    * of the alternation production in it's top rule.
    *
    * @param altsOrOpts - A set of alternatives or an "OPTIONS" object describing the alternatives and optional properties.
    *
    * @returns The result of invoking the chosen alternative.
    */
  /* protected */ @JSName("OR")
  def OR_T_T[T](altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("OR")
  def OR_T_T[T](altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /**
    * Flag indicating the Parser is at the recording phase.
    * Can be used to implement methods similar to {@link BaseParser.ACTION}
    * Or any other logic to requires knowledge of the recording phase.
    * See:
    *   - https://chevrotain.io/docs/guide/internals.html#grammar-recording
    * to learn more on the recording phase and how Chevrotain works.
    */
  var RECORDING_PHASE: Boolean = js.native
  
  /**
    * Will consume a single token and return the **next** token, meaning
    * the token **after** the skipped token.
    */
  /* protected */ def SKIP_TOKEN(): IToken = js.native
  
  /* protected */ def atLeastOne(idx: Double, actionORMethodDef: DSLMethodOptsWithErr[Any]): Unit = js.native
  /**
    * Like `AT_LEAST_ONE` with the numerical suffix as a parameter, e.g:
    * atLeastOne(0, X) === AT_LEAST_ONE(X)
    * atLeastOne(1, X) === AT_LEAST_ONE1(X)
    * atLeastOne(2, X) === AT_LEAST_ONE2(X)
    * ...
    * @see AT_LEAST_ONE
    */
  /* protected */ def atLeastOne(idx: Double, actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /**
    * By default, all token types may be deleted. This behavior may be overridden in inheriting parsers.
    * The method receives the expected token type. The token that would be deleted can be received with {@link LA}.
    */
  /* protected */ def canTokenTypeBeDeletedInRecovery(tokType: TokenType): Boolean = js.native
  
  /**
    * By default, all tokens type may be inserted. This behavior may be overridden in inheriting Recognizers
    * for example: One may decide that only punctuation tokens may be inserted automatically as they have no additional
    * semantic value. (A mandatory semicolon has no additional semantic meaning, but an Integer may have additional meaning
    * depending on its int value and context (Inserting an integer 0 in cardinality: "[1..]" will cause semantic issues
    * as the max of the cardinality will be greater than the min value (and this is a false error!).
    */
  /* protected */ def canTokenTypeBeInsertedInRecovery(tokType: TokenType): Boolean = js.native
  
  /**
    * @param startRuleName
    * @param precedingInput - The token vector up to (not including) the content assist point
    */
  def computeContentAssist(startRuleName: String, precedingInput: js.Array[IToken]): js.Array[ISyntacticContentAssistPath] = js.native
  
  /**
    * Like `CONSUME` with the numerical suffix as a parameter, e.g:
    * consume(0, X) === CONSUME(X)
    * consume(1, X) === CONSUME1(X)
    * consume(2, X) === CONSUME2(X)
    * ...
    * @see CONSUME
    */
  /* protected */ def consume(idx: Double, tokType: TokenType): IToken = js.native
  /* protected */ def consume(idx: Double, tokType: TokenType, options: ConsumeMethodOpts): IToken = js.native
  
  var errors: js.Array[IRecognitionException] = js.native
  
  def getBaseCstVisitorConstructor[IN, OUT](): Instantiable[IN, OUT] = js.native
  
  def getBaseCstVisitorConstructorWithDefaults[IN, OUT](): Instantiable[IN, OUT] = js.native
  
  def getGAstProductions(): Record[String, Rule] = js.native
  
  /**
    * @deprecated - will be removed in the future
    */
  /* protected */ def getNextPossibleTokenTypes(grammarPath: ITokenGrammarPath): js.Array[TokenType] = js.native
  
  def getSerializedGastProductions(): js.Array[ISerializedGast] = js.native
  
  /**
    * Returns an "imaginary" Token to insert when Single Token Insertion is done
    * Override this if you require special behavior in your grammar.
    * For example if an IntegerToken is required provide one with the image '0' so it would be valid syntactically.
    */
  /* protected */ def getTokenToInsert(tokType: TokenType): IToken = js.native
  
  var input: js.Array[IToken] = js.native
  
  /* protected */ def many(idx: Double, actionORMethodDef: DSLMethodOpts[Any]): Unit = js.native
  /**
    * Like `MANY` with the numerical suffix as a parameter, e.g:
    * many(0, X) === MANY(X)
    * many(1, X) === MANY1(X)
    * many(2, X) === MANY2(X)
    * ...
    * @see MANY
    */
  /* protected */ def many(idx: Double, actionORMethodDef: GrammarAction[Any]): Unit = js.native
  
  /* protected */ def option[OUT](idx: Double, actionORMethodDef: DSLMethodOpts[OUT]): js.UndefOr[OUT] = js.native
  /**
    * Like `OPTION` with the numerical suffix as a parameter, e.g:
    * option(0, X) === OPTION(X)
    * option(1, X) === OPTION1(X)
    * option(2, X) === OPTION2(X)
    * ...
    * @see OPTION
    */
  /* protected */ def option[OUT](idx: Double, actionORMethodDef: GrammarAction[OUT]): js.UndefOr[OUT] = js.native
  
  /**
    * Like `OR` with the numerical suffix as a parameter, e.g:
    * or(0, X) === OR(X)
    * or(1, X) === OR1(X)
    * or(2, X) === OR2(X)
    * ...
    * @see OR
    */
  /* protected */ def or(idx: Double, altsOrOpts: js.Array[IOrAlt[Any]]): Any = js.native
  /* protected */ def or(idx: Double, altsOrOpts: OrMethodOpts[Any]): Any = js.native
  /* protected */ @JSName("or")
  def or_T_T[T](idx: Double, altsOrOpts: js.Array[IOrAlt[T]]): T = js.native
  /* protected */ @JSName("or")
  def or_T_T[T](idx: Double, altsOrOpts: OrMethodOpts[T]): T = js.native
  
  /**
    * This must be called at the end of a Parser constructor.
    * See: http://chevrotain.io/docs/tutorial/step2_parsing.html#under-the-hood
    */
  /* protected */ def performSelfAnalysis(): Unit = js.native
  
  /**
    * Resets the parser state, should be overridden for custom parsers which "carry" additional state.
    * When overriding, remember to also invoke the super implementation!
    */
  def reset(): Unit = js.native
}
