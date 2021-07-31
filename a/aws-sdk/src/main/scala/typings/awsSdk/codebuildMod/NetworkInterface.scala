package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
