package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureInfo extends StObject {
  
  /**
    * The code of the common error. Valid values include InternalServiceException, InvalidParameterException, and any valid error code returned by the AWS service that hosts the resource that you want to tag.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ErrorCode] = js.native
  
  /**
    * The message of the common error.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ErrorMessage] = js.native
  
  /**
    * The HTTP status code of the common error.
    */
  var StatusCode: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.StatusCode] = js.native
}
object FailureInfo {
  
  @scala.inline
  def apply(): FailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureInfo]
  }
  
  @scala.inline
  implicit class FailureInfoMutableBuilder[Self <: FailureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
