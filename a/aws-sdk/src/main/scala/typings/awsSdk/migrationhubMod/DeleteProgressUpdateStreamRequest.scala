package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProgressUpdateStreamRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: ProgressUpdateStream = js.native
}

object DeleteProgressUpdateStreamRequest {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteProgressUpdateStreamRequest = {
    val __obj = js.Dynamic.literal(ProgressUpdateStreamName = ProgressUpdateStreamName.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProgressUpdateStreamRequest]
  }
}

