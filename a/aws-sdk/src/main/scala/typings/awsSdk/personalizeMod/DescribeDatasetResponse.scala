package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetResponse extends StObject {
  
  /**
    * A listing of the dataset's properties.
    */
  var dataset: js.UndefOr[Dataset] = js.native
}
object DescribeDatasetResponse {
  
  @scala.inline
  def apply(): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
  
  @scala.inline
  implicit class DescribeDatasetResponseMutableBuilder[Self <: DescribeDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
  }
}
