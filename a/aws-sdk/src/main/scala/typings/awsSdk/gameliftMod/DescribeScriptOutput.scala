package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScriptOutput extends js.Object {
  /**
    * A set of properties describing the requested script.
    */
  var Script: js.UndefOr[typings.awsSdk.gameliftMod.Script] = js.native
}

object DescribeScriptOutput {
  @scala.inline
  def apply(): DescribeScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScriptOutput]
  }
  @scala.inline
  implicit class DescribeScriptOutputOps[Self <: DescribeScriptOutput] (val x: Self) extends AnyVal {
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
    def setScript(value: Script): Self = this.set("Script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("Script", js.undefined)
  }
  
}

