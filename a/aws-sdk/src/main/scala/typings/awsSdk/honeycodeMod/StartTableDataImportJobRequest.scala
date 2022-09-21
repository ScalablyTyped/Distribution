package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTableDataImportJobRequest extends StObject {
  
  /**
    *  The request token for performing the update action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will not perform the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    *  The format of the data that is being imported. Currently the only option supported is "DELIMITED_TEXT". 
    */
  var dataFormat: ImportSourceDataFormat
  
  /**
    *  The source of the data that is being imported. The size of source must be no larger than 100 MB. Source must have no more than 100,000 cells and no more than 1,000 rows. 
    */
  var dataSource: ImportDataSource
  
  /**
    * The ID of the table where the rows are being imported.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var destinationTableId: ResourceId
  
  /**
    *  The options for customizing this import request. 
    */
  var importOptions: ImportOptions
  
  /**
    * The ID of the workbook where the rows are being imported.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object StartTableDataImportJobRequest {
  
  inline def apply(
    clientRequestToken: ClientRequestToken,
    dataFormat: ImportSourceDataFormat,
    dataSource: ImportDataSource,
    destinationTableId: ResourceId,
    importOptions: ImportOptions,
    workbookId: ResourceId
  ): StartTableDataImportJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], destinationTableId = destinationTableId.asInstanceOf[js.Any], importOptions = importOptions.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTableDataImportJobRequest]
  }
  
  extension [Self <: StartTableDataImportJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: ImportSourceDataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: ImportDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDestinationTableId(value: ResourceId): Self = StObject.set(x, "destinationTableId", value.asInstanceOf[js.Any])
    
    inline def setImportOptions(value: ImportOptions): Self = StObject.set(x, "importOptions", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
