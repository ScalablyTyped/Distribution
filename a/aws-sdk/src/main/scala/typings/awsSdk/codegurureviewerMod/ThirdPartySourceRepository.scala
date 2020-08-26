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
  @scala.inline
  implicit class ThirdPartySourceRepositoryOps[Self <: ThirdPartySourceRepository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionArn(value: ConnectionArn): Self = this.set("ConnectionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
  }
  
}

