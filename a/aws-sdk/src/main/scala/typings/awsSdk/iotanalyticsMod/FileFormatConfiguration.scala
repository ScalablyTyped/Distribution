package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFormatConfiguration extends StObject {
  
  /**
    * Contains the configuration information of the JSON format.
    */
  var jsonConfiguration: js.UndefOr[JsonConfiguration] = js.undefined
  
  /**
    * Contains the configuration information of the Parquet format.
    */
  var parquetConfiguration: js.UndefOr[ParquetConfiguration] = js.undefined
}
object FileFormatConfiguration {
  
  inline def apply(): FileFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileFormatConfiguration]
  }
  
  extension [Self <: FileFormatConfiguration](x: Self) {
    
    inline def setJsonConfiguration(value: JsonConfiguration): Self = StObject.set(x, "jsonConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJsonConfigurationUndefined: Self = StObject.set(x, "jsonConfiguration", js.undefined)
    
    inline def setParquetConfiguration(value: ParquetConfiguration): Self = StObject.set(x, "parquetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParquetConfigurationUndefined: Self = StObject.set(x, "parquetConfiguration", js.undefined)
  }
}
