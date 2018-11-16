package typings
package chromeDashAppsLib.WebViewNs

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
  var all_frames: js.UndefOr[scala.Boolean] = js.undefined
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[java.lang.String] = js.undefined
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
  var exclude_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Excludes pages that this content script would otherwise be injected into. */
  var exclude_matches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Applied after matches to include only those URLs that also match this glob.
           * Intended to emulate the @include Greasemonkey keyword.
           */
  var include_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * The JavaScript code or a list of JavaScript files to be injected into matching pages.
           * These are injected in the order they appear.
           */
  @JSName("js")
  var `js_`: js.UndefOr[InjectionItems] = js.undefined
  /**
           * Whether to insert the content script on about:blank and about:srcdoc.
           * Content scripts will only be injected on pages when their inherit URL
           * is matched by one of the declared patterns in the matches field.
           * The inherit URL is the URL of the document that created the frame or window.
           * Content scripts cannot be inserted in sandboxed frames.
           */
  var match_about_blank: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies which pages this content script will be injected into. */
  var matches: js.Array[java.lang.String]
  /** The name of the content script to inject. */
  var name: java.lang.String
  /**
           * The soonest that the JavaScript or CSS will be injected into the tab.
           * Defaults to 'document_idle'.
           */
  var run_at: js.UndefOr[chromeDashAppsLib.chromeNs.extensionTypesNs.RunAt] = js.undefined
}

