package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be described. 
    */
  var DatasetName: DatasetIdentifier
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetName: DatasetIdentifier): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetIdentifier): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
  }
}
