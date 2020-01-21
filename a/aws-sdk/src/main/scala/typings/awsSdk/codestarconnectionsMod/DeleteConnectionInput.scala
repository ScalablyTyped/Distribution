package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConnectionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the connection to be deleted.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: typings.awsSdk.codestarconnectionsMod.ConnectionArn = js.native
}

object DeleteConnectionInput {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn): DeleteConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConnectionInput]
  }
}

