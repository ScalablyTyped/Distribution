package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetExportJobResponse extends StObject {
  
  /**
    * Information about the dataset export job, including the status. The status is one of the following values:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var datasetExportJob: js.UndefOr[DatasetExportJob] = js.undefined
}
object DescribeDatasetExportJobResponse {
  
  inline def apply(): DescribeDatasetExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetExportJobResponse]
  }
  
  extension [Self <: DescribeDatasetExportJobResponse](x: Self) {
    
    inline def setDatasetExportJob(value: DatasetExportJob): Self = StObject.set(x, "datasetExportJob", value.asInstanceOf[js.Any])
    
    inline def setDatasetExportJobUndefined: Self = StObject.set(x, "datasetExportJob", js.undefined)
  }
}
