package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTapesOutput extends js.Object {
  /**
    * A string that indicates the position at which to begin returning the next list of tapes. Use the marker in your next request to continue pagination of tapes. If there are no more tapes to list, this element does not appear in the response body.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  var TapeInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeInfos] = js.native
}

object ListTapesOutput {
  @scala.inline
  def apply(): ListTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesOutput]
  }
  @scala.inline
  implicit class ListTapesOutputOps[Self <: ListTapesOutput] (val x: Self) extends AnyVal {
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTapeInfosVarargs(value: TapeInfo*): Self = this.set("TapeInfos", js.Array(value :_*))
    @scala.inline
    def setTapeInfos(value: TapeInfos): Self = this.set("TapeInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeInfos: Self = this.set("TapeInfos", js.undefined)
  }
  
}

