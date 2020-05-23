package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: typings.awsSdk.codestarconnectionsMod.ConnectionArn = js.native
  /**
    * Specifies the tags applied to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateConnectionOutput {
  @scala.inline
  def apply(ConnectionArn: ConnectionArn, Tags: TagList = null): CreateConnectionOutput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionOutput]
  }
}

