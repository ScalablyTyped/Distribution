package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCompletedPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CompletedPart extends js.Object {
  /**
    * <p>Entity tag returned when the part was uploaded.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>Part number that identifies the part. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.undefined
}

object _CompletedPart {
  @scala.inline
  def apply(ETag: String = null, PartNumber: Int | Double = null): _CompletedPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CompletedPart]
  }
}

