package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateAddressResult extends js.Object {
  
  /**
    * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
    */
  var AssociationId: js.UndefOr[String] = js.native
}
object AssociateAddressResult {
  
  @scala.inline
  def apply(): AssociateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAddressResult]
  }
  
  @scala.inline
  implicit class AssociateAddressResultOps[Self <: AssociateAddressResult] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
  }
}
