package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobHeaders extends js.Object {
  var cacheControl: js.UndefOr[java.lang.String] = js.undefined
  var contentDisposition: js.UndefOr[java.lang.String] = js.undefined
  var contentEncoding: js.UndefOr[java.lang.String] = js.undefined
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
}

object BlobHeaders {
  @scala.inline
  def apply(
    cacheControl: java.lang.String = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null
  ): BlobHeaders = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[BlobHeaders]
  }
}

