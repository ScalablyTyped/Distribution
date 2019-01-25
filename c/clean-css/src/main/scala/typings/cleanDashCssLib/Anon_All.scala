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

