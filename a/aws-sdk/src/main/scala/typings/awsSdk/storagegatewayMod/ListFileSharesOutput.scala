package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFileSharesOutput extends js.Object {
  /**
    * An array of information about the file gateway's file shares.
    */
  var FileShareInfoList: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareInfoList] = js.native
  /**
    * If the request includes Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object ListFileSharesOutput {
  @scala.inline
  def apply(): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSharesOutput]
  }
  @scala.inline
  implicit class ListFileSharesOutputOps[Self <: ListFileSharesOutput] (val x: Self) extends AnyVal {
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
    def setFileShareInfoListVarargs(value: FileShareInfo*): Self = this.set("FileShareInfoList", js.Array(value :_*))
    @scala.inline
    def setFileShareInfoList(value: FileShareInfoList): Self = this.set("FileShareInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareInfoList: Self = this.set("FileShareInfoList", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

