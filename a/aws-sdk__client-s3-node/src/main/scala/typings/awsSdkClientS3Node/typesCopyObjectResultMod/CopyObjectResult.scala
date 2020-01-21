package typings.awsSdkClientS3Node.typesCopyObjectResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyObjectResult extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
}

object CopyObjectResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: Date | String | Double = null): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectResult]
  }
}

