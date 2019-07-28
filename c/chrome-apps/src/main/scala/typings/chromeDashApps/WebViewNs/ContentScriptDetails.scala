package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.extensionTypesNs.RunAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details of the content script to inject. **/
trait ContentScriptDetails extends js.Object {
  /**
    * If all_frames is true, this implies that the JavaScript or CSS should be injected into all frames of current page.
    * By default, all_frames is false and the JavaScript or CSS is only injected into the top frame.
    * @default false
    */
  var all_frames: js.UndefOr[Boolean] = js.undefined
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.undefined
  /**
    * The CSS code or a list of CSS files to be injected into matching pages.
    * These are injected in the order they appear,
    * before any DOM is constructed or displayed for the page.
    */
  var css: js.UndefOr[InjectionItems] = js.undefined
  /**
    * Applied after matches to exclude URLs that match this glob.
    * Intended to emulate the @exclude Greasemonkey keyword.
    */
  var exclude_globs: js.UndefOr[js.Array[String]] = js.undefined
  /** Excludes pages that this content script would otherwise be injected into. */
  var exclude_matches: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Applied after matches to include only those URLs that also match this glob.
    * Intended to emulate the @include Greasemonkey keyword.
    */
  var include_globs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The JavaScript code or a list of JavaScript files to be injected into matching pages.
    * These are injected in the order they appear.
    */
  @JSName("js")
  var js_ : js.UndefOr[InjectionItems] = js.undefined
  /**
    * Whether to insert the content script on about:blank and about:srcdoc.
    * Content scripts will only be injected on pages when their inherit URL
    * is matched by one of the declared patterns in the matches field.
    * The inherit URL is the URL of the document that created the frame or window.
    * Content scripts cannot be inserted in sandboxed frames.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.undefined
  /** Specifies which pages this content script will be injected into. */
  var matches: js.Array[String]
  /** The name of the content script to inject. */
  var name: String
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * Defaults to 'document_idle'.
    */
  var run_at: js.UndefOr[RunAt] = js.undefined
}

object ContentScriptDetails {
  @scala.inline
  def apply(
    matches: js.Array[String],
    name: String,
    all_frames: js.UndefOr[Boolean] = js.undefined,
    code: String = null,
    css: InjectionItems = null,
    exclude_globs: js.Array[String] = null,
    exclude_matches: js.Array[String] = null,
    include_globs: js.Array[String] = null,
    js_ : InjectionItems = null,
    match_about_blank: js.UndefOr[Boolean] = js.undefined,
    run_at: RunAt = null
  ): ContentScriptDetails = {
    val __obj = js.Dynamic.literal(matches = matches, name = name)
    if (!js.isUndefined(all_frames)) __obj.updateDynamic("all_frames")(all_frames)
    if (code != null) __obj.updateDynamic("code")(code)
    if (css != null) __obj.updateDynamic("css")(css)
    if (exclude_globs != null) __obj.updateDynamic("exclude_globs")(exclude_globs)
    if (exclude_matches != null) __obj.updateDynamic("exclude_matches")(exclude_matches)
    if (include_globs != null) __obj.updateDynamic("include_globs")(include_globs)
    if (js_ != null) __obj.updateDynamic("js")(js_)
    if (!js.isUndefined(match_about_blank)) __obj.updateDynamic("match_about_blank")(match_about_blank)
    if (run_at != null) __obj.updateDynamic("run_at")(run_at)
    __obj.asInstanceOf[ContentScriptDetails]
  }
}

