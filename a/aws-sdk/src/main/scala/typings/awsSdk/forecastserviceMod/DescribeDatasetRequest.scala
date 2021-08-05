package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: Arn
}
object DescribeDatasetRequest {
  
  inline def apply(DatasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
