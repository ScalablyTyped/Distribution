package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterResourceRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to deregister.
    */
  var ResourceArn: ResourceArnString = js.native
}
object DeregisterResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DeregisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterResourceRequest]
  }
  
  @scala.inline
  implicit class DeregisterResourceRequestOps[Self <: DeregisterResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: ResourceArnString): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
}
