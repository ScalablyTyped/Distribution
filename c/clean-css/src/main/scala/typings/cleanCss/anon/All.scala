package typings.cleanCss.anon

import typings.cleanCss.cleanCssStrings.natural
import typings.cleanCss.cleanCssStrings.none
import typings.cleanCss.cleanCssStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait All extends js.Object {
  
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `@charset` moving to the front of a stylesheet; defaults to `true`
    */
  var cleanupCharsets: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls URL normalization; defaults to `true`
    */
  var normalizeUrls: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `background` property optimizations; defaults to `true`
    */
  var optimizeBackground: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `border-radius` property optimizations; defaults to `true`
    */
  var optimizeBorderRadius: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `filter` property optimizations; defaults to `true`
    */
  var optimizeFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `font` property optimizations; defaults to `true`
    */
  var optimizeFont: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `font-weight` property optimizations; defaults to `true`
    */
  var optimizeFontWeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls `outline` property optimizations; defaults to `true`
    */
  var optimizeOutline: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls removing negative paddings; defaults to `true`
    */
  var removeNegativePaddings: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls removing quotes when unnecessary; defaults to `true`
    */
  var removeQuotes: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls removing unused whitespace; defaults to `true`
    */
  var removeWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Contols removing redundant zeros; defaults to `true`
    */
  var replaceMultipleZeros: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls replacing time units with shorter values; defaults to `true`
    */
  var replaceTimeUnits: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls replacing zero values with units; defaults to `true`
    */
  var replaceZeroUnits: js.UndefOr[Boolean] = js.native
  
  /**
    * Rounds pixel values to `N` decimal places; `false` disables rounding; defaults to `false`
    */
  var roundingPrecision: js.UndefOr[Boolean] = js.native
  
  /**
    * denotes selector sorting method; can be `'natural'` or `'standard'`, `'none'`, or false (the last two
    * since 4.1.0); defaults to `'standard'`
    */
  var selectorsSortingMethod: js.UndefOr[standard | natural | none] = js.native
  
  /**
    * denotes a number of / *! ... * / comments preserved; defaults to `all`
    */
  var specialComments: js.UndefOr[String] = js.native
  
  /**
    * Controls at-rules (e.g. `@charset`, `@import`) optimizing; defaults to `true`
    */
  var tidyAtRules: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls block scopes (e.g. `@media`) optimizing; defaults to `true`
    */
  var tidyBlockScopes: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls selectors optimizing; defaults to `true`
    */
  var tidySelectors: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines a callback for fine-grained property optimization; defaults to no-op
    */
  var transform: js.UndefOr[
    js.Function3[
      /* propertyName */ String, 
      /* propertyValue */ String, 
      /* selector */ js.UndefOr[String], 
      String
    ]
  ] = js.native
}
object All {
  
  @scala.inline
  def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setCleanupCharsets(value: Boolean): Self = this.set("cleanupCharsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanupCharsets: Self = this.set("cleanupCharsets", js.undefined)
    
    @scala.inline
    def setNormalizeUrls(value: Boolean): Self = this.set("normalizeUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeUrls: Self = this.set("normalizeUrls", js.undefined)
    
    @scala.inline
    def setOptimizeBackground(value: Boolean): Self = this.set("optimizeBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeBackground: Self = this.set("optimizeBackground", js.undefined)
    
    @scala.inline
    def setOptimizeBorderRadius(value: Boolean): Self = this.set("optimizeBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeBorderRadius: Self = this.set("optimizeBorderRadius", js.undefined)
    
    @scala.inline
    def setOptimizeFilter(value: Boolean): Self = this.set("optimizeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeFilter: Self = this.set("optimizeFilter", js.undefined)
    
    @scala.inline
    def setOptimizeFont(value: Boolean): Self = this.set("optimizeFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeFont: Self = this.set("optimizeFont", js.undefined)
    
    @scala.inline
    def setOptimizeFontWeight(value: Boolean): Self = this.set("optimizeFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeFontWeight: Self = this.set("optimizeFontWeight", js.undefined)
    
    @scala.inline
    def setOptimizeOutline(value: Boolean): Self = this.set("optimizeOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeOutline: Self = this.set("optimizeOutline", js.undefined)
    
    @scala.inline
    def setRemoveEmpty(value: Boolean): Self = this.set("removeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEmpty: Self = this.set("removeEmpty", js.undefined)
    
    @scala.inline
    def setRemoveNegativePaddings(value: Boolean): Self = this.set("removeNegativePaddings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveNegativePaddings: Self = this.set("removeNegativePaddings", js.undefined)
    
    @scala.inline
    def setRemoveQuotes(value: Boolean): Self = this.set("removeQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveQuotes: Self = this.set("removeQuotes", js.undefined)
    
    @scala.inline
    def setRemoveWhitespace(value: Boolean): Self = this.set("removeWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveWhitespace: Self = this.set("removeWhitespace", js.undefined)
    
    @scala.inline
    def setReplaceMultipleZeros(value: Boolean): Self = this.set("replaceMultipleZeros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceMultipleZeros: Self = this.set("replaceMultipleZeros", js.undefined)
    
    @scala.inline
    def setReplaceTimeUnits(value: Boolean): Self = this.set("replaceTimeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceTimeUnits: Self = this.set("replaceTimeUnits", js.undefined)
    
    @scala.inline
    def setReplaceZeroUnits(value: Boolean): Self = this.set("replaceZeroUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceZeroUnits: Self = this.set("replaceZeroUnits", js.undefined)
    
    @scala.inline
    def setRoundingPrecision(value: Boolean): Self = this.set("roundingPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingPrecision: Self = this.set("roundingPrecision", js.undefined)
    
    @scala.inline
    def setSelectorsSortingMethod(value: standard | natural | none): Self = this.set("selectorsSortingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorsSortingMethod: Self = this.set("selectorsSortingMethod", js.undefined)
    
    @scala.inline
    def setSpecialComments(value: String): Self = this.set("specialComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialComments: Self = this.set("specialComments", js.undefined)
    
    @scala.inline
    def setTidyAtRules(value: Boolean): Self = this.set("tidyAtRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTidyAtRules: Self = this.set("tidyAtRules", js.undefined)
    
    @scala.inline
    def setTidyBlockScopes(value: Boolean): Self = this.set("tidyBlockScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTidyBlockScopes: Self = this.set("tidyBlockScopes", js.undefined)
    
    @scala.inline
    def setTidySelectors(value: Boolean): Self = this.set("tidySelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTidySelectors: Self = this.set("tidySelectors", js.undefined)
    
    @scala.inline
    def setTransform(
      value: (/* propertyName */ String, /* propertyValue */ String, /* selector */ js.UndefOr[String]) => String
    ): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
