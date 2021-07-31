package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationFsxWindowsResponse extends StObject {
  
  /**
    * The time that the FSx for Windows location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the FSx for Windows location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the FSx for Windows file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.undefined
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: js.UndefOr[SmbUser] = js.undefined
}
object DescribeLocationFsxWindowsResponse {
  
  @scala.inline
  def apply(): DescribeLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationFsxWindowsResponseMutableBuilder[Self <: DescribeLocationFsxWindowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupArnsUndefined: Self = StObject.set(x, "SecurityGroupArns", js.undefined)
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
