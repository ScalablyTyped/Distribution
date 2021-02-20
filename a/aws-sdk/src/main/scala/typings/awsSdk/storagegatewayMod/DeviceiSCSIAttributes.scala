package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceiSCSIAttributes extends StObject {
  
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * The network interface identifier of the VTL device.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.storagegatewayMod.NetworkInterfaceId] = js.native
  
  /**
    * The port used to communicate with iSCSI VTL device targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.native
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or media changer target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}
object DeviceiSCSIAttributes {
  
  @scala.inline
  def apply(): DeviceiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceiSCSIAttributes]
  }
  
  @scala.inline
  implicit class DeviceiSCSIAttributesMutableBuilder[Self <: DeviceiSCSIAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChapEnabled(value: scala.Boolean): Self = StObject.set(x, "ChapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapEnabledUndefined: Self = StObject.set(x, "ChapEnabled", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePort(value: integer): Self = StObject.set(x, "NetworkInterfacePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacePortUndefined: Self = StObject.set(x, "NetworkInterfacePort", js.undefined)
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
