package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUpdateRequest extends js.Object {
  
  /**
    * The name of the Amazon EKS cluster associated with the update.
    */
  var name: String = js.native
  
  /**
    * The name of the Amazon EKS node group associated with the update.
    */
  var nodegroupName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the update to describe.
    */
  var updateId: String = js.native
}
object DescribeUpdateRequest {
  
  @scala.inline
  def apply(name: String, updateId: String): DescribeUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], updateId = updateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateRequest]
  }
  
  @scala.inline
  implicit class DescribeUpdateRequestOps[Self <: DescribeUpdateRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateId(value: String): Self = this.set("updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupName(value: String): Self = this.set("nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodegroupName: Self = this.set("nodegroupName", js.undefined)
  }
}
