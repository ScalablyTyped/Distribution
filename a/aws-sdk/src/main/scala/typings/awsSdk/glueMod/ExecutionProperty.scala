package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
    */
  var MaxConcurrentRuns: js.UndefOr[typings.awsSdk.glueMod.MaxConcurrentRuns] = js.native
}

object ExecutionProperty {
  @scala.inline
  def apply(): ExecutionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionProperty]
  }
  @scala.inline
  implicit class ExecutionPropertyOps[Self <: ExecutionProperty] (val x: Self) extends AnyVal {
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
    def setMaxConcurrentRuns(value: MaxConcurrentRuns): Self = this.set("MaxConcurrentRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrentRuns: Self = this.set("MaxConcurrentRuns", js.undefined)
  }
  
}

