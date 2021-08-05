package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyLastUsed extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when the access key was most recently used. This field is null in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user.  
    */
  var LastUsedDate: dateType
  
  /**
    * The AWS Region where this access key was most recently used. The value for this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user.   For more information about AWS Regions, see Regions and Endpoints in the Amazon Web Services General Reference.
    */
  var Region: stringType
  
  /**
    * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM started tracking this information.   There is no sign-in data associated with the user.  
    */
  var ServiceName: stringType
}
object AccessKeyLastUsed {
  
  inline def apply(LastUsedDate: dateType, Region: stringType, ServiceName: stringType): AccessKeyLastUsed = {
    val __obj = js.Dynamic.literal(LastUsedDate = LastUsedDate.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyLastUsed]
  }
  
  extension [Self <: AccessKeyLastUsed](x: Self) {
    
    inline def setLastUsedDate(value: dateType): Self = StObject.set(x, "LastUsedDate", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: stringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: stringType): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
