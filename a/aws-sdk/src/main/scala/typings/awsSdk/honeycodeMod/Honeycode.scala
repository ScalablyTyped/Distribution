package typings.awsSdk.honeycodeMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Honeycode extends Service {
  
  /**
    *  The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API allows you to specify the values to set in some or all of the columns in the new rows.   If a column is not explicitly set in a specific row, then the column level formula specified in the table will be applied to the new row. If there is no column level formula but the last row of the table has a formula, then that formula will be copied down to the new row. If there is no column level formula and no formula in the last row of the table, then that column will be left blank for the new rows. 
    */
  def batchCreateTableRows(): Request[BatchCreateTableRowsResult, AWSError] = js.native
  def batchCreateTableRows(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateTableRowsResult, Unit]): Request[BatchCreateTableRowsResult, AWSError] = js.native
  /**
    *  The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API allows you to specify the values to set in some or all of the columns in the new rows.   If a column is not explicitly set in a specific row, then the column level formula specified in the table will be applied to the new row. If there is no column level formula but the last row of the table has a formula, then that formula will be copied down to the new row. If there is no column level formula and no formula in the last row of the table, then that column will be left blank for the new rows. 
    */
  def batchCreateTableRows(params: BatchCreateTableRowsRequest): Request[BatchCreateTableRowsResult, AWSError] = js.native
  def batchCreateTableRows(
    params: BatchCreateTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateTableRowsResult, Unit]
  ): Request[BatchCreateTableRowsResult, AWSError] = js.native
  
  /**
    *  The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to specify the ids of the rows that you want to delete from the table. 
    */
  def batchDeleteTableRows(): Request[BatchDeleteTableRowsResult, AWSError] = js.native
  def batchDeleteTableRows(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableRowsResult, Unit]): Request[BatchDeleteTableRowsResult, AWSError] = js.native
  /**
    *  The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to specify the ids of the rows that you want to delete from the table. 
    */
  def batchDeleteTableRows(params: BatchDeleteTableRowsRequest): Request[BatchDeleteTableRowsResult, AWSError] = js.native
  def batchDeleteTableRows(
    params: BatchDeleteTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteTableRowsResult, Unit]
  ): Request[BatchDeleteTableRowsResult, AWSError] = js.native
  
  /**
    *  The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook.   You can specify the values to set in some or all of the columns in the table for the specified rows. If a column is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (""). 
    */
  def batchUpdateTableRows(): Request[BatchUpdateTableRowsResult, AWSError] = js.native
  def batchUpdateTableRows(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateTableRowsResult, Unit]): Request[BatchUpdateTableRowsResult, AWSError] = js.native
  /**
    *  The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook.   You can specify the values to set in some or all of the columns in the table for the specified rows. If a column is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (""). 
    */
  def batchUpdateTableRows(params: BatchUpdateTableRowsRequest): Request[BatchUpdateTableRowsResult, AWSError] = js.native
  def batchUpdateTableRows(
    params: BatchUpdateTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateTableRowsResult, Unit]
  ): Request[BatchUpdateTableRowsResult, AWSError] = js.native
  
  /**
    *  The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are found, it will update the cells in the matching rows to new values specified in the request. If no matching rows are found, a new row is added at the end of the table and the cells in that row are set to the new values specified in the request.   You can specify the values to set in some or all of the columns in the table for the matching or newly appended rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (""). 
    */
  def batchUpsertTableRows(): Request[BatchUpsertTableRowsResult, AWSError] = js.native
  def batchUpsertTableRows(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpsertTableRowsResult, Unit]): Request[BatchUpsertTableRowsResult, AWSError] = js.native
  /**
    *  The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are found, it will update the cells in the matching rows to new values specified in the request. If no matching rows are found, a new row is added at the end of the table and the cells in that row are set to the new values specified in the request.   You can specify the values to set in some or all of the columns in the table for the matching or newly appended rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that row. To clear out the data in a specific cell, you need to set the value as an empty string (""). 
    */
  def batchUpsertTableRows(params: BatchUpsertTableRowsRequest): Request[BatchUpsertTableRowsResult, AWSError] = js.native
  def batchUpsertTableRows(
    params: BatchUpsertTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpsertTableRowsResult, Unit]
  ): Request[BatchUpsertTableRowsResult, AWSError] = js.native
  
  @JSName("config")
  var config_Honeycode: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job. 
    */
  def describeTableDataImportJob(): Request[DescribeTableDataImportJobResult, AWSError] = js.native
  def describeTableDataImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableDataImportJobResult, Unit]): Request[DescribeTableDataImportJobResult, AWSError] = js.native
  /**
    *  The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job. 
    */
  def describeTableDataImportJob(params: DescribeTableDataImportJobRequest): Request[DescribeTableDataImportJobResult, AWSError] = js.native
  def describeTableDataImportJob(
    params: DescribeTableDataImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableDataImportJobResult, Unit]
  ): Request[DescribeTableDataImportJobResult, AWSError] = js.native
  
  /**
    *  The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 
    */
  def getScreenData(): Request[GetScreenDataResult, AWSError] = js.native
  def getScreenData(callback: js.Function2[/* err */ AWSError, /* data */ GetScreenDataResult, Unit]): Request[GetScreenDataResult, AWSError] = js.native
  /**
    *  The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 
    */
  def getScreenData(params: GetScreenDataRequest): Request[GetScreenDataResult, AWSError] = js.native
  def getScreenData(
    params: GetScreenDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetScreenDataResult, Unit]
  ): Request[GetScreenDataResult, AWSError] = js.native
  
  /**
    *  The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 
    */
  def invokeScreenAutomation(): Request[InvokeScreenAutomationResult, AWSError] = js.native
  def invokeScreenAutomation(callback: js.Function2[/* err */ AWSError, /* data */ InvokeScreenAutomationResult, Unit]): Request[InvokeScreenAutomationResult, AWSError] = js.native
  /**
    *  The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 
    */
  def invokeScreenAutomation(params: InvokeScreenAutomationRequest): Request[InvokeScreenAutomationResult, AWSError] = js.native
  def invokeScreenAutomation(
    params: InvokeScreenAutomationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InvokeScreenAutomationResult, Unit]
  ): Request[InvokeScreenAutomationResult, AWSError] = js.native
  
  /**
    *  The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook. 
    */
  def listTableColumns(): Request[ListTableColumnsResult, AWSError] = js.native
  def listTableColumns(callback: js.Function2[/* err */ AWSError, /* data */ ListTableColumnsResult, Unit]): Request[ListTableColumnsResult, AWSError] = js.native
  /**
    *  The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook. 
    */
  def listTableColumns(params: ListTableColumnsRequest): Request[ListTableColumnsResult, AWSError] = js.native
  def listTableColumns(
    params: ListTableColumnsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTableColumnsResult, Unit]
  ): Request[ListTableColumnsResult, AWSError] = js.native
  
  /**
    *  The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook. 
    */
  def listTableRows(): Request[ListTableRowsResult, AWSError] = js.native
  def listTableRows(callback: js.Function2[/* err */ AWSError, /* data */ ListTableRowsResult, Unit]): Request[ListTableRowsResult, AWSError] = js.native
  /**
    *  The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook. 
    */
  def listTableRows(params: ListTableRowsRequest): Request[ListTableRowsResult, AWSError] = js.native
  def listTableRows(
    params: ListTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTableRowsResult, Unit]
  ): Request[ListTableRowsResult, AWSError] = js.native
  
  /**
    *  The ListTables API allows you to retrieve a list of all the tables in a workbook. 
    */
  def listTables(): Request[ListTablesResult, AWSError] = js.native
  def listTables(callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResult, Unit]): Request[ListTablesResult, AWSError] = js.native
  /**
    *  The ListTables API allows you to retrieve a list of all the tables in a workbook. 
    */
  def listTables(params: ListTablesRequest): Request[ListTablesResult, AWSError] = js.native
  def listTables(
    params: ListTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResult, Unit]
  ): Request[ListTablesResult, AWSError] = js.native
  
  /**
    *  The ListTagsForResource API allows you to return a resource's tags. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    *  The ListTagsForResource API allows you to return a resource's tags. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    *  The QueryTableRows API allows you to use a filter formula to query for specific rows in a table. 
    */
  def queryTableRows(): Request[QueryTableRowsResult, AWSError] = js.native
  def queryTableRows(callback: js.Function2[/* err */ AWSError, /* data */ QueryTableRowsResult, Unit]): Request[QueryTableRowsResult, AWSError] = js.native
  /**
    *  The QueryTableRows API allows you to use a filter formula to query for specific rows in a table. 
    */
  def queryTableRows(params: QueryTableRowsRequest): Request[QueryTableRowsResult, AWSError] = js.native
  def queryTableRows(
    params: QueryTableRowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ QueryTableRowsResult, Unit]
  ): Request[QueryTableRowsResult, AWSError] = js.native
  
  /**
    *  The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of the job that was started. To find out the status of the import request, you need to call the DescribeTableDataImportJob API. 
    */
  def startTableDataImportJob(): Request[StartTableDataImportJobResult, AWSError] = js.native
  def startTableDataImportJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTableDataImportJobResult, Unit]): Request[StartTableDataImportJobResult, AWSError] = js.native
  /**
    *  The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of the job that was started. To find out the status of the import request, you need to call the DescribeTableDataImportJob API. 
    */
  def startTableDataImportJob(params: StartTableDataImportJobRequest): Request[StartTableDataImportJobResult, AWSError] = js.native
  def startTableDataImportJob(
    params: StartTableDataImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTableDataImportJobResult, Unit]
  ): Request[StartTableDataImportJobResult, AWSError] = js.native
  
  /**
    *  The TagResource API allows you to add tags to an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    *  The TagResource API allows you to add tags to an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    *  The UntagResource API allows you to removes tags from an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    *  The UntagResource API allows you to removes tags from an ARN-able resource. Resource includes workbook, table, screen and screen-automation. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
}
