package typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginMod.Critters

import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.JS
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.`js-lazy`
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.all
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.body
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.critical
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.media
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.none
import typings.crittersDashWebpackDashPlugin.crittersDashWebpackDashPluginStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrittersOptions extends js.Object {
  /**
    * Compress resulting critical CSS.
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * Inline styles from external stylesheets.
    * @default true
    */
  var external: js.UndefOr[Boolean] = js.undefined
  /**
    * Shorthand for setting inlineFonts+preloadFonts - Values:
    * - true to inline critical font-face rules and preload the fonts.
    * - false to don"t inline any font-face rules and don"t preload fonts.
    */
  var fonts: js.UndefOr[Boolean] = js.undefined
  /**
    * Inline critical font-face rules.
    * @default false
    */
  var inlineFonts: js.UndefOr[Boolean] = js.undefined
  /**
    * Inline external stylesheets smaller than a given size.
    * @default 0
    */
  var inlineThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Controls which keyframes rules are inlined. - Values:
    * - "critical": Inline keyframes rules used by the critical CSS.
    * - "all" Inline all keyframes rules.
    * - "none" Remove all keyframes rules
    * @default "critical"
    */
  var keyframes: js.UndefOr[critical | all | none] = js.undefined
  /**
    * Merged inlined stylesheets into a single <style> tag.
    * @default true
    */
  var mergeStylesheets: js.UndefOr[Boolean] = js.undefined
  /**
    * If the non-critical external stylesheet would be below this size, just inline it.
    * @default 0
    */
  var minimumExternalSize: js.UndefOr[Double] = js.undefined
  /**
    * Add <noscript> fallback to JS-based strategies
    */
  var noscriptFallback: js.UndefOr[Boolean] = js.undefined
  /**
    * The mechanism to use for lazy-loading stylesheets. [JS] indicates that a strategy requires JavaScript (falls back to <noscript>).
    * - default: Move stylesheet links to the end of the document and insert preload meta tags in their place.
    * - "body": Move all external stylesheet links to the end of the document.
    * - "media": Load stylesheets asynchronously by adding media="not x" and removing once loaded. [JS]
    * - "swap": Convert stylesheet links to preloads that swap to rel="stylesheet" once loaded. [JS]
    * - "js": Inject an asynchronous CSS loader similar to LoadCSS and use it to load stylesheets. [JS]
    * - "js-lazy": Like "js", but the stylesheet is disabled until fully loaded.
    */
  var preload: js.UndefOr[body | media | swap | JS | `js-lazy`] = js.undefined
  /**
    * Preloads critical fonts.
    * @default true
    */
  var preloadFonts: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove inlined rules from the external stylesheet.
    * @default true
    */
  var pruneSource: js.UndefOr[Boolean] = js.undefined
}

object CrittersOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    external: js.UndefOr[Boolean] = js.undefined,
    fonts: js.UndefOr[Boolean] = js.undefined,
    inlineFonts: js.UndefOr[Boolean] = js.undefined,
    inlineThreshold: Int | Double = null,
    keyframes: critical | all | none = null,
    mergeStylesheets: js.UndefOr[Boolean] = js.undefined,
    minimumExternalSize: Int | Double = null,
    noscriptFallback: js.UndefOr[Boolean] = js.undefined,
    preload: body | media | swap | JS | `js-lazy` = null,
    preloadFonts: js.UndefOr[Boolean] = js.undefined,
    pruneSource: js.UndefOr[Boolean] = js.undefined
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

