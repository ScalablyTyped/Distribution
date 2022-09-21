package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxOntapResponse extends StObject {
  
  /**
    * The time that the location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the FSx for ONTAP file system.
    */
  var FsxFilesystemArn: js.UndefOr[typings.awsSdk.datasyncMod.FsxFilesystemArn] = js.undefined
  
  /**
    * The ARN of the FSx for ONTAP file system location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The uniform resource identifier (URI) of the FSx for ONTAP file system location.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
  
  var Protocol: js.UndefOr[FsxProtocol] = js.undefined
  
  /**
    * The security groups that DataSync uses to access your FSx for ONTAP file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined
  
  /**
    * The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data to or from.
    */
  var StorageVirtualMachineArn: js.UndefOr[typings.awsSdk.datasyncMod.StorageVirtualMachineArn] = js.undefined
}
object DescribeLocationFsxOntapResponse {
  
  inline def apply(): DescribeLocationFsxOntapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationFsxOntapResponse]
  }
  
  extension [Self <: DescribeLocationFsxOntapResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFsxFilesystemArn(value: FsxFilesystemArn): Self = StObject.set(x, "FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setFsxFilesystemArnUndefined: Self = StObject.set(x, "FsxFilesystemArn", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setProtocol(value: FsxProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsUndefined: Self = StObject.set(x, "SecurityGroupArns", js.undefined)
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setStorageVirtualMachineArn(value: StorageVirtualMachineArn): Self = StObject.set(x, "StorageVirtualMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineArnUndefined: Self = StObject.set(x, "StorageVirtualMachineArn", js.undefined)
  }
}
