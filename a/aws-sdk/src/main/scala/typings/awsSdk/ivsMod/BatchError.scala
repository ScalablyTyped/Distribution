package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchError extends StObject {
  
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * Error code.
    */
  var code: js.UndefOr[errorCode] = js.undefined
  
  /**
    * Error message, determined by the application.
    */
  var message: js.UndefOr[errorMessage] = js.undefined
}
object BatchError {
  
  inline def apply(): BatchError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchError]
  }
  
  extension [Self <: BatchError](x: Self) {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCode(value: errorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: errorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
