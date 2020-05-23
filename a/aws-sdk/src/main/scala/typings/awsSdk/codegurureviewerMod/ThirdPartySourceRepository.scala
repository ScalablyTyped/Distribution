package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartySourceRepository extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) identifying the repository connection. 
    */
  var ConnectionArn: typings.awsSdk.codegurureviewerMod.ConnectionArn = js.native
  /**
    *  The name of the third party source repository. 
    */
  var Name: typings.awsSdk.codegurureviewerMod.Name = js.native
  /**
    *  The username of the owner of the repository. 
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

