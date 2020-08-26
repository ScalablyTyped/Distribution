package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOutpostOutput extends js.Object {
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.native
}

object CreateOutpostOutput {
  @scala.inline
  def apply(): CreateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutpostOutput]
  }
  @scala.inline
  implicit class CreateOutpostOutputOps[Self <: CreateOutpostOutput] (val x: Self) extends AnyVal {
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
    def setOutpost(value: Outpost): Self = this.set("Outpost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpost: Self = this.set("Outpost", js.undefined)
  }
  
}

