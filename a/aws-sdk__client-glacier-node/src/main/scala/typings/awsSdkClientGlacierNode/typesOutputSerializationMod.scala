package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesCsvoutputMod.CSVOutput
import typings.awsSdkClientGlacierNode.typesCsvoutputMod.UnmarshalledCSVOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputSerializationMod {
  
  trait OutputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of CSV-encoded query results.</p>
      */
    var csv: js.UndefOr[CSVOutput] = js.undefined
  }
  object OutputSerialization {
    
    inline def apply(): OutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputSerialization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputSerialization] (val x: Self) extends AnyVal {
      
      inline def setCsv(value: CSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
  
  trait UnmarshalledOutputSerialization
    extends StObject
       with OutputSerialization {
    
    /**
      * <p>Describes the serialization of CSV-encoded query results.</p>
      */
    @JSName("csv")
    var csv_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.undefined
  }
  object UnmarshalledOutputSerialization {
    
    inline def apply(): UnmarshalledOutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledOutputSerialization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledOutputSerialization] (val x: Self) extends AnyVal {
      
      inline def setCsv(value: UnmarshalledCSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    }
  }
}
