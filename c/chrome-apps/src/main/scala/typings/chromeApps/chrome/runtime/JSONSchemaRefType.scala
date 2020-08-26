package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchemaRefType extends js.Object {
  @JSName("$ref")
  var $ref: String = js.native
}

object JSONSchemaRefType {
  @scala.inline
  def apply($ref: String): JSONSchemaRefType = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaRefType]
  }
  @scala.inline
  implicit class JSONSchemaRefTypeOps[Self <: JSONSchemaRefType] (val x: Self) extends AnyVal {
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
  }
  
}

