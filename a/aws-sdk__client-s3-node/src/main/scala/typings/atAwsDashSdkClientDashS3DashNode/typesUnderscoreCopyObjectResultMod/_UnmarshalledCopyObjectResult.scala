package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCopyObjectResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCopyObjectResult extends _CopyObjectResult {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledCopyObjectResult: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledCopyObjectResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: Date = null): _UnmarshalledCopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledCopyObjectResult]
  }
}

