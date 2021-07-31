package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetResponse extends StObject {
  
  /**
    * An object that contains information about the data set.
    */
  var dataset: js.UndefOr[Dataset] = js.undefined
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
