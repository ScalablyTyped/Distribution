package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiCallAction extends StObject {
  
  /**
    * The AWS API name.
    */
  var Api: js.UndefOr[String] = js.native
  
  /**
    * The AWS API caller type.
    */
  var CallerType: js.UndefOr[String] = js.native
  
  /**
    * The domain information for the AWS API call.
    */
  var DomainDetails: js.UndefOr[typings.awsSdk.guarddutyMod.DomainDetails] = js.native
  
  /**
    * The error code of the failed AWS API action.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The remote IP information of the connection that initiated the AWS API call.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  
  /**
    * The AWS service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[String] = js.native
}
object AwsApiCallAction {
  
  @scala.inline
  def apply(): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallAction]
  }
  
  @scala.inline
  implicit class AwsApiCallActionMutableBuilder[Self <: AwsApiCallAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: String): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "Api", js.undefined)
    
    @scala.inline
    def setCallerType(value: String): Self = StObject.set(x, "CallerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerTypeUndefined: Self = StObject.set(x, "CallerType", js.undefined)
    
    @scala.inline
    def setDomainDetails(value: DomainDetails): Self = StObject.set(x, "DomainDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainDetailsUndefined: Self = StObject.set(x, "DomainDetails", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
