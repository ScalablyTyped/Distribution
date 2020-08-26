package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionFormat extends js.Object {
  var desc: String = js.native
  var extension: String = js.native
  var format: String = js.native
  var id: String = js.native
}

object ConversionFormat {
  @scala.inline
  def apply(desc: String, extension: String, format: String, id: String): ConversionFormat = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionFormat]
  }
  @scala.inline
  implicit class ConversionFormatOps[Self <: ConversionFormat] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

