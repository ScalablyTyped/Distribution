package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  /** Optional. An ArrayBuffer with a copy of the data. */
  var bytes: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /** Optional. A string with the file's path and name. */
  var file: js.UndefOr[java.lang.String] = js.undefined
}

object UploadData {
  @scala.inline
  def apply(bytes: stdLib.ArrayBuffer = null, file: java.lang.String = null): UploadData = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[UploadData]
  }
}

