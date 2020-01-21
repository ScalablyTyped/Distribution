package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemSize extends js.Object {
  /**
    * The time at which the size of data, returned in the Value field, was determined. The value is the integer number of seconds since 1970-01-01T00:00:00Z.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.efsMod.Timestamp] = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the file system.
    */
  var Value: FileSystemSizeValue = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
    */
  var ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the Standard storage class.
    */
  var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.native
}

object FileSystemSize {
  @scala.inline
  def apply(
    Value: FileSystemSizeValue,
    Timestamp: Timestamp = null,
    ValueInIA: Int | Double = null,
    ValueInStandard: Int | Double = null
  ): FileSystemSize = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (ValueInIA != null) __obj.updateDynamic("ValueInIA")(ValueInIA.asInstanceOf[js.Any])
    if (ValueInStandard != null) __obj.updateDynamic("ValueInStandard")(ValueInStandard.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSize]
  }
}

