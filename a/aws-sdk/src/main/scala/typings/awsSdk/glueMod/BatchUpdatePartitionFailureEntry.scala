package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePartitionFailureEntry extends StObject {
  
  /**
    * The details about the batch update partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.native
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: js.UndefOr[BoundedPartitionValueList] = js.native
}
object BatchUpdatePartitionFailureEntry {
  
  @scala.inline
  def apply(): BatchUpdatePartitionFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePartitionFailureEntry]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionFailureEntryMutableBuilder[Self <: BatchUpdatePartitionFailureEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = StObject.set(x, "PartitionValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueListUndefined: Self = StObject.set(x, "PartitionValueList", js.undefined)
    
    @scala.inline
    def setPartitionValueListVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValueList", js.Array(value :_*))
  }
}
