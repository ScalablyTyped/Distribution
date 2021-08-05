package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxWindowsRequest extends StObject {
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  var FsxFilesystemArn: typings.awsSdk.datasyncMod.FsxFilesystemArn
  
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var Password: SmbPassword
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
    */
  var Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.undefined
  
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: SmbUser
}
object CreateLocationFsxWindowsRequest {
  
  inline def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Password: SmbPassword,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    User: SmbUser
  ): CreateLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
  }
  
  extension [Self <: CreateLocationFsxWindowsRequest](x: Self) {
    
    inline def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setFsxFilesystemArn(value: FsxFilesystemArn): Self = StObject.set(x, "FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: SmbPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value :_*))
    
    inline def setSubdirectory(value: FsxWindowsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
