package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedS3Resource extends StObject {
  
  /**
    * (Discontinued) The status code of a failed item.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * (Discontinued) The error message of a failed item.
    */
  var errorMessage: js.UndefOr[ExceptionMessage] = js.undefined
  
  /**
    * (Discontinued) The failed S3 resources.
    */
  var failedItem: js.UndefOr[S3Resource] = js.undefined
}
object FailedS3Resource {
  
  inline def apply(): FailedS3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedS3Resource]
  }
  
  extension [Self <: FailedS3Resource](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ExceptionMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setFailedItem(value: S3Resource): Self = StObject.set(x, "failedItem", value.asInstanceOf[js.Any])
    
    inline def setFailedItemUndefined: Self = StObject.set(x, "failedItem", js.undefined)
  }
}
