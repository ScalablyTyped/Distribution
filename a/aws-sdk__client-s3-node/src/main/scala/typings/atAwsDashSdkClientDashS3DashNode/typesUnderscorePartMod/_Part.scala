package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscorePartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Part extends js.Object {
  /**
    * <p>Entity tag returned when the part was uploaded.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Part number identifying the part. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.undefined
  /**
    * <p>Size of the uploaded part data.</p>
    */
  var Size: js.UndefOr[Double] = js.undefined
}

object _Part {
  @scala.inline
  def apply(
    ETag: String = null,
    LastModified: Date | String | Double = null,
    PartNumber: Int | Double = null,
    Size: Int | Double = null
  ): _Part = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Part]
  }
}

