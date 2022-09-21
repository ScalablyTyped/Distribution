package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSummary extends StObject {
  
  /**
    * The date and time that the export was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier that Amazon Lex assigned to the export.
    */
  var exportId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the export. When the status is Completed the export is ready to download.
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.undefined
  
  /**
    * The file format used in the export files.
    */
  var fileFormat: js.UndefOr[ImportExportFileFormat] = js.undefined
  
  /**
    * The date and time that the export was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the bot or bot locale that was exported.
    */
  var resourceSpecification: js.UndefOr[ExportResourceSpecification] = js.undefined
}
object ExportSummary {
  
  inline def apply(): ExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSummary]
  }
  
  extension [Self <: ExportSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setExportId(value: Id): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "exportStatus", js.undefined)
    
    inline def setFileFormat(value: ImportExportFileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setResourceSpecification(value: ExportResourceSpecification): Self = StObject.set(x, "resourceSpecification", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificationUndefined: Self = StObject.set(x, "resourceSpecification", js.undefined)
  }
}
