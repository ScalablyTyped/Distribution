package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserRequest extends StObject {
  
  /**
    * The landing directory (folder) for a user when they log in to the server using the client. A HomeDirectory example is /bucket_name/home/mydirectory.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectory] = js.undefined
  
  /**
    * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your user and how you want to make them visible. You must specify the Entry and Target pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Identity and Access Management (IAM) role provides access to paths in Target. This value can be set only when HomeDirectoryType is set to LOGICAL. The following is an Entry and Target pair example.  [ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]  In most cases, you can use this value instead of the session policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to / and set Target to the HomeDirectory parameter value. The following is an Entry and Target pair example for chroot.  [ { "Entry": "/", "Target": "/bucket_name/home/mydirectory" } ] 
    */
  var HomeDirectoryMappings: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectoryMappings] = js.undefined
  
  /**
    * The type of landing directory (folder) that you want your users' home directory to be when they log in to the server. If you set it to PATH, the user will see the absolute Amazon S3 bucket or EFS paths as is in their file transfer protocol clients. If you set it LOGICAL, you need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 or Amazon EFS paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.clientsTransferMod.HomeDirectoryType] = js.undefined
  
  /**
    * A session policy for your user so that you can use the same Identity and Access Management (IAM) role across multiple users. This policy scopes down a user's access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include ${Transfer:UserName}, ${Transfer:HomeDirectory}, and ${Transfer:HomeBucket}.  This policy applies only when the domain of ServerId is Amazon S3. Amazon EFS does not use session policies. For session policies, Transfer Family stores the policy as a JSON blob, instead of the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the Policy argument. For an example of a session policy, see Example session policy. For more information, see AssumeRole in the Amazon Web Services Security Token Service API Reference. 
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsTransferMod.Policy] = js.undefined
  
  /**
    * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. The POSIX permissions that are set on files and directories in Amazon EFS determine the level of access your users get when transferring files into and out of your Amazon EFS file systems.
    */
  var PosixProfile: js.UndefOr[typings.awsSdk.clientsTransferMod.PosixProfile] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that controls your users' access to your Amazon S3 bucket or Amazon EFS file system. The policies attached to this role determine the level of access that you want to provide your users when transferring files into and out of your Amazon S3 bucket or Amazon EFS file system. The IAM role should also contain a trust relationship that allows the server to access your resources when servicing your users' transfer requests.
    */
  var Role: typings.awsSdk.clientsTransferMod.Role
  
  /**
    * A system-assigned unique identifier for a server instance. This is the specific server that you added your user to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * The public portion of the Secure Shell (SSH) key used to authenticate the user to the server. Transfer Family accepts RSA, ECDSA, and ED25519 keys.
    */
  var SshPublicKeyBody: js.UndefOr[typings.awsSdk.clientsTransferMod.SshPublicKeyBody] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for users. Tags are metadata attached to users for any purpose.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * A unique string that identifies a user and is associated with a ServerId. This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen, period, or at sign.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object CreateUserRequest {
  
  inline def apply(Role: Role, ServerId: ServerId, UserName: UserName): CreateUserRequest = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  extension [Self <: CreateUserRequest](x: Self) {
    
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
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyBody(value: SshPublicKeyBody): Self = StObject.set(x, "SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyBodyUndefined: Self = StObject.set(x, "SshPublicKeyBody", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
