package typings
package crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginMod.CrittersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrittersOptions extends js.Object {
  /**
    * Compress resulting critical CSS.
    * @default true
    */
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Inline styles from external stylesheets.
    * @default true
    */
  var external: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shorthand for setting inlineFonts+preloadFonts - Values:
    * - true to inline critical font-face rules and preload the fonts.
    * - false to don"t inline any font-face rules and don"t preload fonts.
    */
  var fonts: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Inline critical font-face rules.
    * @default false
    */
  var inlineFonts: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Inline external stylesheets smaller than a given size.
    * @default 0
    */
  var inlineThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls which keyframes rules are inlined. - Values:
    * - "critical": Inline keyframes rules used by the critical CSS.
    * - "all" Inline all keyframes rules.
    * - "none" Remove all keyframes rules
    * @default "critical"
    */
  var keyframes: js.UndefOr[
    crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.critical | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.all | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.none
  ] = js.undefined
  /**
    * Merged inlined stylesheets into a single <style> tag.
    * @default true
    */
  var mergeStylesheets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the non-critical external stylesheet would be below this size, just inline it.
    * @default 0
    */
  var minimumExternalSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Add <noscript> fallback to JS-based strategies
    */
  var noscriptFallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mechanism to use for lazy-loading stylesheets. [JS] indicates that a strategy requires JavaScript (falls back to <noscript>).
    * - default: Move stylesheet links to the end of the document and insert preload meta tags in their place.
    * - "body": Move all external stylesheet links to the end of the document.
    * - "media": Load stylesheets asynchronously by adding media="not x" and removing once loaded. [JS]
    * - "swap": Convert stylesheet links to preloads that swap to rel="stylesheet" once loaded. [JS]
    * - "js": Inject an asynchronous CSS loader similar to LoadCSS and use it to load stylesheets. [JS]
    * - "js-lazy": Like "js", but the stylesheet is disabled until fully loaded.
    */
  var preload: js.UndefOr[
    crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.body | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.media | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.swap | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.JS | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.`js-lazy`
  ] = js.undefined
  /**
    * Preloads critical fonts.
    * @default true
    */
  var preloadFonts: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Remove inlined rules from the external stylesheet.
    * @default true
    */
  var pruneSource: js.UndefOr[scala.Boolean] = js.undefined
}

object CrittersOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    fonts: js.UndefOr[scala.Boolean] = js.undefined,
    inlineFonts: js.UndefOr[scala.Boolean] = js.undefined,
    inlineThreshold: scala.Int | scala.Double = null,
    keyframes: crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.critical | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.all | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.none = null,
    mergeStylesheets: js.UndefOr[scala.Boolean] = js.undefined,
    minimumExternalSize: scala.Int | scala.Double = null,
    noscriptFallback: js.UndefOr[scala.Boolean] = js.undefined,
    preload: crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.body | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.media | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.swap | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.JS | crittersDashWebpackDashPluginLib.crittersDashWebpackDashPluginLibStrings.`js-lazy` = null,
    preloadFonts: js.UndefOr[scala.Boolean] = js.undefined,
    pruneSource: js.UndefOr[scala.Boolean] = js.undefined
  ): CrittersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (!js.isUndefined(fonts)) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(inlineFonts)) __obj.updateDynamic("inlineFonts")(inlineFonts)
    if (inlineThreshold != null) __obj.updateDynamic("inlineThreshold")(inlineThreshold.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeStylesheets)) __obj.updateDynamic("mergeStylesheets")(mergeStylesheets)
    if (minimumExternalSize != null) __obj.updateDynamic("minimumExternalSize")(minimumExternalSize.asInstanceOf[js.Any])
    if (!js.isUndefined(noscriptFallback)) __obj.updateDynamic("noscriptFallback")(noscriptFallback)
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadFonts)) __obj.updateDynamic("preloadFonts")(preloadFonts)
    if (!js.isUndefined(pruneSource)) __obj.updateDynamic("pruneSource")(pruneSource)
    __obj.asInstanceOf[CrittersOptions]
  }
}

