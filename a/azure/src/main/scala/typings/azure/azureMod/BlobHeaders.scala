package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobHeaders extends js.Object {
  var cacheControl: js.UndefOr[String] = js.undefined
  var contentDisposition: js.UndefOr[String] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  var contentLanguage: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
}

object BlobHeaders {
  @scala.inline
  def apply(
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null
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

