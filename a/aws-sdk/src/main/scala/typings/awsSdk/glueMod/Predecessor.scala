package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predecessor extends js.Object {
  /**
    * The name of the job definition used by the predecessor job run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The job-run ID of the predecessor job run.
    */
  var RunId: js.UndefOr[IdString] = js.native
}

object Predecessor {
  @scala.inline
  def apply(): Predecessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predecessor]
  }
  @scala.inline
  implicit class PredecessorOps[Self <: Predecessor] (val x: Self) extends AnyVal {
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
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunId: Self = this.set("RunId", js.undefined)
  }
  
}

