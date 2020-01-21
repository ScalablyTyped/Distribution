package typings.cleanCss

import typings.cleanCss.cleanCssStrings.natural
import typings.cleanCss.cleanCssStrings.none
import typings.cleanCss.cleanCssStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAll extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `@charset` moving to the front of a stylesheet; defaults to `true`
    */
  var cleanupCharsets: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls URL normalization; defaults to `true`
    */
  var normalizeUrls: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `background` property optimizations; defaults to `true`
    */
  var optimizeBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `border-radius` property optimizations; defaults to `true`
    */
  var optimizeBorderRadius: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `filter` property optimizations; defaults to `true`
    */
  var optimizeFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `font` property optimizations; defaults to `true`
    */
  var optimizeFont: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `font-weight` property optimizations; defaults to `true`
    */
  var optimizeFontWeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `outline` property optimizations; defaults to `true`
    */
  var optimizeOutline: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removing negative paddings; defaults to `true`
    */
  var removeNegativePaddings: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removing quotes when unnecessary; defaults to `true`
    */
  var removeQuotes: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removing unused whitespace; defaults to `true`
    */
  var removeWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * Contols removing redundant zeros; defaults to `true`
    */
  var replaceMultipleZeros: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls replacing time units with shorter values; defaults to `true`
    */
  var replaceTimeUnits: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls replacing zero values with units; defaults to `true`
    */
  var replaceZeroUnits: js.UndefOr[Boolean] = js.undefined
  /**
    * Rounds pixel values to `N` decimal places; `false` disables rounding; defaults to `false`
    */
  var roundingPrecision: js.UndefOr[Boolean] = js.undefined
  /**
    * denotes selector sorting method; can be `'natural'` or `'standard'`, `'none'`, or false (the last two
    * since 4.1.0); defaults to `'standard'`
    */
  var selectorsSortingMethod: js.UndefOr[standard | natural | none] = js.undefined
  /**
    * Controls removing trailing semicolons in rule; defaults to `false` - means remove
    */
  var semicolonAfterLastProperty: js.UndefOr[Boolean] = js.undefined
  /**
    * denotes a number of / *! ... * / comments preserved; defaults to `all`
    */
  var specialComments: js.UndefOr[String] = js.undefined
  /**
    * Controls at-rules (e.g. `@charset`, `@import`) optimizing; defaults to `true`
    */
  var tidyAtRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls block scopes (e.g. `@media`) optimizing; defaults to `true`
    */
  var tidyBlockScopes: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls selectors optimizing; defaults to `true`
    */
  var tidySelectors: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
}

object AnonAll {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    cleanupCharsets: js.UndefOr[Boolean] = js.undefined,
    normalizeUrls: js.UndefOr[Boolean] = js.undefined,
    optimizeBackground: js.UndefOr[Boolean] = js.undefined,
    optimizeBorderRadius: js.UndefOr[Boolean] = js.undefined,
    optimizeFilter: js.UndefOr[Boolean] = js.undefined,
    optimizeFont: js.UndefOr[Boolean] = js.undefined,
    optimizeFontWeight: js.UndefOr[Boolean] = js.undefined,
    optimizeOutline: js.UndefOr[Boolean] = js.undefined,
    removeEmpty: js.UndefOr[Boolean] = js.undefined,
    removeNegativePaddings: js.UndefOr[Boolean] = js.undefined,
    removeQuotes: js.UndefOr[Boolean] = js.undefined,
    removeWhitespace: js.UndefOr[Boolean] = js.undefined,
    replaceMultipleZeros: js.UndefOr[Boolean] = js.undefined,
    replaceTimeUnits: js.UndefOr[Boolean] = js.undefined,
    replaceZeroUnits: js.UndefOr[Boolean] = js.undefined,
    roundingPrecision: js.UndefOr[Boolean] = js.undefined,
    selectorsSortingMethod: standard | natural | none = null,
    semicolonAfterLastProperty: js.UndefOr[Boolean] = js.undefined,
    specialComments: String = null,
    tidyAtRules: js.UndefOr[Boolean] = js.undefined,
    tidyBlockScopes: js.UndefOr[Boolean] = js.undefined,
    tidySelectors: js.UndefOr[Boolean] = js.undefined,
    transform: (/* propertyName */ String, /* propertyValue */ String, /* selector */ js.UndefOr[String]) => String = null
  ): AnonAll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanupCharsets)) __obj.updateDynamic("cleanupCharsets")(cleanupCharsets.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeUrls)) __obj.updateDynamic("normalizeUrls")(normalizeUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeBackground)) __obj.updateDynamic("optimizeBackground")(optimizeBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeBorderRadius)) __obj.updateDynamic("optimizeBorderRadius")(optimizeBorderRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeFilter)) __obj.updateDynamic("optimizeFilter")(optimizeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeFont)) __obj.updateDynamic("optimizeFont")(optimizeFont.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeFontWeight)) __obj.updateDynamic("optimizeFontWeight")(optimizeFontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeOutline)) __obj.updateDynamic("optimizeOutline")(optimizeOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(removeEmpty)) __obj.updateDynamic("removeEmpty")(removeEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(removeNegativePaddings)) __obj.updateDynamic("removeNegativePaddings")(removeNegativePaddings.asInstanceOf[js.Any])
    if (!js.isUndefined(removeQuotes)) __obj.updateDynamic("removeQuotes")(removeQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeWhitespace)) __obj.updateDynamic("removeWhitespace")(removeWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceMultipleZeros)) __obj.updateDynamic("replaceMultipleZeros")(replaceMultipleZeros.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceTimeUnits)) __obj.updateDynamic("replaceTimeUnits")(replaceTimeUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceZeroUnits)) __obj.updateDynamic("replaceZeroUnits")(replaceZeroUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(roundingPrecision)) __obj.updateDynamic("roundingPrecision")(roundingPrecision.asInstanceOf[js.Any])
    if (selectorsSortingMethod != null) __obj.updateDynamic("selectorsSortingMethod")(selectorsSortingMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolonAfterLastProperty)) __obj.updateDynamic("semicolonAfterLastProperty")(semicolonAfterLastProperty.asInstanceOf[js.Any])
    if (specialComments != null) __obj.updateDynamic("specialComments")(specialComments.asInstanceOf[js.Any])
    if (!js.isUndefined(tidyAtRules)) __obj.updateDynamic("tidyAtRules")(tidyAtRules.asInstanceOf[js.Any])
    if (!js.isUndefined(tidyBlockScopes)) __obj.updateDynamic("tidyBlockScopes")(tidyBlockScopes.asInstanceOf[js.Any])
    if (!js.isUndefined(tidySelectors)) __obj.updateDynamic("tidySelectors")(tidySelectors.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[AnonAll]
  }
}

