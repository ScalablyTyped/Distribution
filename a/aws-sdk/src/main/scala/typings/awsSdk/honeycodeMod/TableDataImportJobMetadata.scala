package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataImportJobMetadata extends StObject {
  
  /**
    * The source of the data that was submitted for import.
    */
  var dataSource: ImportDataSource
  
  /**
    * The options that was specified at the time of submitting the import request.
    */
  var importOptions: ImportOptions
  
  /**
    * The timestamp when the job was submitted for import.
    */
  var submitTime: js.Date
  
  /**
    * Details about the submitter of the import request.
    */
  var submitter: ImportJobSubmitter
}
object TableDataImportJobMetadata {
  
  inline def apply(
    dataSource: ImportDataSource,
    importOptions: ImportOptions,
    submitTime: js.Date,
    submitter: ImportJobSubmitter
  ): TableDataImportJobMetadata = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], importOptions = importOptions.asInstanceOf[js.Any], submitTime = submitTime.asInstanceOf[js.Any], submitter = submitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataImportJobMetadata]
  }
  
  extension [Self <: TableDataImportJobMetadata](x: Self) {
    
    inline def setDataSource(value: ImportDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setImportOptions(value: ImportOptions): Self = StObject.set(x, "importOptions", value.asInstanceOf[js.Any])
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitter(value: ImportJobSubmitter): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
  }
}
