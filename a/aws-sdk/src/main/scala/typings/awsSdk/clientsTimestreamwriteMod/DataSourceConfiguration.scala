package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfiguration extends StObject {
  
  var CsvConfiguration: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.CsvConfiguration] = js.undefined
  
  /**
    * This is currently CSV.
    */
  var DataFormat: BatchLoadDataFormat
  
  /**
    * Configuration of an S3 location for a file which contains data to load.
    */
  var DataSourceS3Configuration: typings.awsSdk.clientsTimestreamwriteMod.DataSourceS3Configuration
}
object DataSourceConfiguration {
  
  inline def apply(DataFormat: BatchLoadDataFormat, DataSourceS3Configuration: DataSourceS3Configuration): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], DataSourceS3Configuration = DataSourceS3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCsvConfiguration(value: CsvConfiguration): Self = StObject.set(x, "CsvConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCsvConfigurationUndefined: Self = StObject.set(x, "CsvConfiguration", js.undefined)
    
    inline def setDataFormat(value: BatchLoadDataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataSourceS3Configuration(value: DataSourceS3Configuration): Self = StObject.set(x, "DataSourceS3Configuration", value.asInstanceOf[js.Any])
  }
}
