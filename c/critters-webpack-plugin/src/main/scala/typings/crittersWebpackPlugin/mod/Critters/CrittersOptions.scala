package typings.crittersWebpackPlugin.mod.Critters

import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.body
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.media
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrittersOptions extends js.Object {
  /**
    * Glob for matching other stylesheets to be used while looking for critical CSS
    */
  var additionalStylesheets: js.UndefOr[js.Array[String]] = js.undefined
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
    * Controls which keyframes rules are inlined.
    * See {@link KeyFrameStrategy keyframe strategy}
    * @default "critical"
    */
  var keyframes: js.UndefOr[KeyframeStrategy] = js.undefined
  /**
    * Controls {@link LogLevel log level} of the plugin
    * @default 'info'
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
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
    * The mechanism to use for lazy-loading stylesheets.
    *
    */
  var preload: js.UndefOr[body | media | swap | js_ | `js-lazy`] = js.undefined
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
    additionalStylesheets: js.Array[String] = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    external: js.UndefOr[Boolean] = js.undefined,
    fonts: js.UndefOr[Boolean] = js.undefined,
    inlineFonts: js.UndefOr[Boolean] = js.undefined,
    inlineThreshold: js.UndefOr[Double] = js.undefined,
    keyframes: KeyframeStrategy = null,
    logLevel: LogLevel = null,
    mergeStylesheets: js.UndefOr[Boolean] = js.undefined,
    minimumExternalSize: js.UndefOr[Double] = js.undefined,
    noscriptFallback: js.UndefOr[Boolean] = js.undefined,
    preload: body | media | swap | js_ | `js-lazy` = null,
    preloadFonts: js.UndefOr[Boolean] = js.undefined,
    pruneSource: js.UndefOr[Boolean] = js.undefined
  ): CrittersOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalStylesheets != null) __obj.updateDynamic("additionalStylesheets")(additionalStylesheets.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fonts)) __obj.updateDynamic("fonts")(fonts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineFonts)) __obj.updateDynamic("inlineFonts")(inlineFonts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineThreshold)) __obj.updateDynamic("inlineThreshold")(inlineThreshold.get.asInstanceOf[js.Any])
    if (keyframes != null) __obj.updateDynamic("keyframes")(keyframes.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeStylesheets)) __obj.updateDynamic("mergeStylesheets")(mergeStylesheets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumExternalSize)) __obj.updateDynamic("minimumExternalSize")(minimumExternalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noscriptFallback)) __obj.updateDynamic("noscriptFallback")(noscriptFallback.get.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadFonts)) __obj.updateDynamic("preloadFonts")(preloadFonts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pruneSource)) __obj.updateDynamic("pruneSource")(pruneSource.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrittersOptions]
  }
}

