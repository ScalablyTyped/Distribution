package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryProvider extends DataProvider {
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
  def registerOnBatchComplete(handler: js.Function1[/* batchInfo */ QueryExecuteBatchNotificationParams, _]): Unit = js.native
  def registerOnBatchStart(handler: js.Function1[/* batchInfo */ QueryExecuteBatchNotificationParams, _]): Unit = js.native
  // Edit Data Notifications
  def registerOnEditSessionReady(handler: js.Function3[/* ownerUri */ String, /* success */ Boolean, /* message */ String, _]): Unit = js.native
  def registerOnMessage(handler: js.Function1[/* message */ QueryExecuteMessageParams, _]): Unit = js.native
  // Notifications
  def registerOnQueryComplete(handler: js.Function1[/* result */ QueryExecuteCompleteNotificationResult, _]): Unit = js.native
  def registerOnResultSetAvailable(handler: js.Function1[/* resultSetInfo */ QueryExecuteResultSetNotificationParams, _]): Unit = js.native
  def registerOnResultSetUpdated(handler: js.Function1[/* resultSetInfo */ QueryExecuteResultSetNotificationParams, _]): Unit = js.native
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

