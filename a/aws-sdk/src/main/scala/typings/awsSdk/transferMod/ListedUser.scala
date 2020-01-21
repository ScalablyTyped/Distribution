package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedUser extends js.Object {
  /**
    * This property is the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * This value specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * The type of landing directory (folder) you mapped for your users' home directory. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their SFTP clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make S3 paths visible to your user.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * The role in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows the SFTP server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  /**
    * This value is the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeyCount] = js.native
  /**
    * The name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.native
}

object ListedUser {
  @scala.inline
  def apply(
    Arn: Arn,
    HomeDirectory: HomeDirectory = null,
    HomeDirectoryType: HomeDirectoryType = null,
    Role: Role = null,
    SshPublicKeyCount: Int | Double = null,
    UserName: UserName = null
  ): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory.asInstanceOf[js.Any])
    if (HomeDirectoryType != null) __obj.updateDynamic("HomeDirectoryType")(HomeDirectoryType.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (SshPublicKeyCount != null) __obj.updateDynamic("SshPublicKeyCount")(SshPublicKeyCount.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
}

