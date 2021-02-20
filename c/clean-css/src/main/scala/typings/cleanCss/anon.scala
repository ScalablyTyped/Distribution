package typings.cleanCss

import typings.cleanCss.cleanCssBooleans.`false`
import typings.cleanCss.cleanCssBooleans.`true`
import typings.cleanCss.cleanCssStrings.natural
import typings.cleanCss.cleanCssStrings.none
import typings.cleanCss.cleanCssStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdjacentSpace extends StObject {
    
    /**
      * Controls extra space before `nav` element; defaults to `false`
      */
    var adjacentSpace: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
      */
    var ie7Hack: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
      */
    var mergeLimit: Double = js.native
    
    /**
      * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
      */
    var mergeablePseudoClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
      */
    var mergeablePseudoElements: js.Array[String] = js.native
    
    /**
      * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
      */
    var multiplePseudoMerging: Boolean = js.native
  }
  object AdjacentSpace {
    
    @scala.inline
    def apply(mergeLimit: Double, mergeablePseudoElements: js.Array[String], multiplePseudoMerging: Boolean): AdjacentSpace = {
      val __obj = js.Dynamic.literal(mergeLimit = mergeLimit.asInstanceOf[js.Any], mergeablePseudoElements = mergeablePseudoElements.asInstanceOf[js.Any], multiplePseudoMerging = multiplePseudoMerging.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjacentSpace]
    }
    
    @scala.inline
    implicit class AdjacentSpaceMutableBuilder[Self <: AdjacentSpace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjacentSpace(value: Boolean): Self = StObject.set(x, "adjacentSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjacentSpaceUndefined: Self = StObject.set(x, "adjacentSpace", js.undefined)
      
      @scala.inline
      def setIe7Hack(value: Boolean): Self = StObject.set(x, "ie7Hack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIe7HackUndefined: Self = StObject.set(x, "ie7Hack", js.undefined)
      
      @scala.inline
      def setMergeLimit(value: Double): Self = StObject.set(x, "mergeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeablePseudoClasses(value: js.Array[String]): Self = StObject.set(x, "mergeablePseudoClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeablePseudoClassesUndefined: Self = StObject.set(x, "mergeablePseudoClasses", js.undefined)
      
      @scala.inline
      def setMergeablePseudoClassesVarargs(value: String*): Self = StObject.set(x, "mergeablePseudoClasses", js.Array(value :_*))
      
      @scala.inline
      def setMergeablePseudoElements(value: js.Array[String]): Self = StObject.set(x, "mergeablePseudoElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeablePseudoElementsVarargs(value: String*): Self = StObject.set(x, "mergeablePseudoElements", js.Array(value :_*))
      
      @scala.inline
      def setMultiplePseudoMerging(value: Boolean): Self = StObject.set(x, "multiplePseudoMerging", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AfterAtRule extends StObject {
    
    /**
      * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
      */
    var afterAtRule: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
      */
    var afterBlockBegins: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a block ends, defaults to `false`
      */
    var afterBlockEnds: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a comment; defaults to `false`
      */
    var afterComment: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a property; defaults to `false`
      */
    var afterProperty: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a rule begins; defaults to `false`
      */
    var afterRuleBegins: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes after a rule ends; defaults to `false`
      */
    var afterRuleEnds: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes before a block ends; defaults to `false`
      */
    var beforeBlockEnds: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a line break comes between selectors; defaults to `false`
      */
    var betweenSelectors: js.UndefOr[Boolean] = js.native
  }
  object AfterAtRule {
    
    @scala.inline
    def apply(): AfterAtRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterAtRule]
    }
    
    @scala.inline
    implicit class AfterAtRuleMutableBuilder[Self <: AfterAtRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAtRule(value: Boolean): Self = StObject.set(x, "afterAtRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterAtRuleUndefined: Self = StObject.set(x, "afterAtRule", js.undefined)
      
      @scala.inline
      def setAfterBlockBegins(value: Boolean): Self = StObject.set(x, "afterBlockBegins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlockBeginsUndefined: Self = StObject.set(x, "afterBlockBegins", js.undefined)
      
      @scala.inline
      def setAfterBlockEnds(value: Boolean): Self = StObject.set(x, "afterBlockEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterBlockEndsUndefined: Self = StObject.set(x, "afterBlockEnds", js.undefined)
      
      @scala.inline
      def setAfterComment(value: Boolean): Self = StObject.set(x, "afterComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCommentUndefined: Self = StObject.set(x, "afterComment", js.undefined)
      
      @scala.inline
      def setAfterProperty(value: Boolean): Self = StObject.set(x, "afterProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterPropertyUndefined: Self = StObject.set(x, "afterProperty", js.undefined)
      
      @scala.inline
      def setAfterRuleBegins(value: Boolean): Self = StObject.set(x, "afterRuleBegins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterRuleBeginsUndefined: Self = StObject.set(x, "afterRuleBegins", js.undefined)
      
      @scala.inline
      def setAfterRuleEnds(value: Boolean): Self = StObject.set(x, "afterRuleEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterRuleEndsUndefined: Self = StObject.set(x, "afterRuleEnds", js.undefined)
      
      @scala.inline
      def setBeforeBlockEnds(value: Boolean): Self = StObject.set(x, "beforeBlockEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlockEndsUndefined: Self = StObject.set(x, "beforeBlockEnds", js.undefined)
      
      @scala.inline
      def setBetweenSelectors(value: Boolean): Self = StObject.set(x, "betweenSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetweenSelectorsUndefined: Self = StObject.set(x, "betweenSelectors", js.undefined)
    }
  }
  
  @js.native
  trait All extends StObject {
    
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
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setCleanupCharsets(value: Boolean): Self = StObject.set(x, "cleanupCharsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupCharsetsUndefined: Self = StObject.set(x, "cleanupCharsets", js.undefined)
      
      @scala.inline
      def setNormalizeUrls(value: Boolean): Self = StObject.set(x, "normalizeUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUrlsUndefined: Self = StObject.set(x, "normalizeUrls", js.undefined)
      
      @scala.inline
      def setOptimizeBackground(value: Boolean): Self = StObject.set(x, "optimizeBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeBackgroundUndefined: Self = StObject.set(x, "optimizeBackground", js.undefined)
      
      @scala.inline
      def setOptimizeBorderRadius(value: Boolean): Self = StObject.set(x, "optimizeBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeBorderRadiusUndefined: Self = StObject.set(x, "optimizeBorderRadius", js.undefined)
      
      @scala.inline
      def setOptimizeFilter(value: Boolean): Self = StObject.set(x, "optimizeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeFilterUndefined: Self = StObject.set(x, "optimizeFilter", js.undefined)
      
      @scala.inline
      def setOptimizeFont(value: Boolean): Self = StObject.set(x, "optimizeFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeFontUndefined: Self = StObject.set(x, "optimizeFont", js.undefined)
      
      @scala.inline
      def setOptimizeFontWeight(value: Boolean): Self = StObject.set(x, "optimizeFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeFontWeightUndefined: Self = StObject.set(x, "optimizeFontWeight", js.undefined)
      
      @scala.inline
      def setOptimizeOutline(value: Boolean): Self = StObject.set(x, "optimizeOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeOutlineUndefined: Self = StObject.set(x, "optimizeOutline", js.undefined)
      
      @scala.inline
      def setRemoveEmpty(value: Boolean): Self = StObject.set(x, "removeEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEmptyUndefined: Self = StObject.set(x, "removeEmpty", js.undefined)
      
      @scala.inline
      def setRemoveNegativePaddings(value: Boolean): Self = StObject.set(x, "removeNegativePaddings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNegativePaddingsUndefined: Self = StObject.set(x, "removeNegativePaddings", js.undefined)
      
      @scala.inline
      def setRemoveQuotes(value: Boolean): Self = StObject.set(x, "removeQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveQuotesUndefined: Self = StObject.set(x, "removeQuotes", js.undefined)
      
      @scala.inline
      def setRemoveWhitespace(value: Boolean): Self = StObject.set(x, "removeWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveWhitespaceUndefined: Self = StObject.set(x, "removeWhitespace", js.undefined)
      
      @scala.inline
      def setReplaceMultipleZeros(value: Boolean): Self = StObject.set(x, "replaceMultipleZeros", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceMultipleZerosUndefined: Self = StObject.set(x, "replaceMultipleZeros", js.undefined)
      
      @scala.inline
      def setReplaceTimeUnits(value: Boolean): Self = StObject.set(x, "replaceTimeUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceTimeUnitsUndefined: Self = StObject.set(x, "replaceTimeUnits", js.undefined)
      
      @scala.inline
      def setReplaceZeroUnits(value: Boolean): Self = StObject.set(x, "replaceZeroUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceZeroUnitsUndefined: Self = StObject.set(x, "replaceZeroUnits", js.undefined)
      
      @scala.inline
      def setRoundingPrecision(value: Boolean): Self = StObject.set(x, "roundingPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundingPrecisionUndefined: Self = StObject.set(x, "roundingPrecision", js.undefined)
      
      @scala.inline
      def setSelectorsSortingMethod(value: standard | natural | none): Self = StObject.set(x, "selectorsSortingMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsSortingMethodUndefined: Self = StObject.set(x, "selectorsSortingMethod", js.undefined)
      
      @scala.inline
      def setSpecialComments(value: String): Self = StObject.set(x, "specialComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialCommentsUndefined: Self = StObject.set(x, "specialComments", js.undefined)
      
      @scala.inline
      def setTidyAtRules(value: Boolean): Self = StObject.set(x, "tidyAtRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidyAtRulesUndefined: Self = StObject.set(x, "tidyAtRules", js.undefined)
      
      @scala.inline
      def setTidyBlockScopes(value: Boolean): Self = StObject.set(x, "tidyBlockScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidyBlockScopesUndefined: Self = StObject.set(x, "tidyBlockScopes", js.undefined)
      
      @scala.inline
      def setTidySelectors(value: Boolean): Self = StObject.set(x, "tidySelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidySelectorsUndefined: Self = StObject.set(x, "tidySelectors", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* propertyName */ String, /* propertyValue */ String, /* selector */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait AroundSelectorRelation extends StObject {
    
    /**
      * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
      */
    var aroundSelectorRelation: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
      */
    var beforeBlockBegins: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
      */
    var beforeValue: js.UndefOr[Boolean] = js.native
  }
  object AroundSelectorRelation {
    
    @scala.inline
    def apply(): AroundSelectorRelation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AroundSelectorRelation]
    }
    
    @scala.inline
    implicit class AroundSelectorRelationMutableBuilder[Self <: AroundSelectorRelation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAroundSelectorRelation(value: Boolean): Self = StObject.set(x, "aroundSelectorRelation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAroundSelectorRelationUndefined: Self = StObject.set(x, "aroundSelectorRelation", js.undefined)
      
      @scala.inline
      def setBeforeBlockBegins(value: Boolean): Self = StObject.set(x, "beforeBlockBegins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBlockBeginsUndefined: Self = StObject.set(x, "beforeBlockBegins", js.undefined)
      
      @scala.inline
      def setBeforeValue(value: Boolean): Self = StObject.set(x, "beforeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeValueUndefined: Self = StObject.set(x, "beforeValue", js.undefined)
    }
  }
  
  @js.native
  trait BackgroundClipMerging extends StObject {
    
    /**
      * Controls background-clip merging into shorthand; defaults to `true`
      */
    var backgroundClipMerging: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls background-origin merging into shorthand; defaults to `true`
      */
    var backgroundOriginMerging: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls background-size merging into shorthand; defaults to `true`
      */
    var backgroundSizeMerging: js.UndefOr[Boolean] = js.native
    
    /**
      * controls color optimizations; defaults to `true`
      */
    var colors: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls keeping IE bang hack; defaults to `false`
      */
    var ieBangHack: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
      */
    var ieFilters: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls keeping IE prefix hack; defaults to `false`
      */
    var iePrefixHack: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls keeping IE suffix hack; defaults to `false`
      */
    var ieSuffixHack: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls property merging based on understandably; defaults to `true`
      */
    var merging: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
      */
    var shorterLengthUnits: js.UndefOr[`false`] = js.native
    
    /**
      * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
      */
    var spaceAfterClosingBrace: js.UndefOr[`true`] = js.native
    
    /**
      * Controls keeping quoting inside `url()`; defaults to `false`
      */
    var urlQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls removal of units `0` value; defaults to `true`
      */
    var zeroUnits: js.UndefOr[Boolean] = js.native
  }
  object BackgroundClipMerging {
    
    @scala.inline
    def apply(): BackgroundClipMerging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundClipMerging]
    }
    
    @scala.inline
    implicit class BackgroundClipMergingMutableBuilder[Self <: BackgroundClipMerging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundClipMerging(value: Boolean): Self = StObject.set(x, "backgroundClipMerging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundClipMergingUndefined: Self = StObject.set(x, "backgroundClipMerging", js.undefined)
      
      @scala.inline
      def setBackgroundOriginMerging(value: Boolean): Self = StObject.set(x, "backgroundOriginMerging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundOriginMergingUndefined: Self = StObject.set(x, "backgroundOriginMerging", js.undefined)
      
      @scala.inline
      def setBackgroundSizeMerging(value: Boolean): Self = StObject.set(x, "backgroundSizeMerging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundSizeMergingUndefined: Self = StObject.set(x, "backgroundSizeMerging", js.undefined)
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setIeBangHack(value: Boolean): Self = StObject.set(x, "ieBangHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeBangHackUndefined: Self = StObject.set(x, "ieBangHack", js.undefined)
      
      @scala.inline
      def setIeFilters(value: Boolean): Self = StObject.set(x, "ieFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeFiltersUndefined: Self = StObject.set(x, "ieFilters", js.undefined)
      
      @scala.inline
      def setIePrefixHack(value: Boolean): Self = StObject.set(x, "iePrefixHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIePrefixHackUndefined: Self = StObject.set(x, "iePrefixHack", js.undefined)
      
      @scala.inline
      def setIeSuffixHack(value: Boolean): Self = StObject.set(x, "ieSuffixHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeSuffixHackUndefined: Self = StObject.set(x, "ieSuffixHack", js.undefined)
      
      @scala.inline
      def setMerging(value: Boolean): Self = StObject.set(x, "merging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergingUndefined: Self = StObject.set(x, "merging", js.undefined)
      
      @scala.inline
      def setShorterLengthUnits(value: `false`): Self = StObject.set(x, "shorterLengthUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorterLengthUnitsUndefined: Self = StObject.set(x, "shorterLengthUnits", js.undefined)
      
      @scala.inline
      def setSpaceAfterClosingBrace(value: `true`): Self = StObject.set(x, "spaceAfterClosingBrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceAfterClosingBraceUndefined: Self = StObject.set(x, "spaceAfterClosingBrace", js.undefined)
      
      @scala.inline
      def setUrlQuotes(value: Boolean): Self = StObject.set(x, "urlQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlQuotesUndefined: Self = StObject.set(x, "urlQuotes", js.undefined)
      
      @scala.inline
      def setZeroUnits(value: Boolean): Self = StObject.set(x, "zeroUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUnitsUndefined: Self = StObject.set(x, "zeroUnits", js.undefined)
    }
  }
  
  @js.native
  trait Ch extends StObject {
    
    /**
      * Controls treating `ch` as a supported unit; defaults to `true`
      */
    var ch: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `in` as a supported unit; defaults to `true`
      */
    var in: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `pc` as a supported unit; defaults to `true`
      */
    var pc: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `pt` as a supported unit; defaults to `true`
      */
    var pt: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `rem` as a supported unit; defaults to `true`
      */
    var rem: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `vh` as a supported unit; defaults to `true`
      */
    var vh: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `vm` as a supported unit; defaults to `true`
      */
    var vm: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `vmax` as a supported unit; defaults to `true`
      */
    var vmax: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls treating `vmin` as a supported unit; defaults to `true`
      */
    var vmin: js.UndefOr[Boolean] = js.native
  }
  object Ch {
    
    @scala.inline
    def apply(): Ch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ch]
    }
    
    @scala.inline
    implicit class ChMutableBuilder[Self <: Ch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCh(value: Boolean): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setPc(value: Boolean): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
      
      @scala.inline
      def setPt(value: Boolean): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setRem(value: Boolean): Self = StObject.set(x, "rem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemUndefined: Self = StObject.set(x, "rem", js.undefined)
      
      @scala.inline
      def setVh(value: Boolean): Self = StObject.set(x, "vh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhUndefined: Self = StObject.set(x, "vh", js.undefined)
      
      @scala.inline
      def setVm(value: Boolean): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
      
      @scala.inline
      def setVmax(value: Boolean): Self = StObject.set(x, "vmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVmaxUndefined: Self = StObject.set(x, "vmax", js.undefined)
      
      @scala.inline
      def setVmin(value: Boolean): Self = StObject.set(x, "vmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVminUndefined: Self = StObject.set(x, "vmin", js.undefined)
    }
  }
  
  @js.native
  trait Efficiency extends StObject {
    
    /**
      * `(originalSize - minifiedSize) / originalSize`, e.g. 0.25 if size is reduced from 100 bytes to 75 bytes
      */
    var efficiency: Double = js.native
    
    /**
      * Optimized content size
      */
    var minifiedSize: Double = js.native
    
    /**
      * Original content size after import inlining
      */
    var originalSize: Double = js.native
    
    /**
      * Time spent on optimizations in milliseconds
      */
    var timeSpent: Double = js.native
  }
  object Efficiency {
    
    @scala.inline
    def apply(efficiency: Double, minifiedSize: Double, originalSize: Double, timeSpent: Double): Efficiency = {
      val __obj = js.Dynamic.literal(efficiency = efficiency.asInstanceOf[js.Any], minifiedSize = minifiedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], timeSpent = timeSpent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Efficiency]
    }
    
    @scala.inline
    implicit class EfficiencyMutableBuilder[Self <: Efficiency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEfficiency(value: Double): Self = StObject.set(x, "efficiency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifiedSize(value: Double): Self = StObject.set(x, "minifiedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalSize(value: Double): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeSpent(value: Double): Self = StObject.set(x, "timeSpent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MergeAdjacentRules extends StObject {
    
    /**
      * Sets all optimizations at this level unless otherwise specified
      */
    var all: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls adjacent rules merging; defaults to true
      */
    var mergeAdjacentRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls merging properties into shorthands; defaults to true
      */
    var mergeIntoShorthands: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls `@media` merging; defaults to true
      */
    var mergeMedia: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls non-adjacent rule merging; defaults to true
      */
    var mergeNonAdjacentRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls semantic merging; defaults to false
      */
    var mergeSemantically: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls property overriding based on understandably; defaults to true
      */
    var overrideProperties: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls non-adjacent rule reducing; defaults to true
      */
    var reduceNonAdjacentRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls duplicate `@font-face` removing; defaults to true
      */
    var removeDuplicateFontRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls duplicate `@media` removing; defaults to true
      */
    var removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls duplicate rules removing; defaults to true
      */
    var removeDuplicateRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls removing empty rules and nested blocks; defaults to `true`
      */
    var removeEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls unused at rule removing; defaults to false (available since 4.1.0)
      */
    var removeUnusedAtRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls rule restructuring; defaults to false
      */
    var restructureRules: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
      */
    var skipProperties: js.UndefOr[js.Array[String]] = js.native
  }
  object MergeAdjacentRules {
    
    @scala.inline
    def apply(): MergeAdjacentRules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeAdjacentRules]
    }
    
    @scala.inline
    implicit class MergeAdjacentRulesMutableBuilder[Self <: MergeAdjacentRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setMergeAdjacentRules(value: Boolean): Self = StObject.set(x, "mergeAdjacentRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeAdjacentRulesUndefined: Self = StObject.set(x, "mergeAdjacentRules", js.undefined)
      
      @scala.inline
      def setMergeIntoShorthands(value: Boolean): Self = StObject.set(x, "mergeIntoShorthands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeIntoShorthandsUndefined: Self = StObject.set(x, "mergeIntoShorthands", js.undefined)
      
      @scala.inline
      def setMergeMedia(value: Boolean): Self = StObject.set(x, "mergeMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMediaUndefined: Self = StObject.set(x, "mergeMedia", js.undefined)
      
      @scala.inline
      def setMergeNonAdjacentRules(value: Boolean): Self = StObject.set(x, "mergeNonAdjacentRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeNonAdjacentRulesUndefined: Self = StObject.set(x, "mergeNonAdjacentRules", js.undefined)
      
      @scala.inline
      def setMergeSemantically(value: Boolean): Self = StObject.set(x, "mergeSemantically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeSemanticallyUndefined: Self = StObject.set(x, "mergeSemantically", js.undefined)
      
      @scala.inline
      def setOverrideProperties(value: Boolean): Self = StObject.set(x, "overrideProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridePropertiesUndefined: Self = StObject.set(x, "overrideProperties", js.undefined)
      
      @scala.inline
      def setReduceNonAdjacentRules(value: Boolean): Self = StObject.set(x, "reduceNonAdjacentRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceNonAdjacentRulesUndefined: Self = StObject.set(x, "reduceNonAdjacentRules", js.undefined)
      
      @scala.inline
      def setRemoveDuplicateFontRules(value: Boolean): Self = StObject.set(x, "removeDuplicateFontRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDuplicateFontRulesUndefined: Self = StObject.set(x, "removeDuplicateFontRules", js.undefined)
      
      @scala.inline
      def setRemoveDuplicateMediaBlocks(value: Boolean): Self = StObject.set(x, "removeDuplicateMediaBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDuplicateMediaBlocksUndefined: Self = StObject.set(x, "removeDuplicateMediaBlocks", js.undefined)
      
      @scala.inline
      def setRemoveDuplicateRules(value: Boolean): Self = StObject.set(x, "removeDuplicateRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveDuplicateRulesUndefined: Self = StObject.set(x, "removeDuplicateRules", js.undefined)
      
      @scala.inline
      def setRemoveEmpty(value: Boolean): Self = StObject.set(x, "removeEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEmptyUndefined: Self = StObject.set(x, "removeEmpty", js.undefined)
      
      @scala.inline
      def setRemoveUnusedAtRules(value: Boolean): Self = StObject.set(x, "removeUnusedAtRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUnusedAtRulesUndefined: Self = StObject.set(x, "removeUnusedAtRules", js.undefined)
      
      @scala.inline
      def setRestructureRules(value: Boolean): Self = StObject.set(x, "restructureRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestructureRulesUndefined: Self = StObject.set(x, "restructureRules", js.undefined)
      
      @scala.inline
      def setSkipProperties(value: js.Array[String]): Self = StObject.set(x, "skipProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropertiesUndefined: Self = StObject.set(x, "skipProperties", js.undefined)
      
      @scala.inline
      def setSkipPropertiesVarargs(value: String*): Self = StObject.set(x, "skipProperties", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Opacity extends StObject {
    
    /**
      * Controls `rgba()` / `hsla()` color support; defaults to `true`
      */
    var opacity: js.UndefOr[Boolean] = js.native
  }
  object Opacity {
    
    @scala.inline
    def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    @scala.inline
    implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait SourceMap extends StObject {
    
    /**
      * The source map of the file, if needed
      */
    var sourceMap: js.UndefOr[String] = js.native
    
    /**
      * The contents of the file, should be css
      */
    var styles: String = js.native
  }
  object SourceMap {
    
    @scala.inline
    def apply(styles: String): SourceMap = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMap]
    }
    
    @scala.inline
    implicit class SourceMapMutableBuilder[Self <: SourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceMap(value: String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
