package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayResult extends StObject {
  
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsSdk.ec2Mod.TransitGateway] = js.native
}
object DeleteTransitGatewayResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayResultMutableBuilder[Self <: DeleteTransitGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
