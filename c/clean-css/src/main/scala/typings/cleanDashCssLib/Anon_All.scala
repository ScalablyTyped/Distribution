package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `@charset` moving to the front of a stylesheet; defaults to `true`
    */
  var cleanupCharsets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls URL normalization; defaults to `true`
    */
  var normalizeUrls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `background` property optimizations; defaults to `true`
    */
  var optimizeBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `border-radius` property optimizations; defaults to `true`
    */
  var optimizeBorderRadius: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `filter` property optimizations; defaults to `true`
    */
  var optimizeFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `font` property optimizations; defaults to `true`
    */
  var optimizeFont: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `font-weight` property optimizations; defaults to `true`
    */
  var optimizeFontWeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls `outline` property optimizations; defaults to `true`
    */
  var optimizeOutline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removing negative paddings; defaults to `true`
    */
  var removeNegativePaddings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removing quotes when unnecessary; defaults to `true`
    */
  var removeQuotes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removing unused whitespace; defaults to `true`
    */
  var removeWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Contols removing redundant zeros; defaults to `true`
    */
  var replaceMultipleZeros: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls replacing time units with shorter values; defaults to `true`
    */
  var replaceTimeUnits: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls replacing zero values with units; defaults to `true`
    */
  var replaceZeroUnits: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Rounds pixel values to `N` decimal places; `false` disables rounding; defaults to `false`
    */
  var roundingPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * denotes selector sorting method; can be `'natural'` or `'standard'`, `'none'`, or false (the last two
    * since 4.1.0); defaults to `'standard'`
    */
  var selectorsSortingMethod: js.UndefOr[
    cleanDashCssLib.cleanDashCssLibStrings.standard | cleanDashCssLib.cleanDashCssLibStrings.natural | cleanDashCssLib.cleanDashCssLibStrings.none
  ] = js.undefined
  /**
    * Controls removing trailing semicolons in rule; defaults to `false` - means remove
    */
  var semicolonAfterLastProperty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * denotes a number of / *! ... * / comments preserved; defaults to `all`
    */
  var specialComments: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls at-rules (e.g. `@charset`, `@import`) optimizing; defaults to `true`
    */
  var tidyAtRules: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls block scopes (e.g. `@media`) optimizing; defaults to `true`
    */
  var tidyBlockScopes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls selectors optimizing; defaults to `true`
    */
  var tidySelectors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines a callback for fine-grained property optimization; defaults to no-op
    */
  var transform: js.UndefOr[
    js.Function3[
      /* propertyName */ java.lang.String, 
      /* propertyValue */ java.lang.String, 
      /* selector */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    cleanupCharsets: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeUrls: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeBackground: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeBorderRadius: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeFilter: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeFont: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeFontWeight: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeOutline: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    removeNegativePaddings: js.UndefOr[scala.Boolean] = js.undefined,
    removeQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    removeWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    replaceMultipleZeros: js.UndefOr[scala.Boolean] = js.undefined,
    replaceTimeUnits: js.UndefOr[scala.Boolean] = js.undefined,
    replaceZeroUnits: js.UndefOr[scala.Boolean] = js.undefined,
    roundingPrecision: js.UndefOr[scala.Boolean] = js.undefined,
    selectorsSortingMethod: cleanDashCssLib.cleanDashCssLibStrings.standard | cleanDashCssLib.cleanDashCssLibStrings.natural | cleanDashCssLib.cleanDashCssLibStrings.none = null,
    semicolonAfterLastProperty: js.UndefOr[scala.Boolean] = js.undefined,
    specialComments: java.lang.String = null,
    tidyAtRules: js.UndefOr[scala.Boolean] = js.undefined,
    tidyBlockScopes: js.UndefOr[scala.Boolean] = js.undefined,
    tidySelectors: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function3[
      /* propertyName */ java.lang.String, 
      /* propertyValue */ java.lang.String, 
      /* selector */ js.UndefOr[java.lang.String], 
      java.lang.String
    ] = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(cleanupCharsets)) __obj.updateDynamic("cleanupCharsets")(cleanupCharsets)
    if (!js.isUndefined(normalizeUrls)) __obj.updateDynamic("normalizeUrls")(normalizeUrls)
    if (!js.isUndefined(optimizeBackground)) __obj.updateDynamic("optimizeBackground")(optimizeBackground)
    if (!js.isUndefined(optimizeBorderRadius)) __obj.updateDynamic("optimizeBorderRadius")(optimizeBorderRadius)
    if (!js.isUndefined(optimizeFilter)) __obj.updateDynamic("optimizeFilter")(optimizeFilter)
    if (!js.isUndefined(optimizeFont)) __obj.updateDynamic("optimizeFont")(optimizeFont)
    if (!js.isUndefined(optimizeFontWeight)) __obj.updateDynamic("optimizeFontWeight")(optimizeFontWeight)
    if (!js.isUndefined(optimizeOutline)) __obj.updateDynamic("optimizeOutline")(optimizeOutline)
    if (!js.isUndefined(removeEmpty)) __obj.updateDynamic("removeEmpty")(removeEmpty)
    if (!js.isUndefined(removeNegativePaddings)) __obj.updateDynamic("removeNegativePaddings")(removeNegativePaddings)
    if (!js.isUndefined(removeQuotes)) __obj.updateDynamic("removeQuotes")(removeQuotes)
    if (!js.isUndefined(removeWhitespace)) __obj.updateDynamic("removeWhitespace")(removeWhitespace)
    if (!js.isUndefined(replaceMultipleZeros)) __obj.updateDynamic("replaceMultipleZeros")(replaceMultipleZeros)
    if (!js.isUndefined(replaceTimeUnits)) __obj.updateDynamic("replaceTimeUnits")(replaceTimeUnits)
    if (!js.isUndefined(replaceZeroUnits)) __obj.updateDynamic("replaceZeroUnits")(replaceZeroUnits)
    if (!js.isUndefined(roundingPrecision)) __obj.updateDynamic("roundingPrecision")(roundingPrecision)
    if (selectorsSortingMethod != null) __obj.updateDynamic("selectorsSortingMethod")(selectorsSortingMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolonAfterLastProperty)) __obj.updateDynamic("semicolonAfterLastProperty")(semicolonAfterLastProperty)
    if (specialComments != null) __obj.updateDynamic("specialComments")(specialComments)
    if (!js.isUndefined(tidyAtRules)) __obj.updateDynamic("tidyAtRules")(tidyAtRules)
    if (!js.isUndefined(tidyBlockScopes)) __obj.updateDynamic("tidyBlockScopes")(tidyBlockScopes)
    if (!js.isUndefined(tidySelectors)) __obj.updateDynamic("tidySelectors")(tidySelectors)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_All]
  }
}

