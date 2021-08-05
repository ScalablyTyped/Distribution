package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset to describe.
    */
  var datasetArn: Arn
}
object DescribeDatasetRequest {
  
  inline def apply(datasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
  
  extension [Self <: DescribeDatasetRequest](x: Self) {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
  }
}
