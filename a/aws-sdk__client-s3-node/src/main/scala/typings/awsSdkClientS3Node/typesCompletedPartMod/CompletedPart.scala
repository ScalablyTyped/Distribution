package typings.awsSdkClientS3Node.typesCompletedPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedPart extends js.Object {
  /**
    * <p>Entity tag returned when the part was uploaded.</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>Part number that identifies the part. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.undefined
}

object CompletedPart {
  @scala.inline
  def apply(ETag: String = null, PartNumber: js.UndefOr[Double] = js.undefined): CompletedPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedPart]
  }
}

