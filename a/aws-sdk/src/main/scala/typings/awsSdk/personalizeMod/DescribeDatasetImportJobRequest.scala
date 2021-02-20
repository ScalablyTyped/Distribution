package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to describe.
    */
  var datasetImportJobArn: Arn = js.native
}
object DescribeDatasetImportJobRequest {
  
  @scala.inline
  def apply(datasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(datasetImportJobArn = datasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
  
  @scala.inline
  implicit class DescribeDatasetImportJobRequestMutableBuilder[Self <: DescribeDatasetImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "datasetImportJobArn", value.asInstanceOf[js.Any])
  }
}
