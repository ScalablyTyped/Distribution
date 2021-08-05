package typings.awsSdkClientS3Node

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRecordsEventMod {
  
  trait RecordsEvent extends StObject {
    
    /**
      * <p>The byte array of partial, one or more result records.</p>
      */
    var Payload: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  }
  object RecordsEvent {
    
    inline def apply(): RecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordsEvent]
    }
    
    extension [Self <: RecordsEvent](x: Self) {
      
      inline def setPayload(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
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
    var Payload_UnmarshalledRecordsEvent: js.UndefOr[Uint8Array] = js.undefined
  }
  object UnmarshalledRecordsEvent {
    
    inline def apply(): UnmarshalledRecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRecordsEvent]
    }
    
    extension [Self <: UnmarshalledRecordsEvent](x: Self) {
      
      inline def setPayload(value: Uint8Array): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
