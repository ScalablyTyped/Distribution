package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxWindowsResponse extends StObject {
  
  /**
    * The time that the FSx for Windows File Server location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Windows domain that the FSx for Windows File Server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows File Server location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the FSx for Windows File Server location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the FSx for Windows File Server file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows File Server file system.
    */
  var User: js.UndefOr[SmbUser] = js.undefined
}
object DescribeLocationFsxWindowsResponse {
  
  inline def apply(): DescribeLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
  }
  
  extension [Self <: DescribeLocationFsxWindowsResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsUndefined: Self = StObject.set(x, "SecurityGroupArns", js.undefined)
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
