package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResult extends js.Object {
  /**
    * An object that contains information about the requested job.
    */
  var job: js.UndefOr[Job] = js.native
}

object GetJobResult {
  @scala.inline
  def apply(): GetJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResult]
  }
  @scala.inline
  implicit class GetJobResultOps[Self <: GetJobResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
  
}

