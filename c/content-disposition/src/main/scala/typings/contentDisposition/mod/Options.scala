package typings.contentDisposition.mod

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If the filename option is outside ISO-8859-1,
    * then the file name is actually stored in a supplemental field for clients
    * that support Unicode file names and a ISO-8859-1 version of the file name is automatically generated
    * @default true
    */
  var fallback: js.UndefOr[String | Boolean] = js.native
  /**
    * Specifies the disposition type.
    * This can also be "inline", or any other value (all values except `inline` are treated like attachment,
    * but can convey additional information if both parties agree to it).
    * The `type` is normalized to lower-case.
    * @default 'attachment'
    */
  var `type`: js.UndefOr[attachment | `inline` | String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFallback(value: String | Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setType(value: attachment | `inline` | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

