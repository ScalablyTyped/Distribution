package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "TableService")
@js.native
//#region Constructors
/**
  * Creates a new TableService object.
  * Uses the AZURE_STORAGE_ACCOUNT and AZURE_STORAGE_ACCESS_KEY environment variables.
  *
  * @constructor
  * @extends {ServiceClient}
  */
class TableService () extends BatchServiceClient {
  /**
    * Creates a new TableService object.
    * Uses a connectionString to connect
    *
    * @constructor
    * @extends {ServiceClient}
    * @param {string} connectionString The connection string.
    */
  def this(connectionString: java.lang.String) = this()
  /**
    * Creates a new TableService object.
    * Uses a storage account and an access key.
    *
    * @constructor
    * @extends {ServiceClient}
    * @param {string} storageAccount                    The storage account or the connection string.
    * @param {string} storageAccessKey                  The storage access key.
    * @param {string} host                              The host address.
    * @param {object} authenticationProvider            The authentication provider.
    */
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String) = this()
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String) = this()
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String, authenticationProvider: java.lang.String) = this()
  def createTable(table: java.lang.String): scala.Unit = js.native
  def createTable(table: java.lang.String, callback: TableRequestCallback): scala.Unit = js.native
  def createTable(table: java.lang.String, options: TimeoutIntervalOptions): scala.Unit = js.native
  def createTable(table: java.lang.String, options: TimeoutIntervalOptions, callback: TableRequestCallback): scala.Unit = js.native
  def createTableIfNotExists(table: java.lang.String): scala.Unit = js.native
  def createTableIfNotExists(table: java.lang.String, callback: CreateTableIfNotExistsCallback): scala.Unit = js.native
  def createTableIfNotExists(table: java.lang.String, options: TimeoutIntervalOptions): scala.Unit = js.native
  def createTableIfNotExists(table: java.lang.String, options: TimeoutIntervalOptions, callback: CreateTableIfNotExistsCallback): scala.Unit = js.native
  def deleteEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def deleteEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: DeleteEntityCallback): scala.Unit = js.native
  def deleteEntity(tableName: java.lang.String, entityDescriptor: Entity, options: UpdateEntityOptions): scala.Unit = js.native
  def deleteEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: DeleteEntityCallback
  ): scala.Unit = js.native
  def deleteTable(table: java.lang.String): scala.Unit = js.native
  def deleteTable(table: java.lang.String, callback: DeleteTableCallback): scala.Unit = js.native
  def deleteTable(table: java.lang.String, options: TimeoutIntervalOptions): scala.Unit = js.native
  def deleteTable(table: java.lang.String, options: TimeoutIntervalOptions, callback: DeleteTableCallback): scala.Unit = js.native
  //#endregion
  //#region Service Methods
  def getServiceProperties(callback: StorageServicePropertiesCallback): scala.Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): scala.Unit = js.native
  //#endregion
  //#region Table Methods
  def getTable(table: java.lang.String): scala.Unit = js.native
  def getTable(table: java.lang.String, callback: TableRequestCallback): scala.Unit = js.native
  def getTable(table: java.lang.String, options: TimeoutIntervalOptions): scala.Unit = js.native
  def getTable(table: java.lang.String, options: TimeoutIntervalOptions, callback: TableRequestCallback): scala.Unit = js.native
  def insertEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def insertEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: ModifyEntityCallback): scala.Unit = js.native
  def insertEntity(tableName: java.lang.String, entityDescriptor: Entity, options: TimeoutIntervalOptions): scala.Unit = js.native
  def insertEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: TimeoutIntervalOptions,
    callback: ModifyEntityCallback
  ): scala.Unit = js.native
  def insertOrMergeEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def insertOrMergeEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: ModifyEntityCallback): scala.Unit = js.native
  def insertOrMergeEntity(tableName: java.lang.String, entityDescriptor: Entity, options: UpdateEntityOptions): scala.Unit = js.native
  def insertOrMergeEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): scala.Unit = js.native
  def insertOrReplaceEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def insertOrReplaceEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: ModifyEntityCallback): scala.Unit = js.native
  def insertOrReplaceEntity(tableName: java.lang.String, entityDescriptor: Entity, options: TimeoutIntervalOptions): scala.Unit = js.native
  def insertOrReplaceEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: TimeoutIntervalOptions,
    callback: ModifyEntityCallback
  ): scala.Unit = js.native
  def mergeEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def mergeEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: ModifyEntityCallback): scala.Unit = js.native
  def mergeEntity(tableName: java.lang.String, entityDescriptor: Entity, options: UpdateEntityOptions): scala.Unit = js.native
  def mergeEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): scala.Unit = js.native
  def queryEntities(tableQuery: TableQuery): scala.Unit = js.native
  def queryEntities(tableQuery: TableQuery, callback: QueryEntitiesCallback): scala.Unit = js.native
  def queryEntities(tableQuery: TableQuery, options: TimeoutIntervalOptions): scala.Unit = js.native
  def queryEntities(tableQuery: TableQuery, options: TimeoutIntervalOptions, callback: QueryEntitiesCallback): scala.Unit = js.native
  //#endregion
  //#region Entities Methods
  def queryEntity(table: java.lang.String, partitionKey: java.lang.String, rowKey: java.lang.String): scala.Unit = js.native
  def queryEntity(
    table: java.lang.String,
    partitionKey: java.lang.String,
    rowKey: java.lang.String,
    callback: QueryEntityCallback
  ): scala.Unit = js.native
  def queryEntity(
    table: java.lang.String,
    partitionKey: java.lang.String,
    rowKey: java.lang.String,
    options: TimeoutIntervalOptions
  ): scala.Unit = js.native
  def queryEntity(
    table: java.lang.String,
    partitionKey: java.lang.String,
    rowKey: java.lang.String,
    options: TimeoutIntervalOptions,
    callback: QueryEntityCallback
  ): scala.Unit = js.native
  def queryTables(): scala.Unit = js.native
  def queryTables(callback: QueryTablesCallback): scala.Unit = js.native
  def queryTables(options: QueryTablesOptions): scala.Unit = js.native
  def queryTables(options: QueryTablesOptions, callback: QueryTablesCallback): scala.Unit = js.native
  def setServiceProperties(serviceProperties: StorageServiceProperties, callback: StorageCallbackVoid): scala.Unit = js.native
  def setServiceProperties(
    serviceProperties: StorageServiceProperties,
    options: TimeoutIntervalOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def updateEntity(tableName: java.lang.String, entityDescriptor: Entity): scala.Unit = js.native
  def updateEntity(tableName: java.lang.String, entityDescriptor: Entity, callback: ModifyEntityCallback): scala.Unit = js.native
  def updateEntity(tableName: java.lang.String, entityDescriptor: Entity, options: UpdateEntityOptions): scala.Unit = js.native
  def updateEntity(
    tableName: java.lang.String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): scala.Unit = js.native
}

@JSImport("azure", "TableService")
@js.native
object TableService extends js.Object {
  var incorrectCallbackErr: java.lang.String = js.native
  var incorrectPartitionErr: java.lang.String = js.native
  var incorrectTableNameErr: java.lang.String = js.native
  var incorrectTableQuery: java.lang.String = js.native
}

