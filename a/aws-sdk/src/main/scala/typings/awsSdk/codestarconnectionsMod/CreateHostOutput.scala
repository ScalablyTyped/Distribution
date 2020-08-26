package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the host to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.native
}

object CreateHostOutput {
  @scala.inline
  def apply(): CreateHostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHostOutput]
  }
  @scala.inline
  implicit class CreateHostOutputOps[Self <: CreateHostOutput] (val x: Self) extends AnyVal {
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
    def setHostArn(value: HostArn): Self = this.set("HostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostArn: Self = this.set("HostArn", js.undefined)
  }
  
}

