package typings.chevrotainTypes.mod

import typings.chevrotainTypes.anon.DynamicTokensEnabled
import typings.chevrotainTypes.anon.GrammarName
import typings.chevrotainTypes.anon.ProdOccurrence
import typings.chevrotainTypes.anon.Rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookaheadStrategy extends StObject {
  
  /**
    * Builds a lookahead function for alternations/`OR` parser methods.
    *
    * @param options.prodOccurrence The occurrence number of this `OR` within its rule.
    *
    * @param options.rule The rule that contains this `OR`.
    *
    * @param options.maxLookahead The maximum amount of lookahead for this `OR`.
    *
    * @param options.hasPredicates Whether any of the alternatives contain a predicate.
    *
    * @param options.dynamicTokensEnabled Whether dynamic tokens are enabled for this parser.
    *
    * @returns A function that is able to compute which of the alternatives to choose while parsing.
    */
  def buildLookaheadForAlternation(options: DynamicTokensEnabled): js.Function1[/* orAlts */ js.UndefOr[js.Array[IOrAlt[Any]]], js.UndefOr[Double]]
  
  /**
    * Builds a lookahead function for optional productions.
    *
    * @param options.prodOccurrence The occurrence number of this production within its rule.
    *
    * @param options.prodType The type of this production.
    *
    * @param options.rule The rule that contains this production.
    *
    * @param options.maxLookahead The maximum amount of lookahead for this production.
    *
    * @param options.dynamicTokensEnabled Whether dynamic tokens are enabled for this parser.
    *
    * @returns A function is able to compute whether to parse the production or to continue with the rest of the parser rule.
    */
  def buildLookaheadForOptional(options: ProdOccurrence): js.Function0[Boolean]
  
  /**
    * Initializes the lookahead for a grammar.
    *
    * Note that this method does not build the lookahead functions.
    * It only initializes the internal state of the strategy based on all grammar rules.
    *
    * @param options.rules All parser rules of the grammar.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ Rules, Unit]] = js.undefined
  
  /**
    * Performs validations on the grammar specific to this lookahead strategy.
    * This method is not called if parser validations are disabled.
    *
    * @param options.rules All parser rules of the grammar.
    *
    * @param options.tokenTypes All token types of the grammar.
    *
    * @param options.grammarName The name of the grammar.
    */
  def validate(options: GrammarName): js.Array[ILookaheadValidationError]
}
object ILookaheadStrategy {
  
  inline def apply(
    buildLookaheadForAlternation: DynamicTokensEnabled => js.Function1[/* orAlts */ js.UndefOr[js.Array[IOrAlt[Any]]], js.UndefOr[Double]],
    buildLookaheadForOptional: ProdOccurrence => js.Function0[Boolean],
    validate: GrammarName => js.Array[ILookaheadValidationError]
  ): ILookaheadStrategy = {
    val __obj = js.Dynamic.literal(buildLookaheadForAlternation = js.Any.fromFunction1(buildLookaheadForAlternation), buildLookaheadForOptional = js.Any.fromFunction1(buildLookaheadForOptional), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[ILookaheadStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILookaheadStrategy] (val x: Self) extends AnyVal {
    
    inline def setBuildLookaheadForAlternation(
      value: DynamicTokensEnabled => js.Function1[/* orAlts */ js.UndefOr[js.Array[IOrAlt[Any]]], js.UndefOr[Double]]
    ): Self = StObject.set(x, "buildLookaheadForAlternation", js.Any.fromFunction1(value))
    
    inline def setBuildLookaheadForOptional(value: ProdOccurrence => js.Function0[Boolean]): Self = StObject.set(x, "buildLookaheadForOptional", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: /* options */ Rules => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setValidate(value: GrammarName => js.Array[ILookaheadValidationError]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
