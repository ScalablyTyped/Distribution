package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to describe.
    */
  var datasetImportJobArn: Arn
}
object DescribeDatasetImportJobRequest {
  
  inline def apply(datasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(datasetImportJobArn = datasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
  
  extension [Self <: DescribeDatasetImportJobRequest](x: Self) {
    
    inline def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "datasetImportJobArn", value.asInstanceOf[js.Any])
  }
}
