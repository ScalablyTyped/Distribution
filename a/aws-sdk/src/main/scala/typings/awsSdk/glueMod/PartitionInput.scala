package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionInput extends js.Object {
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[Timestamp] = js.native
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.glueMod.StorageDescriptor] = js.native
  /**
    * The values of the partition. Although this parameter is not required by the SDK, you must specify this parameter for a valid input. The values for the keys for the new partition must be passed as an array of String objects that must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix. Otherwise AWS Glue will add the values to the wrong keys.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object PartitionInput {
  @scala.inline
  def apply(
    LastAccessTime: Timestamp = null,
    LastAnalyzedTime: Timestamp = null,
    Parameters: ParametersMap = null,
    StorageDescriptor: StorageDescriptor = null,
    Values: ValueStringList = null
  ): PartitionInput = {
    val __obj = js.Dynamic.literal()
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime.asInstanceOf[js.Any])
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionInput]
  }
}

