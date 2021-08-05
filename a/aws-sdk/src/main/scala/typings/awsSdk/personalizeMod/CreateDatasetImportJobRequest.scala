package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetImportJobRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: DataSource
  
  /**
    * The ARN of the dataset that receives the imported data.
    */
  var datasetArn: Arn
  
  /**
    * The name for the dataset import job.
    */
  var jobName: Name
  
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: RoleArn
}
object CreateDatasetImportJobRequest {
  
  inline def apply(dataSource: DataSource, datasetArn: Arn, jobName: Name, roleArn: RoleArn): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], datasetArn = datasetArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
  
  extension [Self <: CreateDatasetImportJobRequest](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
