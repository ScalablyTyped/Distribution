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
  def apply(FileShareInfoList: FileShareInfoList = null, Marker: Marker = null, NextMarker: Marker = null): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareInfoList != null) __obj.updateDynamic("FileShareInfoList")(FileShareInfoList.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileSharesOutput]
  }
}

