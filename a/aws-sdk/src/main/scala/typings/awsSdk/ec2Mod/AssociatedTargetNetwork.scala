package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedTargetNetwork extends StObject {
  
  /**
    * The ID of the subnet.
    */
  var NetworkId: js.UndefOr[String] = js.native
  
  /**
    * The target network type.
    */
  var NetworkType: js.UndefOr[AssociatedNetworkType] = js.native
}
object AssociatedTargetNetwork {
  
  @scala.inline
  def apply(): AssociatedTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedTargetNetwork]
  }
  
  @scala.inline
  implicit class AssociatedTargetNetworkMutableBuilder[Self <: AssociatedTargetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: String): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    @scala.inline
    def setNetworkType(value: AssociatedNetworkType): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
  }
}
