package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscorePartMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledPart extends _Part {
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledPart: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledPart {
  @scala.inline
  def apply(
    ETag: String = null,
    LastModified: Date = null,
    PartNumber: Int | Double = null,
    Size: Int | Double = null
  ): _UnmarshalledPart = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (PartNumber != null) __obj.updateDynamic("PartNumber")(PartNumber.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledPart]
  }
}

