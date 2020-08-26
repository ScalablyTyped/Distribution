package typings.azure.mod

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
  def this(connectionString: String) = this()
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
  def this(storageAccount: String, storageAccessKey: String) = this()
  def this(storageAccount: String, storageAccessKey: String, host: String) = this()
  def this(
    storageAccount: String,
    storageAccessKey: String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ) = this()
  def this(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String) = this()
  def createTable(table: String): Unit = js.native
  def createTable(table: String, callback: TableRequestCallback): Unit = js.native
  def createTable(table: String, options: TimeoutIntervalOptions): Unit = js.native
  def createTable(table: String, options: TimeoutIntervalOptions, callback: TableRequestCallback): Unit = js.native
  def createTableIfNotExists(table: String): Unit = js.native
  def createTableIfNotExists(table: String, callback: CreateTableIfNotExistsCallback): Unit = js.native
  def createTableIfNotExists(table: String, options: TimeoutIntervalOptions): Unit = js.native
  def createTableIfNotExists(table: String, options: TimeoutIntervalOptions, callback: CreateTableIfNotExistsCallback): Unit = js.native
  def deleteEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def deleteEntity(tableName: String, entityDescriptor: Entity, callback: DeleteEntityCallback): Unit = js.native
  def deleteEntity(tableName: String, entityDescriptor: Entity, options: UpdateEntityOptions): Unit = js.native
  def deleteEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: DeleteEntityCallback
  ): Unit = js.native
  def deleteTable(table: String): Unit = js.native
  def deleteTable(table: String, callback: DeleteTableCallback): Unit = js.native
  def deleteTable(table: String, options: TimeoutIntervalOptions): Unit = js.native
  def deleteTable(table: String, options: TimeoutIntervalOptions, callback: DeleteTableCallback): Unit = js.native
  //#endregion
  //#region Service Methods
  def getServiceProperties(callback: StorageServicePropertiesCallback): Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): Unit = js.native
  //#endregion
  //#region Table Methods
  def getTable(table: String): Unit = js.native
  def getTable(table: String, callback: TableRequestCallback): Unit = js.native
  def getTable(table: String, options: TimeoutIntervalOptions): Unit = js.native
  def getTable(table: String, options: TimeoutIntervalOptions, callback: TableRequestCallback): Unit = js.native
  def insertEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def insertEntity(tableName: String, entityDescriptor: Entity, callback: ModifyEntityCallback): Unit = js.native
  def insertEntity(tableName: String, entityDescriptor: Entity, options: TimeoutIntervalOptions): Unit = js.native
  def insertEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: TimeoutIntervalOptions,
    callback: ModifyEntityCallback
  ): Unit = js.native
  def insertOrMergeEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def insertOrMergeEntity(tableName: String, entityDescriptor: Entity, callback: ModifyEntityCallback): Unit = js.native
  def insertOrMergeEntity(tableName: String, entityDescriptor: Entity, options: UpdateEntityOptions): Unit = js.native
  def insertOrMergeEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): Unit = js.native
  def insertOrReplaceEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def insertOrReplaceEntity(tableName: String, entityDescriptor: Entity, callback: ModifyEntityCallback): Unit = js.native
  def insertOrReplaceEntity(tableName: String, entityDescriptor: Entity, options: TimeoutIntervalOptions): Unit = js.native
  def insertOrReplaceEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: TimeoutIntervalOptions,
    callback: ModifyEntityCallback
  ): Unit = js.native
  def mergeEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def mergeEntity(tableName: String, entityDescriptor: Entity, callback: ModifyEntityCallback): Unit = js.native
  def mergeEntity(tableName: String, entityDescriptor: Entity, options: UpdateEntityOptions): Unit = js.native
  def mergeEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): Unit = js.native
  def queryEntities(tableQuery: TableQuery): Unit = js.native
  def queryEntities(tableQuery: TableQuery, callback: QueryEntitiesCallback): Unit = js.native
  def queryEntities(tableQuery: TableQuery, options: TimeoutIntervalOptions): Unit = js.native
  def queryEntities(tableQuery: TableQuery, options: TimeoutIntervalOptions, callback: QueryEntitiesCallback): Unit = js.native
  //#endregion
  //#region Entities Methods
  def queryEntity(table: String, partitionKey: String, rowKey: String): Unit = js.native
  def queryEntity(table: String, partitionKey: String, rowKey: String, callback: QueryEntityCallback): Unit = js.native
  def queryEntity(table: String, partitionKey: String, rowKey: String, options: TimeoutIntervalOptions): Unit = js.native
  def queryEntity(
    table: String,
    partitionKey: String,
    rowKey: String,
    options: TimeoutIntervalOptions,
    callback: QueryEntityCallback
  ): Unit = js.native
  def queryTables(): Unit = js.native
  def queryTables(callback: QueryTablesCallback): Unit = js.native
  def queryTables(options: QueryTablesOptions): Unit = js.native
  def queryTables(options: QueryTablesOptions, callback: QueryTablesCallback): Unit = js.native
  def setServiceProperties(serviceProperties: StorageServiceProperties, callback: StorageCallbackVoid): Unit = js.native
  def setServiceProperties(
    serviceProperties: StorageServiceProperties,
    options: TimeoutIntervalOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  def updateEntity(tableName: String, entityDescriptor: Entity): Unit = js.native
  def updateEntity(tableName: String, entityDescriptor: Entity, callback: ModifyEntityCallback): Unit = js.native
  def updateEntity(tableName: String, entityDescriptor: Entity, options: UpdateEntityOptions): Unit = js.native
  def updateEntity(
    tableName: String,
    entityDescriptor: Entity,
    options: UpdateEntityOptions,
    callback: ModifyEntityCallback
  ): Unit = js.native
}

/* static members */
@JSImport("azure", "TableService")
@js.native
object TableService extends js.Object {
  var incorrectCallbackErr: String = js.native
  var incorrectPartitionErr: String = js.native
  var incorrectTableNameErr: String = js.native
  var incorrectTableQuery: String = js.native
}

