package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputerResult extends js.Object {
  /**
    * A Computer object that represents the computer account.
    */
  var Computer: js.UndefOr[typings.awsSdk.directoryserviceMod.Computer] = js.native
}

object CreateComputerResult {
  @scala.inline
  def apply(): CreateComputerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComputerResult]
  }
  @scala.inline
  implicit class CreateComputerResultOps[Self <: CreateComputerResult] (val x: Self) extends AnyVal {
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
    def setComputer(value: Computer): Self = this.set("Computer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputer: Self = this.set("Computer", js.undefined)
  }
  
}

