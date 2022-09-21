package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncErrorDetails extends StObject {
  
  /**
    * A string that uniquely identifies the error condition.
    */
  var Code: js.UndefOr[MaxLength1024String] = js.undefined
  
  /**
    * A generic descritpion of the error condition in English.
    */
  var Message: js.UndefOr[MaxLength1024String] = js.undefined
  
  /**
    * The ID of the request associated with the error.
    */
  var RequestId: js.UndefOr[MaxLength1024String] = js.undefined
  
  /**
    * The identifier of the resource associated with the error.
    */
  var Resource: js.UndefOr[MaxLength1024String] = js.undefined
}
object AsyncErrorDetails {
  
  inline def apply(): AsyncErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncErrorDetails]
  }
  
  extension [Self <: AsyncErrorDetails](x: Self) {
    
    inline def setCode(value: MaxLength1024String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: MaxLength1024String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setRequestId(value: MaxLength1024String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setResource(value: MaxLength1024String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}
