package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapesInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * Specifies that the number of virtual tapes described be limited to the specified number.  Amazon Web Services may impose its own limit, if this field is not set. 
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * A marker value, obtained in a previous call to DescribeTapes. This marker indicates which page of results to retrieve. If not specified, the first page of results is retrieved.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the specified gateway.
    */
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.native
}

object DescribeTapesInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeTapesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapesInput]
  }
  @scala.inline
  implicit class DescribeTapesInputOps[Self <: DescribeTapesInput] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
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

