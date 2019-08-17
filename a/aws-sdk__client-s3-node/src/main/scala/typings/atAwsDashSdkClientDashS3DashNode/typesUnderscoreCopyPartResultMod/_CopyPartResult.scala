package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCopyPartResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CopyPartResult extends js.Object {
  /**
    * <p>Entity tag of the object.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>Date and time at which the object was uploaded.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
}

object _CopyPartResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: Date | String | Double = null): _CopyPartResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CopyPartResult]
  }
}

