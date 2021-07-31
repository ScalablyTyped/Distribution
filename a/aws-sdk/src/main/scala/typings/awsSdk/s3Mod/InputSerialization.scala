package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSerialization extends StObject {
  
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var CSV: js.UndefOr[CSVInput] = js.undefined
  
  /**
    * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.s3Mod.CompressionType] = js.undefined
  
  /**
    * Specifies JSON as object's input serialization format.
    */
  var JSON: js.UndefOr[JSONInput] = js.undefined
  
  /**
    * Specifies Parquet as object's input serialization format.
    */
  var Parquet: js.UndefOr[ParquetInput] = js.undefined
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
    def setCSV(value: CSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    @scala.inline
    def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    @scala.inline
    def setJSON(value: JSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    
    @scala.inline
    def setParquet(value: ParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
  }
}
