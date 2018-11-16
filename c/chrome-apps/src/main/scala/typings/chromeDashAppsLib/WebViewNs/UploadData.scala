package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains data uploaded in a URL request.
     * @since Chrome 23.
     */

trait UploadData extends js.Object {
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[java.lang.String] = js.undefined
}

