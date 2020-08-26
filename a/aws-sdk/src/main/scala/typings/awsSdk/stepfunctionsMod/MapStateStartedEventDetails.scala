package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStateStartedEventDetails extends js.Object {
  /**
    * The size of the array for Map state iterations.
    */
  var length: js.UndefOr[UnsignedInteger] = js.native
}

object MapStateStartedEventDetails {
  @scala.inline
  def apply(): MapStateStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateStartedEventDetails]
  }
  @scala.inline
  implicit class MapStateStartedEventDetailsOps[Self <: MapStateStartedEventDetails] (val x: Self) extends AnyVal {
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
    def setLength(value: UnsignedInteger): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

