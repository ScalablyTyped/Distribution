package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedUser extends StObject {
  
  /**
    * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.undefined
  
  /**
    * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.undefined
  
  /**
    * Specifies the role that is in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.undefined
  
  /**
    * Specifies the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeyCount] = js.undefined
  
  /**
    * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.undefined
}
object ListedUser {
  
  inline def apply(Arn: Arn): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
  
  extension [Self <: ListedUser](x: Self) {
    
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
