package typings.chevrotainTypes.mod

import typings.chevrotainTypes.chevrotainTypesStrings.full
import typings.chevrotainTypes.chevrotainTypesStrings.onlyOffset
import typings.chevrotainTypes.chevrotainTypesStrings.onlyStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILexerConfig extends StObject {
  
  /**
    * An optional flag indicating that lexer definition errors
    * should not automatically cause an error to be raised.
    * This can be useful when wishing to indicate lexer errors in another manner
    * than simply throwing an error (for example in an online playground).
    */
  var deferDefinitionErrorsHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true this flag will cause the Lexer to throw an Error
    * When it is unable to perform all of its performance optimizations.
    *
    * In addition error messages will be printed to the console with details
    * how to resolve the optimizations issues.
    *
    * Use this flag to guarantee higher lexer performance.
    * The optimizations can boost the lexer's performance anywhere from 30%
    * to 100%+ depending on the number of TokenTypes used.
    */
  var ensureOptimizations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom error message provider.
    * Can be used to override the default error messages.
    * For example:
    *   - Translating the error messages to a different languages.
    *   - Changing the formatting.
    */
  var errorMessageProvider: js.UndefOr[ILexerErrorMessageProvider] = js.undefined
  
  /**
    * Characters or CharCodes that represent line terminators for this lexer.
    * This always needs to be provided when using a custom {@link ILexerConfig.lineTerminatorsPattern}.
    * In the future this duplication may be removed or reduced.
    */
  var lineTerminatorCharacters: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * A regExp defining custom line terminators.
    * This will be used to calculate the line and column information.
    *
    * Note that the regExp should use the global flag, for example: /\n/g
    *
    * The default is: /\n|\r\n?/g
    *
    * But some grammars have a different definition, for example in ECMAScript:
    * https://www.ecma-international.org/ecma-262/8.0/index.html#sec-line-terminators
    * U+2028 and U+2029 are also treated as line terminators.
    *
    * In that case we would use /\n|\r|\\u2028|\\u2029/g
    *
    * Note that it is also possible to supply an optimized RegExp like implementation
    * as only a subset of the RegExp APIs is needed, {@link ILineTerminatorsTester}
    * for details.
    *
    * keep in mind that for the default pattern: /\n|\r\n?/g an optimized implementation is already built-in.
    * This means the optimization is only relevant for lexers overriding the default pattern.
    */
  var lineTerminatorsPattern: js.UndefOr[js.RegExp | ILineTerminatorsTester] = js.undefined
  
  /**
    * "full" location information means all six combinations of /(end|start)(Line|Column|Offset)/ properties.
    * "onlyStart" means that only startLine, startColumn and startOffset will be tracked
    * "onlyOffset" means that only the startOffset will be tracked.
    *
    * The less position tracking the faster the Lexer will be and the less memory used.
    * However the difference is not large (~10% On V8), thus reduced location tracking options should only be used
    * in edge cases where every last ounce of performance is needed.
    */
  // TODO: consider renaming this to LocationTracking to align with NodeLocationTracking option on the ParserConfig.
  var positionTracking: js.UndefOr[full | onlyStart | onlyOffset] = js.undefined
  
  /**
    * Should the lexer halt on the **first** error, or continue attempting to tokenize by dropping characters
    * until a match is found or the end of input is reached.
    *
    * Setting `recoveryEnabled` to `false` is useful when you want to **halt quickly** on faulty inputs,
    * particularly when dealing with **large** faulty inputs.
    *
    * By default, `recoveryEnabled` is `true`
    */
  var recoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be used to disable lexer optimizations
    * If there is a suspicion they are causing incorrect behavior.
    * Note that this would have negative performance implications.
    */
  var safeMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This flag will avoid running the Lexer validations during Lexer initialization.
    *
    * This can substantially improve the Lexer's initialization (constructor) time.
    * @see ILexerConfig.traceInitPerf to measure the Lexer validations cost for your Lexer.
    *
    * Note that the Lexer validations are **extremely useful** during development time,
    * e.g: Detecting empty/invalid regExp Patterns.
    * So they should not be skipped during development flows.
    *   - For example: via a conditional that checks an env variable.
    */
  var skipValidations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enabling this flag will print performance tracing logs during lexer
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
object ILexerConfig {
  
  inline def apply(): ILexerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILexerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILexerConfig] (val x: Self) extends AnyVal {
    
    inline def setDeferDefinitionErrorsHandling(value: Boolean): Self = StObject.set(x, "deferDefinitionErrorsHandling", value.asInstanceOf[js.Any])
    
    inline def setDeferDefinitionErrorsHandlingUndefined: Self = StObject.set(x, "deferDefinitionErrorsHandling", js.undefined)
    
    inline def setEnsureOptimizations(value: Boolean): Self = StObject.set(x, "ensureOptimizations", value.asInstanceOf[js.Any])
    
    inline def setEnsureOptimizationsUndefined: Self = StObject.set(x, "ensureOptimizations", js.undefined)
    
    inline def setErrorMessageProvider(value: ILexerErrorMessageProvider): Self = StObject.set(x, "errorMessageProvider", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageProviderUndefined: Self = StObject.set(x, "errorMessageProvider", js.undefined)
    
    inline def setLineTerminatorCharacters(value: js.Array[Double | String]): Self = StObject.set(x, "lineTerminatorCharacters", value.asInstanceOf[js.Any])
    
    inline def setLineTerminatorCharactersUndefined: Self = StObject.set(x, "lineTerminatorCharacters", js.undefined)
    
    inline def setLineTerminatorCharactersVarargs(value: (Double | String)*): Self = StObject.set(x, "lineTerminatorCharacters", js.Array(value*))
    
    inline def setLineTerminatorsPattern(value: js.RegExp | ILineTerminatorsTester): Self = StObject.set(x, "lineTerminatorsPattern", value.asInstanceOf[js.Any])
    
    inline def setLineTerminatorsPatternUndefined: Self = StObject.set(x, "lineTerminatorsPattern", js.undefined)
    
    inline def setPositionTracking(value: full | onlyStart | onlyOffset): Self = StObject.set(x, "positionTracking", value.asInstanceOf[js.Any])
    
    inline def setPositionTrackingUndefined: Self = StObject.set(x, "positionTracking", js.undefined)
    
    inline def setRecoveryEnabled(value: Boolean): Self = StObject.set(x, "recoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setRecoveryEnabledUndefined: Self = StObject.set(x, "recoveryEnabled", js.undefined)
    
    inline def setSafeMode(value: Boolean): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
    
    inline def setSkipValidations(value: Boolean): Self = StObject.set(x, "skipValidations", value.asInstanceOf[js.Any])
    
    inline def setSkipValidationsUndefined: Self = StObject.set(x, "skipValidations", js.undefined)
    
    inline def setTraceInitPerf(value: Boolean | Double): Self = StObject.set(x, "traceInitPerf", value.asInstanceOf[js.Any])
    
    inline def setTraceInitPerfUndefined: Self = StObject.set(x, "traceInitPerf", js.undefined)
  }
}
