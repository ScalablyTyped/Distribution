package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PartitionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionInput]
  }
  
  @scala.inline
  implicit class PartitionInputOps[Self <: PartitionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = this.set("LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessTime: Self = this.set("LastAccessTime", js.undefined)
    
    @scala.inline
    def setLastAnalyzedTime(value: Timestamp): Self = this.set("LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAnalyzedTime: Self = this.set("LastAnalyzedTime", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setStorageDescriptor(value: StorageDescriptor): Self = this.set("StorageDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageDescriptor: Self = this.set("StorageDescriptor", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ValueString*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ValueStringList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
