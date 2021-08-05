package typings.awsSdkClientPinpointBrowser

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRawEmailMod {
  
  trait RawEmail extends StObject {
    
    /**
      * The raw data of the email.
      */
    var Data: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
  }
  object RawEmail {
    
    inline def apply(): RawEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawEmail]
    }
    
    extension [Self <: RawEmail](x: Self) {
      
      inline def setData(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
  
  trait UnmarshalledRawEmail
    extends StObject
       with RawEmail {
    
    /**
      * The raw data of the email.
      */
    @JSName("Data")
    var Data_UnmarshalledRawEmail: js.UndefOr[Uint8Array] = js.undefined
  }
  object UnmarshalledRawEmail {
    
    inline def apply(): UnmarshalledRawEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRawEmail]
    }
    
    extension [Self <: UnmarshalledRawEmail](x: Self) {
      
      inline def setData(value: Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
}
