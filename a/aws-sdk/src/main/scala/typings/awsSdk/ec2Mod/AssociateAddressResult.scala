package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAddressResult extends StObject {
  
  /**
    * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
}
object AssociateAddressResult {
  
  @scala.inline
  def apply(): AssociateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAddressResult]
  }
  
  @scala.inline
  implicit class AssociateAddressResultMutableBuilder[Self <: AssociateAddressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
  }
}
