package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedGateway extends StObject {
  
  /**
    * The ID of the associated gateway.
    */
  var id: js.UndefOr[GatewayIdentifier] = js.undefined
  
  /**
    * The ID of the AWS account that owns the associated virtual private gateway or transit gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The Region where the associated gateway is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The type of associated gateway.
    */
  var `type`: js.UndefOr[GatewayType] = js.undefined
}
object AssociatedGateway {
  
  @scala.inline
  def apply(): AssociatedGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedGateway]
  }
  
  @scala.inline
  implicit class AssociatedGatewayMutableBuilder[Self <: AssociatedGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: GatewayIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setType(value: GatewayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
