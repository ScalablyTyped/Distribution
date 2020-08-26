package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeRange extends js.Object {
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.native
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.native
}

object AgeRange {
  @scala.inline
  def apply(): AgeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRange]
  }
  @scala.inline
  implicit class AgeRangeOps[Self <: AgeRange] (val x: Self) extends AnyVal {
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
    def setHigh(value: UInteger): Self = this.set("High", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("High", js.undefined)
    @scala.inline
    def setLow(value: UInteger): Self = this.set("Low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("Low", js.undefined)
  }
  
}

