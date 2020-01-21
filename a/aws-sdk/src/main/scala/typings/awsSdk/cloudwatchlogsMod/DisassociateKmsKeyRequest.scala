package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateKmsKeyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}

object DisassociateKmsKeyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): DisassociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateKmsKeyRequest]
  }
}

