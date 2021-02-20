package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedResource extends StObject {
  
  /**
    * The error code associated with the failure.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.resourcegroupsMod.ErrorCode] = js.native
  
  /**
    * The error message text associated with the failure.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.resourcegroupsMod.ErrorMessage] = js.native
  
  /**
    * The ARN of the resource that failed to be added or removed.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceArn] = js.native
}
object FailedResource {
  
  @scala.inline
  def apply(): FailedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedResource]
  }
  
  @scala.inline
  implicit class FailedResourceMutableBuilder[Self <: FailedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
