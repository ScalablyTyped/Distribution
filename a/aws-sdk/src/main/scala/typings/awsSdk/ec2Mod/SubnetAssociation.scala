package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetAssociation extends StObject {
  
  /**
    * The state of the subnet association.
    */
  var State: js.UndefOr[TransitGatewayMulitcastDomainAssociationState] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}
object SubnetAssociation {
  
  @scala.inline
  def apply(): SubnetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetAssociation]
  }
  
  @scala.inline
  implicit class SubnetAssociationMutableBuilder[Self <: SubnetAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: TransitGatewayMulitcastDomainAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
