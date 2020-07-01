package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartySourceRepository extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see Connection in the AWS CodeStar Connections API Reference. 
    */
  var ConnectionArn: typings.awsSdk.codegurureviewerMod.ConnectionArn = js.native
  /**
    *  The name of the third party source repository. 
    */
  var Name: typings.awsSdk.codegurureviewerMod.Name = js.native
  /**
    *  The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for the account that owns the repository. 
    */
  var Owner: typings.awsSdk.codegurureviewerMod.Owner = js.native
}

object ThirdPartySourceRepository {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn, Name: Name, Owner: Owner): ThirdPartySourceRepository = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartySourceRepository]
  }
}

