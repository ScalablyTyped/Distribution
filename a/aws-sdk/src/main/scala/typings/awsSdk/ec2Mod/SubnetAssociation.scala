package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetAssociation extends StObject {
  
  /**
    * The state of the subnet association.
    */
  var State: js.UndefOr[TransitGatewayMulitcastDomainAssociationState] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}
object SubnetAssociation {
  
  inline def apply(): SubnetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetAssociation]
  }
  
  extension [Self <: SubnetAssociation](x: Self) {
    
    inline def setState(value: TransitGatewayMulitcastDomainAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
