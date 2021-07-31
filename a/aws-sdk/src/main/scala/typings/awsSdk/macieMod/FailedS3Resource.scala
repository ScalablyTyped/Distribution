package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedS3Resource extends StObject {
  
  /**
    * The status code of a failed item.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The error message of a failed item.
    */
  var errorMessage: js.UndefOr[ExceptionMessage] = js.undefined
  
  /**
    * The failed S3 resources.
    */
  var failedItem: js.UndefOr[S3Resource] = js.undefined
}
object FailedS3Resource {
  
  @scala.inline
  def apply(): FailedS3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedS3Resource]
  }
  
  @scala.inline
  implicit class FailedS3ResourceMutableBuilder[Self <: FailedS3Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ExceptionMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setFailedItem(value: S3Resource): Self = StObject.set(x, "failedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItemUndefined: Self = StObject.set(x, "failedItem", js.undefined)
  }
}
