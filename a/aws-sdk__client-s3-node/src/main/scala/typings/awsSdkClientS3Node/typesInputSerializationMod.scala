package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BZIP2
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GZIP
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typings.awsSdkClientS3Node.typesCsvinputMod.CSVInput
import typings.awsSdkClientS3Node.typesCsvinputMod.UnmarshalledCSVInput
import typings.awsSdkClientS3Node.typesJsoninputMod.JSONInput
import typings.awsSdkClientS3Node.typesJsoninputMod.UnmarshalledJSONInput
import typings.awsSdkClientS3Node.typesParquetInputMod.ParquetInput
import typings.awsSdkClientS3Node.typesParquetInputMod.UnmarshalledParquetInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputSerializationMod {
  
  trait InputSerialization extends StObject {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    var CSV: js.UndefOr[CSVInput] = js.undefined
    
    /**
      * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
      */
    var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.undefined
    
    /**
      * <p>Specifies JSON as object's input serialization format.</p>
      */
    var JSON: js.UndefOr[JSONInput] = js.undefined
    
    /**
      * <p>Specifies Parquet as object's input serialization format.</p>
      */
    var Parquet: js.UndefOr[ParquetInput] = js.undefined
  }
  object InputSerialization {
    
    inline def apply(): InputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSerialization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSerialization] (val x: Self) extends AnyVal {
      
      inline def setCSV(value: CSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      inline def setCompressionType(value: NONE | GZIP | BZIP2 | String): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
      
      inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
      
      inline def setJSON(value: JSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      inline def setParquet(value: ParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
      
      inline def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
    }
  }
  
  trait UnmarshalledInputSerialization
    extends StObject
       with InputSerialization {
    
    /**
      * <p>Describes the serialization of a CSV-encoded object.</p>
      */
    @JSName("CSV")
    var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.undefined
    
    /**
      * <p>Specifies JSON as object's input serialization format.</p>
      */
    @JSName("JSON")
    var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.undefined
    
    /**
      * <p>Specifies Parquet as object's input serialization format.</p>
      */
    @JSName("Parquet")
    var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.undefined
  }
  object UnmarshalledInputSerialization {
    
    inline def apply(): UnmarshalledInputSerialization = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledInputSerialization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
      
      inline def setCSV(value: UnmarshalledCSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
      
      inline def setJSON(value: UnmarshalledJSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      inline def setParquet(value: UnmarshalledParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
      
      inline def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
    }
  }
}
