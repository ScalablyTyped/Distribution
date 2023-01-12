package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedUser extends StObject {
  
  /**
    * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The landing directory (folder) for a user when they log in to the server using the client. A HomeDirectory example is /bucket_name/home/mydirectory.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectory] = js.undefined
  
  /**
    * The type of landing directory (folder) that you want your users' home directory to be when they log in to the server. If you set it to PATH, the user will see the absolute Amazon S3 bucket or EFS paths as is in their file transfer protocol clients. If you set it LOGICAL, you need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 or Amazon EFS paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectoryType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. The policies attached to this role determine the level of access that you want to provide your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file system. The IAM role should also contain a trust relationship that allows the server to access your resources when servicing your users' transfer requests.  The IAM role that controls your users' access to your Amazon S3 bucket for servers with Domain=S3, or your EFS file system for servers with Domain=EFS.  The policies attached to this role determine the level of access you want to provide your users when transferring files into and out of your S3 buckets or EFS file systems. 
    */
  var Role: js.UndefOr[typings.awsSdk.clientsTransferMod.Role] = js.undefined
  
  /**
    * Specifies the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typings.awsSdk.clientsTransferMod.SshPublicKeyCount] = js.undefined
  
  /**
    * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsTransferMod.UserName] = js.undefined
}
object ListedUser {
  
  inline def apply(Arn: Arn): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListedUser] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectory(value: HomeDirectory): Self = StObject.set(x, "HomeDirectory", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryType(value: HomeDirectoryType): Self = StObject.set(x, "HomeDirectoryType", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "HomeDirectoryType", js.undefined)
    
    inline def setHomeDirectoryUndefined: Self = StObject.set(x, "HomeDirectory", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSshPublicKeyCount(value: SshPublicKeyCount): Self = StObject.set(x, "SshPublicKeyCount", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyCountUndefined: Self = StObject.set(x, "SshPublicKeyCount", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
