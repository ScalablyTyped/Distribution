package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object honeycodeMod {
  
  @JSImport("aws-sdk/clients/honeycode", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends Honeycode {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.honeycodeMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type ClientRequestToken = String
  
  @js.native
  trait ColumnMetadata extends StObject {
    
    /**
      * The format of the column.
      */
    var format: Format = js.native
    
    /**
      * The name of the column.
      */
    var name: Name = js.native
  }
  object ColumnMetadata {
    
    @scala.inline
    def apply(format: Format, name: Name): ColumnMetadata = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnMetadata]
    }
    
    @scala.inline
    implicit class ColumnMetadataMutableBuilder[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataItem extends StObject {
    
    /**
      * The formatted value of the data. e.g. John Smith.
      */
    var formattedValue: js.UndefOr[FormattedValue] = js.native
    
    /**
      *  The overrideFormat is optional and is specified only if a particular row of data has a different format for the data than the default format defined on the screen or the table. 
      */
    var overrideFormat: js.UndefOr[Format] = js.native
    
    /**
      * The raw value of the data. e.g. jsmith@example.com
      */
    var rawValue: js.UndefOr[RawValue] = js.native
  }
  object DataItem {
    
    @scala.inline
    def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormattedValue(value: FormattedValue): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
      
      @scala.inline
      def setOverrideFormat(value: Format): Self = StObject.set(x, "overrideFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideFormatUndefined: Self = StObject.set(x, "overrideFormat", js.undefined)
      
      @scala.inline
      def setRawValue(value: RawValue): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
    }
  }
  
  type DataItems = js.Array[DataItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTO
    - typings.awsSdk.awsSdkStrings.NUMBER
    - typings.awsSdk.awsSdkStrings.CURRENCY
    - typings.awsSdk.awsSdkStrings.DATE
    - typings.awsSdk.awsSdkStrings.TIME
    - typings.awsSdk.awsSdkStrings.DATE_TIME
    - typings.awsSdk.awsSdkStrings.PERCENTAGE
    - typings.awsSdk.awsSdkStrings.TEXT
    - typings.awsSdk.awsSdkStrings.ACCOUNTING
    - typings.awsSdk.awsSdkStrings.CONTACT
    - typings.awsSdk.awsSdkStrings.ROWLINK
    - java.lang.String
  */
  type Format = _Format | String
  
  type FormattedValue = String
  
  @js.native
  trait GetScreenDataRequest extends StObject {
    
    /**
      * The ID of the app that contains the screem.
      */
    var appId: ResourceId = js.native
    
    /**
      *  The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is 100.   This parameter is optional. If you don't specify this parameter, the default page size is 100. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.native
    
    /**
      *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.native
    
    /**
      * The ID of the screen.
      */
    var screenId: ResourceId = js.native
    
    /**
      *  Variables are optional and are needed only if the screen requires them to render correctly. Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. 
      */
    var variables: js.UndefOr[VariableValueMap] = js.native
    
    /**
      * The ID of the workbook that contains the screen.
      */
    var workbookId: ResourceId = js.native
  }
  object GetScreenDataRequest {
    
    @scala.inline
    def apply(appId: ResourceId, screenId: ResourceId, workbookId: ResourceId): GetScreenDataRequest = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScreenDataRequest]
    }
    
    @scala.inline
    implicit class GetScreenDataRequestMutableBuilder[Self <: GetScreenDataRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: ResourceId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setScreenId(value: ResourceId): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: VariableValueMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      @scala.inline
      def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetScreenDataResult extends StObject {
    
    /**
      *  Provides the pagination token to load the next page if there are more results matching the request. If a pagination token is not present in the response, it means that all data matching the query has been loaded. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.native
    
    /**
      * A map of all the rows on the screen keyed by block name.
      */
    var results: ResultSetMap = js.native
    
    /**
      *  Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps increasing with every update and the increments are not sequential. 
      */
    var workbookCursor: WorkbookCursor = js.native
  }
  object GetScreenDataResult {
    
    @scala.inline
    def apply(results: ResultSetMap, workbookCursor: WorkbookCursor): GetScreenDataResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetScreenDataResult]
    }
    
    @scala.inline
    implicit class GetScreenDataResultMutableBuilder[Self <: GetScreenDataResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setResults(value: ResultSetMap): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Honeycode extends Service {
    
    @JSName("config")
    var config_Honeycode: ConfigBase with ClientConfiguration = js.native
    
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
  }
  
  @js.native
  trait InvokeScreenAutomationRequest extends StObject {
    
    /**
      * The ID of the app that contains the screen automation.
      */
    var appId: ResourceId = js.native
    
    /**
      *  The request token for performing the automation action. Request tokens help to identify duplicate requests. If a call times out or fails due to a transient error like a failed network connection, you can retry the call with the same request token. The service ensures that if the first call using that request token is successfully performed, the second call will return the response of the previous call rather than performing the action again.   Note that request tokens are valid only for a few minutes. You cannot use request tokens to dedupe requests spanning hours or days. 
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
    
    /**
      *  The row ID for the automation if the automation is defined inside a block with source or list. 
      */
    var rowId: js.UndefOr[RowId] = js.native
    
    /**
      * The ID of the automation action to be performed.
      */
    var screenAutomationId: ResourceId = js.native
    
    /**
      * The ID of the screen that contains the screen automation.
      */
    var screenId: ResourceId = js.native
    
    /**
      *  Variables are optional and are needed only if the screen requires them to render correctly. Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. 
      */
    var variables: js.UndefOr[VariableValueMap] = js.native
    
    /**
      * The ID of the workbook that contains the screen automation.
      */
    var workbookId: ResourceId = js.native
  }
  object InvokeScreenAutomationRequest {
    
    @scala.inline
    def apply(appId: ResourceId, screenAutomationId: ResourceId, screenId: ResourceId, workbookId: ResourceId): InvokeScreenAutomationRequest = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenAutomationId = screenAutomationId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeScreenAutomationRequest]
    }
    
    @scala.inline
    implicit class InvokeScreenAutomationRequestMutableBuilder[Self <: InvokeScreenAutomationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: ResourceId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
      
      @scala.inline
      def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
      
      @scala.inline
      def setScreenAutomationId(value: ResourceId): Self = StObject.set(x, "screenAutomationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenId(value: ResourceId): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: VariableValueMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      @scala.inline
      def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvokeScreenAutomationResult extends StObject {
    
    /**
      * The updated workbook cursor after performing the automation action.
      */
    var workbookCursor: WorkbookCursor = js.native
  }
  object InvokeScreenAutomationResult {
    
    @scala.inline
    def apply(workbookCursor: WorkbookCursor): InvokeScreenAutomationResult = {
      val __obj = js.Dynamic.literal(workbookCursor = workbookCursor.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeScreenAutomationResult]
    }
    
    @scala.inline
    implicit class InvokeScreenAutomationResultMutableBuilder[Self <: InvokeScreenAutomationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
    }
  }
  
  type MaxResults = Double
  
  type Name = String
  
  type PaginationToken = String
  
  type RawValue = String
  
  type ResourceId = String
  
  type ResultHeader = js.Array[ColumnMetadata]
  
  @js.native
  trait ResultRow extends StObject {
    
    /**
      * List of all the data cells in a row.
      */
    var dataItems: DataItems = js.native
    
    /**
      * The ID for a particular row.
      */
    var rowId: js.UndefOr[RowId] = js.native
  }
  object ResultRow {
    
    @scala.inline
    def apply(dataItems: DataItems): ResultRow = {
      val __obj = js.Dynamic.literal(dataItems = dataItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultRow]
    }
    
    @scala.inline
    implicit class ResultRowMutableBuilder[Self <: ResultRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataItems(value: DataItems): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataItemsVarargs(value: DataItem*): Self = StObject.set(x, "dataItems", js.Array(value :_*))
      
      @scala.inline
      def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
    }
  }
  
  type ResultRows = js.Array[ResultRow]
  
  @js.native
  trait ResultSet extends StObject {
    
    /**
      *  List of headers for all the data cells in the block. The header identifies the name and default format of the data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.   For example, a task list that displays the task name, due date and assigned person might have headers [ { "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in the result will have the task name as the first item, due date as the second item and assigned person as the third item. If a particular task does not have a due date, that row will still have a blank value in the second element and the assigned person will still be in the third element. 
      */
    var headers: ResultHeader = js.native
    
    /**
      *  List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells will be present in the same order as they are defined in the header. 
      */
    var rows: ResultRows = js.native
  }
  object ResultSet {
    
    @scala.inline
    def apply(headers: ResultHeader, rows: ResultRows): ResultSet = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    @scala.inline
    implicit class ResultSetMutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: ResultHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: ColumnMetadata*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: ResultRows): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: ResultRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  type ResultSetMap = StringDictionary[ResultSet]
  
  type RowId = String
  
  type VariableName = String
  
  @js.native
  trait VariableValue extends StObject {
    
    /**
      * Raw value of the variable.
      */
    var rawValue: RawValue = js.native
  }
  object VariableValue {
    
    @scala.inline
    def apply(rawValue: RawValue): VariableValue = {
      val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableValue]
    }
    
    @scala.inline
    implicit class VariableValueMutableBuilder[Self <: VariableValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawValue(value: RawValue): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
  
  type VariableValueMap = StringDictionary[VariableValue]
  
  type WorkbookCursor = Double
  
  trait _Format extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-03-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
