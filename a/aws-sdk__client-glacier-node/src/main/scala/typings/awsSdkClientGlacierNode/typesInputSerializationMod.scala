package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesCsvinputMod.CSVInput
import typings.awsSdkClientGlacierNode.typesCsvinputMod.UnmarshalledCSVInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputSerializationMod {
  
  trait InputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    var csv: js.UndefOr[CSVInput] = js.undefined
  }
  object InputSerialization {
    
    @scala.inline
    def apply(): InputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSerialization]
    }
    
    @scala.inline
    implicit class InputSerializationMutableBuilder[Self <: InputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsv(value: CSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
  
  trait UnmarshalledInputSerialization
    extends StObject
       with InputSerialization {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    @JSName("csv")
    var csv_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.undefined
  }
  object UnmarshalledInputSerialization {
    
    @scala.inline
    def apply(): UnmarshalledInputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledInputSerialization]
    }
    
    @scala.inline
    implicit class UnmarshalledInputSerializationMutableBuilder[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsv(value: UnmarshalledCSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
}
