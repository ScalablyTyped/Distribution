package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewDestinationTypeParams extends StObject {
  
  /**
    * Destination type for a Dataview.    GLUE_TABLE – Glue table destination type.    S3 – S3 destination type.  
    */
  var destinationType: DataViewDestinationType
  
  /**
    * Dataview export file format.    PARQUET – Parquet export file format.    DELIMITED_TEXT – Delimited text export file format.  
    */
  var s3DestinationExportFileFormat: js.UndefOr[ExportFileFormat] = js.undefined
  
  /**
    * Format Options for S3 Destination type. Here is an example of how you could specify the s3DestinationExportFileFormatOptions    { "header": "true", "delimiter": ",", "compression": "gzip" } 
    */
  var s3DestinationExportFileFormatOptions: js.UndefOr[S3DestinationFormatOptions] = js.undefined
}
object DataViewDestinationTypeParams {
  
  inline def apply(destinationType: DataViewDestinationType): DataViewDestinationTypeParams = {
    val __obj = js.Dynamic.literal(destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewDestinationTypeParams]
  }
  
  extension [Self <: DataViewDestinationTypeParams](x: Self) {
    
    inline def setDestinationType(value: DataViewDestinationType): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationExportFileFormat(value: ExportFileFormat): Self = StObject.set(x, "s3DestinationExportFileFormat", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationExportFileFormatOptions(value: S3DestinationFormatOptions): Self = StObject.set(x, "s3DestinationExportFileFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationExportFileFormatOptionsUndefined: Self = StObject.set(x, "s3DestinationExportFileFormatOptions", js.undefined)
    
    inline def setS3DestinationExportFileFormatUndefined: Self = StObject.set(x, "s3DestinationExportFileFormat", js.undefined)
  }
}
