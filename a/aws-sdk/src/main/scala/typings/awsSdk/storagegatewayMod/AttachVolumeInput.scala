package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachVolumeInput extends StObject {
  
  /**
    * The unique device ID or other distinguishing data that identifies the local disk used to create the volume. This value is only required when you are attaching a stored volume.
    */
  var DiskId: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the gateway that you want to attach the volume to.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway. Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typings.awsSdk.storagegatewayMod.NetworkInterfaceId
  
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume to attach to the specified gateway.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN
}
object AttachVolumeInput {
  
  inline def apply(GatewayARN: GatewayARN, NetworkInterfaceId: NetworkInterfaceId, VolumeARN: VolumeARN): AttachVolumeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVolumeInput]
  }
  
  extension [Self <: AttachVolumeInput](x: Self) {
    
    inline def setDiskId(value: DiskId): Self = StObject.set(x, "DiskId", value.asInstanceOf[js.Any])
    
    inline def setDiskIdUndefined: Self = StObject.set(x, "DiskId", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setTargetName(value: TargetName): Self = StObject.set(x, "TargetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "TargetName", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
