package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordMarkerDecisionAttributes extends js.Object {
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName = js.native
}

object RecordMarkerDecisionAttributes {
  @scala.inline
  def apply(markerName: MarkerName): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
  @scala.inline
  implicit class RecordMarkerDecisionAttributesOps[Self <: RecordMarkerDecisionAttributes] (val x: Self) extends AnyVal {
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
    def setMarkerName(value: MarkerName): Self = this.set("markerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: Data): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
  
}

