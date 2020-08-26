package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateSystemTemplateRequest extends js.Object {
  /**
    * The ID of the system to delete. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
}

object DeprecateSystemTemplateRequest {
  @scala.inline
  def apply(id: Urn): DeprecateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateSystemTemplateRequest]
  }
  @scala.inline
  implicit class DeprecateSystemTemplateRequestOps[Self <: DeprecateSystemTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

