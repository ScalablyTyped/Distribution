package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of injection item: code or a set of files. */

trait InjectionItems extends js.Object {
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The list of JavaScript or CSS files to be injected into matching pages.
           * These are injected in the order they appear in this array.
           */
  var files: js.UndefOr[js.Array[_]] = js.undefined
}

