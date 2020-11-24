package typings.crittersWebpackPlugin.mod.Critters

import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.`js-lazy`
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.body
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.js_
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.media
import typings.crittersWebpackPlugin.crittersWebpackPluginStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrittersOptions extends js.Object {
  
  /**
    * Glob for matching other stylesheets to be used while looking for critical CSS
    */
  var additionalStylesheets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Compress resulting critical CSS.
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.native
  
  /**
    * Inline styles from external stylesheets.
    * @default true
    */
  var external: js.UndefOr[Boolean] = js.native
  
  /**
    * Shorthand for setting inlineFonts+preloadFonts - Values:
    * - true to inline critical font-face rules and preload the fonts.
    * - false to don"t inline any font-face rules and don"t preload fonts.
    */
  var fonts: js.UndefOr[Boolean] = js.native
  
  /**
    * Inline critical font-face rules.
    * @default false
    */
  var inlineFonts: js.UndefOr[Boolean] = js.native
  
  /**
    * Inline external stylesheets smaller than a given size.
    * @default 0
    */
  var inlineThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Controls which keyframes rules are inlined.
    * See {@link KeyFrameStrategy keyframe strategy}
    * @default "critical"
    */
  var keyframes: js.UndefOr[KeyframeStrategy] = js.native
  
  /**
    * Controls {@link LogLevel log level} of the plugin
    * @default 'info'
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * Merged inlined stylesheets into a single <style> tag.
    * @default true
    */
  var mergeStylesheets: js.UndefOr[Boolean] = js.native
  
  /**
    * If the non-critical external stylesheet would be below this size, just inline it.
    * @default 0
    */
  var minimumExternalSize: js.UndefOr[Double] = js.native
  
  /**
    * Add <noscript> fallback to JS-based strategies
    */
  var noscriptFallback: js.UndefOr[Boolean] = js.native
  
  /**
    * The mechanism to use for lazy-loading stylesheets.
    *
    */
  var preload: js.UndefOr[body | media | swap | js_ | `js-lazy`] = js.native
  
  /**
    * Preloads critical fonts.
    * @default true
    */
  var preloadFonts: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove inlined rules from the external stylesheet.
    * @default true
    */
  var pruneSource: js.UndefOr[Boolean] = js.native
}
object CrittersOptions {
  
  @scala.inline
  def apply(): CrittersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrittersOptions]
  }
  
  @scala.inline
  implicit class CrittersOptionsOps[Self <: CrittersOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditionalStylesheetsVarargs(value: String*): Self = this.set("additionalStylesheets", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalStylesheets(value: js.Array[String]): Self = this.set("additionalStylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalStylesheets: Self = this.set("additionalStylesheets", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setFonts(value: Boolean): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setInlineFonts(value: Boolean): Self = this.set("inlineFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineFonts: Self = this.set("inlineFonts", js.undefined)
    
    @scala.inline
    def setInlineThreshold(value: Double): Self = this.set("inlineThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineThreshold: Self = this.set("inlineThreshold", js.undefined)
    
    @scala.inline
    def setKeyframes(value: KeyframeStrategy): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMergeStylesheets(value: Boolean): Self = this.set("mergeStylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeStylesheets: Self = this.set("mergeStylesheets", js.undefined)
    
    @scala.inline
    def setMinimumExternalSize(value: Double): Self = this.set("minimumExternalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumExternalSize: Self = this.set("minimumExternalSize", js.undefined)
    
    @scala.inline
    def setNoscriptFallback(value: Boolean): Self = this.set("noscriptFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoscriptFallback: Self = this.set("noscriptFallback", js.undefined)
    
    @scala.inline
    def setPreload(value: body | media | swap | js_ | `js-lazy`): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setPreloadFonts(value: Boolean): Self = this.set("preloadFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadFonts: Self = this.set("preloadFonts", js.undefined)
    
    @scala.inline
    def setPruneSource(value: Boolean): Self = this.set("pruneSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePruneSource: Self = this.set("pruneSource", js.undefined)
  }
}
