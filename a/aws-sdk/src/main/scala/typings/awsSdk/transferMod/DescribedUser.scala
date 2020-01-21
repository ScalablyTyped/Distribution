package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribedUser extends js.Object {
  /**
    * This property contains the unique Amazon Resource Name (ARN) for the user that was requested to be described.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * This property specifies the landing directory (or folder), which is the location that files are written to or read from in an Amazon S3 bucket for the described user. An example is /your s3 bucket name/home/username .
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * Logical directory mappings that you specified for what S3 paths and keys should be visible to your user and how you want to make them visible. You will need to specify the "Entry" and "Target" pair, where Entry shows how the path is made visible and Target is the actual S3 path. If you only specify a target, it will be displayed as is. You will need to also make sure that your AWS IAM Role provides access to paths in Target. In most cases, you can use this value instead of the scope down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.  In most cases, you can use this value instead of the scope down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.
    */
  var HomeDirectoryMappings: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryMappings] = js.native
  /**
    * The type of landing directory (folder) you mapped for your users' to see when they log into the SFTP server. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their SFTP clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make S3 paths visible to your user.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * Specifies the name of the policy in use for the described user.
    */
  var Policy: js.UndefOr[typings.awsSdk.transferMod.Policy] = js.native
  /**
    * This property specifies the IAM role that controls your user's access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows the SFTP server to access your resources when servicing your SFTP user's transfer requests.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  /**
    * This property contains the public key portion of the Secure Shell (SSH) keys stored for the described user.
    */
  var SshPublicKeys: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeys] = js.native
  /**
    * This property contains the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.native
  /**
    * This property is the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your SFTP server.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.native
}

object DescribedUser {
  @scala.inline
  def apply(
    Arn: Arn,
    HomeDirectory: HomeDirectory = null,
    HomeDirectoryMappings: HomeDirectoryMappings = null,
    HomeDirectoryType: HomeDirectoryType = null,
    Policy: Policy = null,
    Role: Role = null,
    SshPublicKeys: SshPublicKeys = null,
    Tags: Tags = null,
    UserName: UserName = null
  ): DescribedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory.asInstanceOf[js.Any])
    if (HomeDirectoryMappings != null) __obj.updateDynamic("HomeDirectoryMappings")(HomeDirectoryMappings.asInstanceOf[js.Any])
    if (HomeDirectoryType != null) __obj.updateDynamic("HomeDirectoryType")(HomeDirectoryType.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (SshPublicKeys != null) __obj.updateDynamic("SshPublicKeys")(SshPublicKeys.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedUser]
  }
}

