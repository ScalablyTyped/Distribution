package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientPropertiesRequest extends js.Object {
  
  /**
    * The resource identifier, in the form of directory IDs.
    */
  var ResourceIds: ResourceIdList = js.native
}
object DescribeClientPropertiesRequest {
  
  @scala.inline
  def apply(ResourceIds: ResourceIdList): DescribeClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientPropertiesRequest]
  }
  
  @scala.inline
  implicit class DescribeClientPropertiesRequestOps[Self <: DescribeClientPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceIdsVarargs(value: NonEmptyString*): Self = this.set("ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceIds(value: ResourceIdList): Self = this.set("ResourceIds", value.asInstanceOf[js.Any])
  }
}
