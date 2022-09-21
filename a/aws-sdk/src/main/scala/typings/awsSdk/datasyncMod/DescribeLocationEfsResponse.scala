package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationEfsResponse extends StObject {
  
  /**
    * The ARN of the access point that DataSync uses to access the Amazon EFS file system.
    */
  var AccessPointArn: js.UndefOr[EfsAccessPointArn] = js.undefined
  
  /**
    * The time that the location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var Ec2Config: js.UndefOr[typings.awsSdk.datasyncMod.Ec2Config] = js.undefined
  
  /**
    * The Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file system.
    */
  var FileSystemAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Describes whether DataSync uses Transport Layer Security (TLS) encryption when copying data to or from the Amazon EFS file system.
    */
  var InTransitEncryption: js.UndefOr[EfsInTransitEncryption] = js.undefined
  
  /**
    * The ARN of the Amazon EFS file system location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the Amazon EFS file system location.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
}
object DescribeLocationEfsResponse {
  
  inline def apply(): DescribeLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationEfsResponse]
  }
  
  extension [Self <: DescribeLocationEfsResponse](x: Self) {
    
    inline def setAccessPointArn(value: EfsAccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEc2Config(value: Ec2Config): Self = StObject.set(x, "Ec2Config", value.asInstanceOf[js.Any])
    
    inline def setEc2ConfigUndefined: Self = StObject.set(x, "Ec2Config", js.undefined)
    
    inline def setFileSystemAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "FileSystemAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAccessRoleArnUndefined: Self = StObject.set(x, "FileSystemAccessRoleArn", js.undefined)
    
    inline def setInTransitEncryption(value: EfsInTransitEncryption): Self = StObject.set(x, "InTransitEncryption", value.asInstanceOf[js.Any])
    
    inline def setInTransitEncryptionUndefined: Self = StObject.set(x, "InTransitEncryption", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
  }
}
