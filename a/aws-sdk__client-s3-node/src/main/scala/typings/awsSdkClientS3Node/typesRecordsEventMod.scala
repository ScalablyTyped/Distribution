package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRecordsEventMod {
  
  trait RecordsEvent extends StObject {
    
    /**
      * <p>The byte array of partial, one or more result records.</p>
      */
    var Payload: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.undefined
  }
  object RecordsEvent {
    
    inline def apply(): RecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordsEvent] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
  
  trait UnmarshalledRecordsEvent
    extends StObject
       with RecordsEvent {
    
    /**
      * <p>The byte array of partial, one or more result records.</p>
      */
    @JSName("Payload")
    var Payload_UnmarshalledRecordsEvent: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object UnmarshalledRecordsEvent {
    
    inline def apply(): UnmarshalledRecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRecordsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledRecordsEvent] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
