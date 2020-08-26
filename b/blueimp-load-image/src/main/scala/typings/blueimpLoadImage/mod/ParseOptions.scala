package typings.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  // Disables creating the imageHead property.
  var disableImageHead: js.UndefOr[Boolean] = js.native
  // Defines the maximum number of bytes to parse.
  var maxMetaDataSize: js.UndefOr[Double] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setDisableImageHead(value: Boolean): Self = this.set("disableImageHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableImageHead: Self = this.set("disableImageHead", js.undefined)
    @scala.inline
    def setMaxMetaDataSize(value: Double): Self = this.set("maxMetaDataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMetaDataSize: Self = this.set("maxMetaDataSize", js.undefined)
  }
  
}

