package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedTraceSegment extends StObject {
  
  /**
    * The error that caused processing to fail.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object UnprocessedTraceSegment {
  
  inline def apply(): UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedTraceSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnprocessedTraceSegment] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
