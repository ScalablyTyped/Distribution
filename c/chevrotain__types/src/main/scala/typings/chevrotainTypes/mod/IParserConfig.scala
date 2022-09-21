package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParserConfig extends StObject {
  
  /**
    * Enable This Flag to to support Dynamically defined Tokens.
    * This will disable performance optimizations which cannot work if the whole Token vocabulary is not known
    * During Parser initialization.
    *
    * See [runnable example](https://github.com/chevrotain/chevrotain/tree/master/examples/parser/dynamic_tokens)
    */
  var dynamicTokensEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom error message provider.
    * Can be used to override the default error messages.
    * For example:
    *   - Translating the error messages to a different languages.
    *   - Changing the formatting.
    *   - Providing special error messages under certain conditions, e.g: missing semicolons.
    */
  var errorMessageProvider: js.UndefOr[IParserErrorMessageProvider] = js.undefined
  
  /**
    * Maximum number of tokens the parser will use to choose between alternatives.
    * By default this value is `4`.
    * In the future it may be reduced to `3` due to performance considerations.
    */
  var maxLookahead: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable computation of CST nodes location.
    * By default this is set to "none", meaning this feature is disabled.
    * See: http://chevrotain.io/docs/guide/concrete_syntax_tree.html#cstnode-location
    * For more details.
    */
  var nodeLocationTracking: js.UndefOr[nodeLocationTrackingOptions] = js.undefined
  
  /**
    * Is the error recovery / fault tolerance of the Chevrotain Parser enabled.
    */
  var recoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This flag will avoid running the grammar validations during Parser initialization.
    *
    * This can substantially improve the Parser's initialization (constructor) time.
    * @see IParserConfig.traceInitPerf to measure the grammar validations cost for your parser.
    *
    * Note that the grammar validations are **extremely useful** during development time,
    * e.g: detecting ambiguities / left recursion.
    * So they should not be skipped during development flows.
    *   - For example: via a conditional that checks an env variable.
    */
  var skipValidations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enabling this flag will print performance tracing logs during parser
    * Initialization (constructor invocation), this is useful to narrow down the cause
    * of the initialization performance problem.
    *
    * You can also pass a numerical value which affects the verbosity
    * of the traces, this number is the maximum nesting level of the traces, e.g:
    * 0: Traces disabled === 'false'
    * 1: Top Level traces only.
    * 2: One level of nested inner traces.
    * ...
    *
    * Note that passing the boolean `true` is identical to passing the numerical value `infinity`
    */
  var traceInitPerf: js.UndefOr[Boolean | Double] = js.undefined
}
object IParserConfig {
  
  inline def apply(): IParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParserConfig]
  }
  
  extension [Self <: IParserConfig](x: Self) {
    
    inline def setDynamicTokensEnabled(value: Boolean): Self = StObject.set(x, "dynamicTokensEnabled", value.asInstanceOf[js.Any])
    
    inline def setDynamicTokensEnabledUndefined: Self = StObject.set(x, "dynamicTokensEnabled", js.undefined)
    
    inline def setErrorMessageProvider(value: IParserErrorMessageProvider): Self = StObject.set(x, "errorMessageProvider", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageProviderUndefined: Self = StObject.set(x, "errorMessageProvider", js.undefined)
    
    inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
    
    inline def setMaxLookaheadUndefined: Self = StObject.set(x, "maxLookahead", js.undefined)
    
    inline def setNodeLocationTracking(value: nodeLocationTrackingOptions): Self = StObject.set(x, "nodeLocationTracking", value.asInstanceOf[js.Any])
    
    inline def setNodeLocationTrackingUndefined: Self = StObject.set(x, "nodeLocationTracking", js.undefined)
    
    inline def setRecoveryEnabled(value: Boolean): Self = StObject.set(x, "recoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setRecoveryEnabledUndefined: Self = StObject.set(x, "recoveryEnabled", js.undefined)
    
    inline def setSkipValidations(value: Boolean): Self = StObject.set(x, "skipValidations", value.asInstanceOf[js.Any])
    
    inline def setSkipValidationsUndefined: Self = StObject.set(x, "skipValidations", js.undefined)
    
    inline def setTraceInitPerf(value: Boolean | Double): Self = StObject.set(x, "traceInitPerf", value.asInstanceOf[js.Any])
    
    inline def setTraceInitPerfUndefined: Self = StObject.set(x, "traceInitPerf", js.undefined)
  }
}
