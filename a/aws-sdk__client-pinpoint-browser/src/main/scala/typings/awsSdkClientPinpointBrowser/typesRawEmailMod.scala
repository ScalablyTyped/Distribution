package typings.awsSdkClientPinpointBrowser

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRawEmailMod {
  
  @js.native
  trait RawEmail extends StObject {
    
    /**
      * The raw data of the email.
      */
    var Data: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
  }
  object RawEmail {
    
    @scala.inline
    def apply(): RawEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawEmail]
    }
    
    @scala.inline
    implicit class RawEmailMutableBuilder[Self <: RawEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledRawEmail extends RawEmail {
    
    /**
      * The raw data of the email.
      */
    @JSName("Data")
    var Data_UnmarshalledRawEmail: js.UndefOr[Uint8Array] = js.native
  }
  object UnmarshalledRawEmail {
    
    @scala.inline
    def apply(): UnmarshalledRawEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRawEmail]
    }
    
    @scala.inline
    implicit class UnmarshalledRawEmailMutableBuilder[Self <: UnmarshalledRawEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
}
