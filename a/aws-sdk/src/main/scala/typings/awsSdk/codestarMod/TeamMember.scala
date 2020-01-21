package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMember extends js.Object {
  /**
    * The role assigned to the user in the project. Project roles have different levels of access. For more information, see Working with Teams in the AWS CodeStar User Guide. 
    */
  var projectRole: Role = js.native
  /**
    * Whether the user is allowed to remotely access project resources using an SSH public/private key pair.
    */
  var remoteAccessAllowed: js.UndefOr[RemoteAccessAllowed] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn = js.native
}

object TeamMember {
  @scala.inline
  def apply(projectRole: Role, userArn: UserArn, remoteAccessAllowed: js.UndefOr[Boolean] = js.undefined): TeamMember = {
    val __obj = js.Dynamic.literal(projectRole = projectRole.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteAccessAllowed)) __obj.updateDynamic("remoteAccessAllowed")(remoteAccessAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
}

