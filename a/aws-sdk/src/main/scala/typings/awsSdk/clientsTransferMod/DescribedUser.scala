package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedUser extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The landing directory (folder) for a user when they log in to the server using the client. A HomeDirectory example is /bucket_name/home/mydirectory.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectory] = js.undefined
  
  /**
    * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your user and how you want to make them visible. You must specify the Entry and Target pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Identity and Access Management (IAM) role provides access to paths in Target. This value can be set only when HomeDirectoryType is set to LOGICAL. In most cases, you can use this value instead of the session policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.
    */
  var HomeDirectoryMappings: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectoryMappings] = js.undefined
  
  /**
    * The type of landing directory (folder) that you want your users' home directory to be when they log in to the server. If you set it to PATH, the user will see the absolute Amazon S3 bucket or EFS paths as is in their file transfer protocol clients. If you set it LOGICAL, you need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 or Amazon EFS paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectoryType] = js.undefined
  
  /**
    * A session policy for your user so that you can use the same Identity and Access Management (IAM) role across multiple users. This policy scopes down a user's access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsTransferMod.Policy] = js.undefined
  
  /**
    * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon Elastic File System (Amazon EFS) file systems. The POSIX permissions that are set on files and directories in your file system determine the level of access your users get when transferring files into and out of your Amazon EFS file systems.
    */
  var PosixProfile: js.UndefOr[typings.awsSdk.clientsTransferMod.PosixProfile] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. The policies attached to this role determine the level of access that you want to provide your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file system. The IAM role should also contain a trust relationship that allows the server to access your resources when servicing your users' transfer requests.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsTransferMod.Role] = js.undefined
  
  /**
    * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
    */
  var SshPublicKeys: js.UndefOr[typings.awsSdk.clientsTransferMod.SshPublicKeys] = js.undefined
  
  /**
    * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * Specifies the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your server.
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsTransferMod.UserName] = js.undefined
}
object DescribedUser {
  
  inline def apply(Arn: Arn): DescribedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedUser]
  }
  
  extension [Self <: DescribedUser](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectory(value: HomeDirectory): Self = StObject.set(x, "HomeDirectory", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryMappings(value: HomeDirectoryMappings): Self = StObject.set(x, "HomeDirectoryMappings", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "HomeDirectoryMappings", js.undefined)
    
    inline def setHomeDirectoryMappingsVarargs(value: HomeDirectoryMapEntry*): Self = StObject.set(x, "HomeDirectoryMappings", js.Array(value*))
    
    inline def setHomeDirectoryType(value: HomeDirectoryType): Self = StObject.set(x, "HomeDirectoryType", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "HomeDirectoryType", js.undefined)
    
    inline def setHomeDirectoryUndefined: Self = StObject.set(x, "HomeDirectory", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPosixProfile(value: PosixProfile): Self = StObject.set(x, "PosixProfile", value.asInstanceOf[js.Any])
    
    inline def setPosixProfileUndefined: Self = StObject.set(x, "PosixProfile", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSshPublicKeys(value: SshPublicKeys): Self = StObject.set(x, "SshPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeysUndefined: Self = StObject.set(x, "SshPublicKeys", js.undefined)
    
    inline def setSshPublicKeysVarargs(value: SshPublicKey*): Self = StObject.set(x, "SshPublicKeys", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
