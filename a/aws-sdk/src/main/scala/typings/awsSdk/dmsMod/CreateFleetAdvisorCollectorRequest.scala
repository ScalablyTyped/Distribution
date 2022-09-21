package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetAdvisorCollectorRequest extends StObject {
  
  /**
    * The name of your Fleet Advisor collector (for example, sample-collector).
    */
  var CollectorName: String
  
  /**
    * A summary description of your Fleet Advisor collector.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 bucket that the Fleet Advisor collector uses to store inventory metadata.
    */
  var S3BucketName: String
  
  /**
    * The IAM role that grants permissions to access the specified Amazon S3 bucket.
    */
  var ServiceAccessRoleArn: String
}
object CreateFleetAdvisorCollectorRequest {
  
  inline def apply(CollectorName: String, S3BucketName: String, ServiceAccessRoleArn: String): CreateFleetAdvisorCollectorRequest = {
    val __obj = js.Dynamic.literal(CollectorName = CollectorName.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetAdvisorCollectorRequest]
  }
  
  extension [Self <: CreateFleetAdvisorCollectorRequest](x: Self) {
    
    inline def setCollectorName(value: String): Self = StObject.set(x, "CollectorName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
