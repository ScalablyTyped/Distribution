package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefaultConfig extends js.Object {
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.native
}

object FunctionDefaultConfig {
  @scala.inline
  def apply(): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
  @scala.inline
  implicit class FunctionDefaultConfigOps[Self <: FunctionDefaultConfig] (val x: Self) extends AnyVal {
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
    def setExecution(value: FunctionDefaultExecutionConfig): Self = this.set("Execution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution: Self = this.set("Execution", js.undefined)
  }
  
}

