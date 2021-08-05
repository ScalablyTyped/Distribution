package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesCsvoutputMod.CSVOutput
import typings.awsSdkClientS3Node.typesCsvoutputMod.UnmarshalledCSVOutput
import typings.awsSdkClientS3Node.typesJsonoutputMod.JSONOutput
import typings.awsSdkClientS3Node.typesJsonoutputMod.UnmarshalledJSONOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputSerializationMod {
  
  trait OutputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of CSV-encoded Select results.</p>
      */
    var CSV: js.UndefOr[CSVOutput] = js.undefined
    
    /**
      * <p>Specifies JSON as request's output serialization format.</p>
      */
    var JSON: js.UndefOr[JSONOutput] = js.undefined
  }
  object OutputSerialization {
    
    inline def apply(): OutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputSerialization]
    }
    
    extension [Self <: OutputSerialization](x: Self) {
      
      inline def setCSV(value: CSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      inline def setJSON(value: JSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    }
  }
  
  trait UnmarshalledOutputSerialization
    extends StObject
       with OutputSerialization {
    
    /**
      * <p>Describes the serialization of CSV-encoded Select results.</p>
      */
    @JSName("CSV")
    var CSV_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.undefined
    
    /**
      * <p>Specifies JSON as request's output serialization format.</p>
      */
    @JSName("JSON")
    var JSON_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledJSONOutput] = js.undefined
  }
  object UnmarshalledOutputSerialization {
    
    inline def apply(): UnmarshalledOutputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledOutputSerialization]
    }
    
    extension [Self <: UnmarshalledOutputSerialization](x: Self) {
      
      inline def setCSV(value: UnmarshalledCSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      inline def setJSON(value: UnmarshalledJSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    }
  }
}
