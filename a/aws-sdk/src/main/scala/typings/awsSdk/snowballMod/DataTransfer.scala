package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransfer extends js.Object {
  /**
    * The number of bytes transferred between a Snowball and Amazon S3.
    */
  var BytesTransferred: js.UndefOr[Long] = js.native
  /**
    * The number of objects transferred between a Snowball and Amazon S3.
    */
  var ObjectsTransferred: js.UndefOr[Long] = js.native
  /**
    * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalBytes: js.UndefOr[Long] = js.native
  /**
    * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalObjects: js.UndefOr[Long] = js.native
}

object DataTransfer {
  @scala.inline
  def apply(
    BytesTransferred: js.UndefOr[Long] = js.undefined,
    ObjectsTransferred: js.UndefOr[Long] = js.undefined,
    TotalBytes: js.UndefOr[Long] = js.undefined,
    TotalObjects: js.UndefOr[Long] = js.undefined
  ): DataTransfer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesTransferred)) __obj.updateDynamic("BytesTransferred")(BytesTransferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ObjectsTransferred)) __obj.updateDynamic("ObjectsTransferred")(ObjectsTransferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalBytes)) __obj.updateDynamic("TotalBytes")(TotalBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalObjects)) __obj.updateDynamic("TotalObjects")(TotalObjects.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransfer]
  }
}

