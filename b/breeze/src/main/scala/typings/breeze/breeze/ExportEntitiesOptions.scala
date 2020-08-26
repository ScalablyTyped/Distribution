package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportEntitiesOptions extends js.Object {
  var asString: Boolean = js.native
    // default true
  var includeMetadata: Boolean = js.native
}

object ExportEntitiesOptions {
  @scala.inline
  def apply(asString: Boolean, includeMetadata: Boolean): ExportEntitiesOptions = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportEntitiesOptions]
  }
  @scala.inline
  implicit class ExportEntitiesOptionsOps[Self <: ExportEntitiesOptions] (val x: Self) extends AnyVal {
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
    def setAsString(value: Boolean): Self = this.set("asString", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMetadata(value: Boolean): Self = this.set("includeMetadata", value.asInstanceOf[js.Any])
  }
  
}

