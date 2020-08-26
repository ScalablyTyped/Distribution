package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTapesInput extends js.Object {
  /**
    * An optional number limit for the tapes in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * A string that indicates the position at which to begin the returned list of tapes.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object ListTapesInput {
  @scala.inline
  def apply(): ListTapesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapesInput]
  }
  @scala.inline
  implicit class ListTapesInputOps[Self <: ListTapesInput] (val x: Self) extends AnyVal {
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
    def setLimit(value: PositiveIntObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTapeARNsVarargs(value: TapeARN*): Self = this.set("TapeARNs", js.Array(value :_*))
    @scala.inline
    def setTapeARNs(value: TapeARNs): Self = this.set("TapeARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeARNs: Self = this.set("TapeARNs", js.undefined)
  }
  
}

