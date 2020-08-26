package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProgressUpdateStreamRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: ProgressUpdateStream = js.native
}

object CreateProgressUpdateStreamRequest {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream): CreateProgressUpdateStreamRequest = {
    val __obj = js.Dynamic.literal(ProgressUpdateStreamName = ProgressUpdateStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgressUpdateStreamRequest]
  }
  @scala.inline
  implicit class CreateProgressUpdateStreamRequestOps[Self <: CreateProgressUpdateStreamRequest] (val x: Self) extends AnyVal {
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
    def setProgressUpdateStreamName(value: ProgressUpdateStream): Self = this.set("ProgressUpdateStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: DryRun): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

