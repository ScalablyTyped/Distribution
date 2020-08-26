package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBuildBatchOutput extends js.Object {
  var buildBatch: js.UndefOr[BuildBatch] = js.native
}

object StopBuildBatchOutput {
  @scala.inline
  def apply(): StopBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBuildBatchOutput]
  }
  @scala.inline
  implicit class StopBuildBatchOutputOps[Self <: StopBuildBatchOutput] (val x: Self) extends AnyVal {
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
    def setBuildBatch(value: BuildBatch): Self = this.set("buildBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildBatch: Self = this.set("buildBatch", js.undefined)
  }
  
}

