package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOpsItemResponse extends js.Object {
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.native
}
object CreateOpsItemResponse {
  
  @scala.inline
  def apply(): CreateOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpsItemResponse]
  }
  
  @scala.inline
  implicit class CreateOpsItemResponseOps[Self <: CreateOpsItemResponse] (val x: Self) extends AnyVal {
    
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
    def setOpsItemId(value: String): Self = this.set("OpsItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpsItemId: Self = this.set("OpsItemId", js.undefined)
  }
}
