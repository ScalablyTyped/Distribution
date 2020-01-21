package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConfig extends js.Object {
  /**
    * The default branch for the Git repository.
    */
  var Branch: js.UndefOr[typings.awsSdk.sagemakerMod.Branch] = js.native
  /**
    * The URL where the Git repository is located.
    */
  var RepositoryUrl: GitConfigUrl = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.sagemakerMod.SecretArn] = js.native
}

object GitConfig {
  @scala.inline
  def apply(RepositoryUrl: GitConfigUrl, Branch: Branch = null, SecretArn: SecretArn = null): GitConfig = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any])
    if (Branch != null) __obj.updateDynamic("Branch")(Branch.asInstanceOf[js.Any])
    if (SecretArn != null) __obj.updateDynamic("SecretArn")(SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConfig]
  }
}

