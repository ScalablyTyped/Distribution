package typings.awsSdkClientS3Node.typesPartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Part extends js.Object {
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

object Part {
  @scala.inline
  def apply(
    ETag: String = null,
    LastModified: Date | String | Double = null,
    PartNumber: js.UndefOr[Double] = js.undefined,
    Size: js.UndefOr[Double] = js.undefined
  ): Part = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

