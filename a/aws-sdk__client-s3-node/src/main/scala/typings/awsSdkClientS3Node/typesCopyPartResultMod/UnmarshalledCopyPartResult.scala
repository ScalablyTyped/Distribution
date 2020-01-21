package typings.awsSdkClientS3Node.typesCopyPartResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCopyPartResult extends CopyPartResult {
  /**
    * <p>Date and time at which the object was uploaded.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledCopyPartResult: js.UndefOr[Date] = js.undefined
}

object UnmarshalledCopyPartResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: Date = null): UnmarshalledCopyPartResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCopyPartResult]
  }
}

