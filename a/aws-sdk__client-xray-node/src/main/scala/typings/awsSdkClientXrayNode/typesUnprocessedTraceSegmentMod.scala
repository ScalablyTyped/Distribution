package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnprocessedTraceSegmentMod {
  
  type UnmarshalledUnprocessedTraceSegment = UnprocessedTraceSegment
  
  trait UnprocessedTraceSegment extends StObject {
    
    /**
      * <p>The error that caused processing to fail.</p>
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The segment's ID.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The error message.</p>
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object UnprocessedTraceSegment {
    
    inline def apply(): UnprocessedTraceSegment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnprocessedTraceSegment]
    }
    
    extension [Self <: UnprocessedTraceSegment](x: Self) {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
