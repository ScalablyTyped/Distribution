package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalEventsDetail extends StObject {
  
  /**
    * The ARN of the role that provides Amazon Fraud Detector access to the data location.
    */
  var dataAccessRoleArn: iamRoleArn
  
  /**
    * The Amazon S3 bucket location for the data.
    */
  var dataLocation: s3BucketLocation
}
object ExternalEventsDetail {
  
  @scala.inline
  def apply(dataAccessRoleArn: iamRoleArn, dataLocation: s3BucketLocation): ExternalEventsDetail = {
    val __obj = js.Dynamic.literal(dataAccessRoleArn = dataAccessRoleArn.asInstanceOf[js.Any], dataLocation = dataLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalEventsDetail]
  }
  
  @scala.inline
  implicit class ExternalEventsDetailMutableBuilder[Self <: ExternalEventsDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: iamRoleArn): Self = StObject.set(x, "dataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocation(value: s3BucketLocation): Self = StObject.set(x, "dataLocation", value.asInstanceOf[js.Any])
  }
}
