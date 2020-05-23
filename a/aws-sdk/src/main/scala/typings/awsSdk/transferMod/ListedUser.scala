package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedUser extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * The type of landing directory (folder) you mapped for your users' home directory. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * The role in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  /**
    * The number of SSH public keys stored for the user you specified.
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
    SshPublicKeyCount: js.UndefOr[SshPublicKeyCount] = js.undefined,
    UserName: UserName = null
  ): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (HomeDirectory != null) __obj.updateDynamic("HomeDirectory")(HomeDirectory.asInstanceOf[js.Any])
    if (HomeDirectoryType != null) __obj.updateDynamic("HomeDirectoryType")(HomeDirectoryType.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (!js.isUndefined(SshPublicKeyCount)) __obj.updateDynamic("SshPublicKeyCount")(SshPublicKeyCount.get.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
}

