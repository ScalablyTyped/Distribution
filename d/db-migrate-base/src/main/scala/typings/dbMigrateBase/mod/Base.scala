package typings.dbMigrateBase.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("db-migrate-base", "Base")
@js.native
class Base protected () extends js.Object {
  def this(intern: InternalOptions) = this()
  def addColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
  def addColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): ^[_] = js.native
  def addForeignKey(
    tableName: String,
    referencedTableName: String,
    keyName: String,
    fieldMapping: js.Any,
    rules: ForeignKeyRules,
    callback: CallbackFunction
  ): Unit = js.native
  def addForeignKeyAsync(
    tableName: String,
    referencedTableName: String,
    keyName: String,
    fieldMapping: js.Any,
    rules: ForeignKeyRules
  ): ^[_] = js.native
  def addIndex(tableName: String, indexName: String, columns: String): Unit = js.native
  def addIndex(tableName: String, indexName: String, columns: String, uniqueOrCb: Boolean): Unit = js.native
  def addIndex(
    tableName: String,
    indexName: String,
    columns: String,
    uniqueOrCb: Boolean,
    callback: CallbackFunction
  ): Unit = js.native
  def addIndex(tableName: String, indexName: String, columns: String, uniqueOrCb: CallbackFunction): Unit = js.native
  def addIndex(
    tableName: String,
    indexName: String,
    columns: String,
    uniqueOrCb: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def addIndex(tableName: String, indexName: String, columns: js.Array[String]): Unit = js.native
  def addIndex(tableName: String, indexName: String, columns: js.Array[String], uniqueOrCb: Boolean): Unit = js.native
  def addIndex(
    tableName: String,
    indexName: String,
    columns: js.Array[String],
    uniqueOrCb: Boolean,
    callback: CallbackFunction
  ): Unit = js.native
  def addIndex(tableName: String, indexName: String, columns: js.Array[String], uniqueOrCb: CallbackFunction): Unit = js.native
  def addIndex(
    tableName: String,
    indexName: String,
    columns: js.Array[String],
    uniqueOrCb: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def addIndexAsync(tableName: String, indexName: String, columns: String): ^[_] = js.native
  def addIndexAsync(tableName: String, indexName: String, columns: String, unique: Boolean): ^[_] = js.native
  def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String]): ^[_] = js.native
  def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String], unique: Boolean): ^[_] = js.native
  def addMigrationRecord(name: String, callback: CallbackFunction): Unit = js.native
  def addMigrationRecordAsync(name: String): ^[_] = js.native
  def addSeedRecord(name: String, callback: CallbackFunction): Unit = js.native
  def addSeedRecordAsync(name: String): ^[_] = js.native
  def all(sql: String): Unit = js.native
  def all(sql: String, paramsOrCb: js.Array[_]): Unit = js.native
  def all(sql: String, paramsOrCb: js.Array[_], callback: CallbackFunction): Unit = js.native
  def all(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
  def all(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def allAsync(sql: String): ^[_] = js.native
  def allAsync(sql: String, params: js.Array[_]): ^[_] = js.native
  def allLoadedMigrations(callback: CallbackFunction): Unit = js.native
  def allLoadedMigrationsAsync(): ^[_] = js.native
  def allLoadedSeeds(callback: CallbackFunction): Unit = js.native
  def allLoadedSeedsAsync(): ^[_] = js.native
  def bindForeignKey(tableName: String, columnName: String, fkOptions: ForeignKeySpec): js.Function1[/* callback */ CallbackFunction, Unit] = js.native
    // TODO Make ids match the type of ids in buildWhereClause(ids);
  def buildWhereClause(ids: js.Any): String = js.native
  def changeColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
  def changeColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): ^[_] = js.native
  def checkDBMS(dbms: js.Any, callback: CallbackFunction): Unit = js.native
  def checkDBMSAsync(dbms: js.Any): ^[_] = js.native
  def close(): Unit = js.native
  def close(callback: CallbackFunction): Unit = js.native
  // Promisified methods
  def closeAsync(): ^[_] = js.native
  def createColumnDef(name: String, spec: ColumnSpec): ColumnDef = js.native
  def createColumnDef(name: String, spec: ColumnSpec, options: js.Any): ColumnDef = js.native
  def createDatabase(options: js.Any*): Unit = js.native
  def createDatabaseAsync(options: js.Any*): ^[_] = js.native
    // TODO Figure out a type for `options`!
  //createColumnConstraint(spec: ColumnSpec, options?: any, ...implementationDefinedOptions: any[]): string;
  def createMigrationsTable(callback: CallbackFunction): Unit = js.native
  def createMigrationsTableAsync(): ^[_] = js.native
  def createSeedsTable(callback: CallbackFunction): Unit = js.native
  def createSeedsTableAsync(): ^[_] = js.native
  def createTable(tableName: String, options: js.Any, callback: CallbackFunction): Unit = js.native
  def createTable(tableName: String, options: CreateTableOptions, callback: CallbackFunction): Unit = js.native
  def createTableAsync(tableName: String, options: js.Any): ^[_] = js.native
  def createTableAsync(tableName: String, options: CreateTableOptions): ^[_] = js.native
  def deleteMigration(migrationName: String, callback: CallbackFunction): Unit = js.native
  def deleteMigrationAsync(migrationName: String): ^[_] = js.native
  def deleteSeed(seedName: String, callback: CallbackFunction): Unit = js.native
  def deleteSeedAsync(seedName: String): ^[_] = js.native
  def dropDatabase(options: js.Any*): Unit = js.native
  def dropDatabaseAsync(options: js.Any*): ^[_] = js.native
  def dropTable(tableName: String): Unit = js.native
  def dropTable(tableName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def dropTable(tableName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def dropTable(tableName: String, optionsOrCb: DropTableOptions): Unit = js.native
  def dropTable(tableName: String, optionsOrCb: DropTableOptions, callback: CallbackFunction): Unit = js.native
  def dropTableAsync(tableName: String): ^[_] = js.native
  def dropTableAsync(tableName: String, options: DropTableOptions): ^[_] = js.native
  def endMigration(callback: CallbackFunction): Unit = js.native
  def endMigrationAsync(callback: CallbackFunction): ^[_] = js.native
  def escape(str: String): String = js.native
  def escapeDDL(str: String): String = js.native
  def escapeString(str: String): String = js.native
  def insert(tableName: String, columnNameOrValueArray: js.Any): Unit = js.native
  def insert(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): Unit = js.native
  def insert(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: js.Any,
    callback: CallbackFunction
  ): Unit = js.native
  def insert(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): Unit = js.native
  def insert(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def insertAsync(tableName: String, columnNameOrValueArray: js.Any): ^[_] = js.native
  def insertAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): ^[_] = js.native
  def insertAsync(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: js.Any,
    callback: CallbackFunction
  ): ^[_] = js.native
  def insertAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): ^[_] = js.native
  def insertAsync(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: CallbackFunction,
    callback: CallbackFunction
  ): ^[_] = js.native
  def lookup(tableName: String, column: String): Unit = js.native
  def lookup(tableName: String, column: String, id: js.Any): Unit = js.native
  def lookup(tableName: String, column: String, id: js.Any, callback: CallbackFunction): Unit = js.native
  def lookupAsync(tableName: String, column: String): ^[_] = js.native
  def lookupAsync(tableName: String, column: String, id: js.Any): ^[_] = js.native
  def lookupAsync(tableName: String, column: String, id: js.Any, callback: CallbackFunction): ^[_] = js.native
  def mapDataType(str: String): String = js.native
  def normalizeColumnSpec(spec: String): ColumnSpec = js.native
  def normalizeColumnSpec(spec: ColumnSpec): ColumnSpec = js.native
  def quoteArr(arr: js.Array[String]): js.Array[String] = js.native
  def quoteDDLArr(arr: js.Array[String]): js.Array[String] = js.native
  def recurseCallbackArray(foreignKeys: js.Array[String], callback: CallbackFunction): Unit = js.native
  def recurseCallbackArrayAsync(foreignKeys: js.Array[String]): ^[_] = js.native
  def remove(table: String, ids: js.Any, callback: CallbackFunction): Unit = js.native
  def removeAsync(table: String, ids: js.Any): ^[_] = js.native
  def removeColumn(tableName: String, columnName: String, callback: CallbackFunction): Unit = js.native
  def removeColumnAsync(tableName: String, columnName: String): ^[_] = js.native
  def removeForeignKey(tableName: String, keyName: String): Unit = js.native
  def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def removeForeignKey(tableName: String, keyName: String, optionsOrCb: RemoveForeignKeyOptions): Unit = js.native
  def removeForeignKey(
    tableName: String,
    keyName: String,
    optionsOrCb: RemoveForeignKeyOptions,
    callback: CallbackFunction
  ): Unit = js.native
  def removeForeignKeyAsync(tableName: String, keyName: String): ^[_] = js.native
  def removeForeignKeyAsync(tableName: String, keyName: String, options: RemoveForeignKeyOptions): ^[_] = js.native
  def removeIndex(tableNameOrIndexName: String): Unit = js.native
  def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String): Unit = js.native
  def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String, callback: CallbackFunction): Unit = js.native
  def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction): Unit = js.native
  def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def removeIndexAsync(tableNameOrIndexName: String): ^[_] = js.native
  def removeIndexAsync(tableNameOrIndexName: String, indexName: String): ^[_] = js.native
  def renameColumn(tableName: String, oldColumnName: String, newColumnName: String, callback: CallbackFunction): Unit = js.native
  def renameColumnAsync(tableName: String, oldColumnName: String, newColumnName: String): ^[_] = js.native
  def renameTable(tableName: String, newTableName: String, callback: CallbackFunction): Unit = js.native
  def renameTableAsync(tableName: String, newTableName: String): ^[_] = js.native
  def runSql(): Unit = js.native
  def runSql(sql: String): Unit = js.native
  def runSql(sql: String, paramsOrCb: js.Array[_]): Unit = js.native
  def runSql(sql: String, paramsOrCb: js.Array[_], callback: CallbackFunction): Unit = js.native
  def runSql(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
  def runSql(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def runSqlAsync(): ^[_] = js.native
  def runSqlAsync(sql: String): ^[_] = js.native
  def runSqlAsync(sql: String, params: js.Array[_]): ^[_] = js.native
  def startMigration(callback: CallbackFunction): Unit = js.native
  def startMigrationAsync(): ^[_] = js.native
  def switchDatabase(options: js.Any*): Unit = js.native
  def switchDatabaseAsync(options: js.Any*): ^[_] = js.native
  def truncate(tableName: String, callback: CallbackFunction): Unit = js.native
  def truncateAsync(tableName: String): ^[_] = js.native
  def update(tableName: String, columnNameOrValueArray: js.Any): Unit = js.native
  def update(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): Unit = js.native
  def update(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any, idsOrCb: js.Any): Unit = js.native
  def update(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any,
    callback: CallbackFunction
  ): Unit = js.native
  def update(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction
  ): Unit = js.native
  def update(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def updateAsync(tableName: String, columnNameOrValueArray: js.Any): ^[_] = js.native
  def updateAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): ^[_] = js.native
  def updateAsync(tableName: String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any, idsOrCb: js.Any): ^[_] = js.native
  def updateAsync(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any,
    callback: CallbackFunction
  ): ^[_] = js.native
  def updateAsync(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction
  ): ^[_] = js.native
  def updateAsync(
    tableName: String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction,
    callback: CallbackFunction
  ): ^[_] = js.native
}

