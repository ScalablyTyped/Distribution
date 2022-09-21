package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryProvider
  extends StObject
     with DataProvider {
  
  def cancelQuery(ownerUri: String): Thenable[QueryCancelResult] = js.native
  
  // Edit Data Requests
  def commitEdit(ownerUri: String): Thenable[Unit] = js.native
  
  def createRow(ownerUri: String): Thenable[EditCreateRowResult] = js.native
  
  def deleteRow(ownerUri: String, rowId: Double): Thenable[Unit] = js.native
  
  def disposeEdit(ownerUri: String): Thenable[Unit] = js.native
  
  def disposeQuery(ownerUri: String): Thenable[Unit] = js.native
  
  def getEditRows(rowData: EditSubsetParams): Thenable[EditSubsetResult] = js.native
  
  def getQueryRows(rowData: QueryExecuteSubsetParams): Thenable[QueryExecuteSubsetResult] = js.native
  
  def initializeEdit(
    ownerUri: String,
    schemaName: String,
    objectName: String,
    objectType: String,
    rowLimit: Double,
    queryString: String
  ): Thenable[Unit] = js.native
  
  def parseSyntax(ownerUri: String, query: String): Thenable[SyntaxParseResult] = js.native
  
  /**
    * Registers a handler for BatchComplete events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnBatchComplete(handler: js.Function1[/* batchInfo */ QueryExecuteBatchNotificationParams, Any]): Unit = js.native
  
  /**
    * Registers a handler for BatchStart events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnBatchStart(handler: js.Function1[/* batchInfo */ QueryExecuteBatchNotificationParams, Any]): Unit = js.native
  
  // Edit Data Notifications
  /**
    * Registers a handler for EditSessionReady events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnEditSessionReady(handler: js.Function3[/* ownerUri */ String, /* success */ Boolean, /* message */ String, Any]): Unit = js.native
  
  /**
    * Registers a handler for Message events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnMessage(handler: js.Function1[/* message */ QueryExecuteMessageParams, Any]): Unit = js.native
  
  // Notifications
  /**
    * Registers a handler for QueryComplete events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnQueryComplete(handler: js.Function1[/* result */ QueryExecuteCompleteNotificationResult, Any]): Unit = js.native
  
  /**
    * Registers a handler for ResultSetAvailable events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnResultSetAvailable(handler: js.Function1[/* resultSetInfo */ QueryExecuteResultSetNotificationParams, Any]): Unit = js.native
  
  /**
    * Registers a handler for ResultSetUpdated events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnResultSetUpdated(handler: js.Function1[/* resultSetInfo */ QueryExecuteResultSetNotificationParams, Any]): Unit = js.native
  
  def revertCell(ownerUri: String, rowId: Double, columnId: Double): Thenable[EditRevertCellResult] = js.native
  
  def revertRow(ownerUri: String, rowId: Double): Thenable[Unit] = js.native
  
  def runQuery(ownerUri: String, selection: ISelectionData): Thenable[Unit] = js.native
  def runQuery(ownerUri: String, selection: ISelectionData, runOptions: ExecutionPlanOptions): Thenable[Unit] = js.native
  
  def runQueryAndReturn(ownerUri: String, queryString: String): Thenable[SimpleExecuteResult] = js.native
  
  def runQueryStatement(ownerUri: String, line: Double, column: Double): Thenable[Unit] = js.native
  
  def runQueryString(ownerUri: String, queryString: String): Thenable[Unit] = js.native
  
  def saveResults(requestParams: SaveResultsRequestParams): Thenable[SaveResultRequestResult] = js.native
  
  def setQueryExecutionOptions(ownerUri: String, options: QueryExecutionOptions): Thenable[Unit] = js.native
  
  def updateCell(ownerUri: String, rowId: Double, columnId: Double, newValue: String): Thenable[EditUpdateCellResult] = js.native
}
