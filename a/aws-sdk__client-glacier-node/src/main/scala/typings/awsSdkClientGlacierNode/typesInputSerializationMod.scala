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
    
    inline def apply(): InputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSerialization]
    }
    
    extension [Self <: InputSerialization](x: Self) {
      
      inline def setCsv(value: CSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
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
    
    inline def apply(): UnmarshalledInputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledInputSerialization]
    }
    
    extension [Self <: UnmarshalledInputSerialization](x: Self) {
      
      inline def setCsv(value: UnmarshalledCSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
}
