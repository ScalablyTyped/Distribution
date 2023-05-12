package typings.cssnanoPresetDefault

import typings.cssnanoPresetDefault.anon.Exclude
import typings.cssnanoPresetDefault.anon.Optionsexcludetrueundefin
import typings.cssnanoPresetDefault.anon.OptionsexcludetrueundefinAdd
import typings.cssnanoPresetDefault.anon.OptionsexcludetrueundefinAngle
import typings.cssnanoPresetDefault.anon.OptionsexcludetrueundefinDatauri
import typings.cssnanoPresetDefault.anon.OptionsexcludetrueundefinExclude
import typings.cssnanoPresetDefault.anon.OptionsexcludetrueundefinPreferredQuote
import typings.cssnanoPresetDefault.anon.Plugins
import typings.cssnanoPresetDefault.anon.PostCssCalcOptionsexclude
import typings.cssnanoPresetDefault.cssnanoPresetDefaultBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Options} opts
    * @return {{plugins: [import('postcss').PluginCreator<any>, boolean | Record<string, any> | undefined][]}}
    */
  inline def apply(): Plugins = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugins]
  inline def apply(opts: Options): Plugins = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugins]
  
  @JSImport("cssnano-preset-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var calc: js.UndefOr[`false` | PostCssCalcOptionsexclude] = js.undefined
    
    var colormin: js.UndefOr[`false` | ((Record[String, Any]) & Exclude)] = js.undefined
    
    var convertValues: js.UndefOr[`false` | OptionsexcludetrueundefinAngle] = js.undefined
    
    var discardComments: js.UndefOr[`false` | Optionsexcludetrueundefin] = js.undefined
    
    var discardDuplicates: js.UndefOr[`false` | Exclude] = js.undefined
    
    var discardEmpty: js.UndefOr[`false` | Exclude] = js.undefined
    
    var discardOverridden: js.UndefOr[`false` | Exclude] = js.undefined
    
    var mergeLonghand: js.UndefOr[`false` | Exclude] = js.undefined
    
    var mergeRules: js.UndefOr[`false` | Exclude] = js.undefined
    
    var minifyFontValues: js.UndefOr[`false` | OptionsexcludetrueundefinExclude] = js.undefined
    
    var minifyGradients: js.UndefOr[`false` | Exclude] = js.undefined
    
    var minifyParams: js.UndefOr[`false` | Exclude] = js.undefined
    
    var minifySelectors: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeCharset: js.UndefOr[`false` | OptionsexcludetrueundefinAdd] = js.undefined
    
    var normalizeDisplayValues: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizePositions: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeRepeatStyle: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeString: js.UndefOr[`false` | OptionsexcludetrueundefinPreferredQuote] = js.undefined
    
    var normalizeTimingFunctions: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeUnicode: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeUrl: js.UndefOr[`false` | Exclude] = js.undefined
    
    var normalizeWhitespace: js.UndefOr[`false` | Exclude] = js.undefined
    
    var orderedValues: js.UndefOr[`false` | Exclude] = js.undefined
    
    var rawCache: js.UndefOr[`false` | Exclude] = js.undefined
    
    var reduceInitial: js.UndefOr[`false` | Exclude] = js.undefined
    
    var reduceTransforms: js.UndefOr[`false` | Exclude] = js.undefined
    
    var svgo: js.UndefOr[`false` | OptionsexcludetrueundefinDatauri] = js.undefined
    
    var uniqueSelectors: js.UndefOr[`false` | Exclude] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCalc(value: `false` | PostCssCalcOptionsexclude): Self = StObject.set(x, "calc", value.asInstanceOf[js.Any])
      
      inline def setCalcUndefined: Self = StObject.set(x, "calc", js.undefined)
      
      inline def setColormin(value: `false` | ((Record[String, Any]) & Exclude)): Self = StObject.set(x, "colormin", value.asInstanceOf[js.Any])
      
      inline def setColorminUndefined: Self = StObject.set(x, "colormin", js.undefined)
      
      inline def setConvertValues(value: `false` | OptionsexcludetrueundefinAngle): Self = StObject.set(x, "convertValues", value.asInstanceOf[js.Any])
      
      inline def setConvertValuesUndefined: Self = StObject.set(x, "convertValues", js.undefined)
      
      inline def setDiscardComments(value: `false` | Optionsexcludetrueundefin): Self = StObject.set(x, "discardComments", value.asInstanceOf[js.Any])
      
      inline def setDiscardCommentsUndefined: Self = StObject.set(x, "discardComments", js.undefined)
      
      inline def setDiscardDuplicates(value: `false` | Exclude): Self = StObject.set(x, "discardDuplicates", value.asInstanceOf[js.Any])
      
      inline def setDiscardDuplicatesUndefined: Self = StObject.set(x, "discardDuplicates", js.undefined)
      
      inline def setDiscardEmpty(value: `false` | Exclude): Self = StObject.set(x, "discardEmpty", value.asInstanceOf[js.Any])
      
      inline def setDiscardEmptyUndefined: Self = StObject.set(x, "discardEmpty", js.undefined)
      
      inline def setDiscardOverridden(value: `false` | Exclude): Self = StObject.set(x, "discardOverridden", value.asInstanceOf[js.Any])
      
      inline def setDiscardOverriddenUndefined: Self = StObject.set(x, "discardOverridden", js.undefined)
      
      inline def setMergeLonghand(value: `false` | Exclude): Self = StObject.set(x, "mergeLonghand", value.asInstanceOf[js.Any])
      
      inline def setMergeLonghandUndefined: Self = StObject.set(x, "mergeLonghand", js.undefined)
      
      inline def setMergeRules(value: `false` | Exclude): Self = StObject.set(x, "mergeRules", value.asInstanceOf[js.Any])
      
      inline def setMergeRulesUndefined: Self = StObject.set(x, "mergeRules", js.undefined)
      
      inline def setMinifyFontValues(value: `false` | OptionsexcludetrueundefinExclude): Self = StObject.set(x, "minifyFontValues", value.asInstanceOf[js.Any])
      
      inline def setMinifyFontValuesUndefined: Self = StObject.set(x, "minifyFontValues", js.undefined)
      
      inline def setMinifyGradients(value: `false` | Exclude): Self = StObject.set(x, "minifyGradients", value.asInstanceOf[js.Any])
      
      inline def setMinifyGradientsUndefined: Self = StObject.set(x, "minifyGradients", js.undefined)
      
      inline def setMinifyParams(value: `false` | Exclude): Self = StObject.set(x, "minifyParams", value.asInstanceOf[js.Any])
      
      inline def setMinifyParamsUndefined: Self = StObject.set(x, "minifyParams", js.undefined)
      
      inline def setMinifySelectors(value: `false` | Exclude): Self = StObject.set(x, "minifySelectors", value.asInstanceOf[js.Any])
      
      inline def setMinifySelectorsUndefined: Self = StObject.set(x, "minifySelectors", js.undefined)
      
      inline def setNormalizeCharset(value: `false` | OptionsexcludetrueundefinAdd): Self = StObject.set(x, "normalizeCharset", value.asInstanceOf[js.Any])
      
      inline def setNormalizeCharsetUndefined: Self = StObject.set(x, "normalizeCharset", js.undefined)
      
      inline def setNormalizeDisplayValues(value: `false` | Exclude): Self = StObject.set(x, "normalizeDisplayValues", value.asInstanceOf[js.Any])
      
      inline def setNormalizeDisplayValuesUndefined: Self = StObject.set(x, "normalizeDisplayValues", js.undefined)
      
      inline def setNormalizePositions(value: `false` | Exclude): Self = StObject.set(x, "normalizePositions", value.asInstanceOf[js.Any])
      
      inline def setNormalizePositionsUndefined: Self = StObject.set(x, "normalizePositions", js.undefined)
      
      inline def setNormalizeRepeatStyle(value: `false` | Exclude): Self = StObject.set(x, "normalizeRepeatStyle", value.asInstanceOf[js.Any])
      
      inline def setNormalizeRepeatStyleUndefined: Self = StObject.set(x, "normalizeRepeatStyle", js.undefined)
      
      inline def setNormalizeString(value: `false` | OptionsexcludetrueundefinPreferredQuote): Self = StObject.set(x, "normalizeString", value.asInstanceOf[js.Any])
      
      inline def setNormalizeStringUndefined: Self = StObject.set(x, "normalizeString", js.undefined)
      
      inline def setNormalizeTimingFunctions(value: `false` | Exclude): Self = StObject.set(x, "normalizeTimingFunctions", value.asInstanceOf[js.Any])
      
      inline def setNormalizeTimingFunctionsUndefined: Self = StObject.set(x, "normalizeTimingFunctions", js.undefined)
      
      inline def setNormalizeUnicode(value: `false` | Exclude): Self = StObject.set(x, "normalizeUnicode", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUnicodeUndefined: Self = StObject.set(x, "normalizeUnicode", js.undefined)
      
      inline def setNormalizeUrl(value: `false` | Exclude): Self = StObject.set(x, "normalizeUrl", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUrlUndefined: Self = StObject.set(x, "normalizeUrl", js.undefined)
      
      inline def setNormalizeWhitespace(value: `false` | Exclude): Self = StObject.set(x, "normalizeWhitespace", value.asInstanceOf[js.Any])
      
      inline def setNormalizeWhitespaceUndefined: Self = StObject.set(x, "normalizeWhitespace", js.undefined)
      
      inline def setOrderedValues(value: `false` | Exclude): Self = StObject.set(x, "orderedValues", value.asInstanceOf[js.Any])
      
      inline def setOrderedValuesUndefined: Self = StObject.set(x, "orderedValues", js.undefined)
      
      inline def setRawCache(value: `false` | Exclude): Self = StObject.set(x, "rawCache", value.asInstanceOf[js.Any])
      
      inline def setRawCacheUndefined: Self = StObject.set(x, "rawCache", js.undefined)
      
      inline def setReduceInitial(value: `false` | Exclude): Self = StObject.set(x, "reduceInitial", value.asInstanceOf[js.Any])
      
      inline def setReduceInitialUndefined: Self = StObject.set(x, "reduceInitial", js.undefined)
      
      inline def setReduceTransforms(value: `false` | Exclude): Self = StObject.set(x, "reduceTransforms", value.asInstanceOf[js.Any])
      
      inline def setReduceTransformsUndefined: Self = StObject.set(x, "reduceTransforms", js.undefined)
      
      inline def setSvgo(value: `false` | OptionsexcludetrueundefinDatauri): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      inline def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
      
      inline def setUniqueSelectors(value: `false` | Exclude): Self = StObject.set(x, "uniqueSelectors", value.asInstanceOf[js.Any])
      
      inline def setUniqueSelectorsUndefined: Self = StObject.set(x, "uniqueSelectors", js.undefined)
    }
  }
}
