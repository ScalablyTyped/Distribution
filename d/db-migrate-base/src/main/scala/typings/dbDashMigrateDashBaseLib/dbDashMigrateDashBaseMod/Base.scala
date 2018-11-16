package typings
package dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("db-migrate-base", "Base")
@js.native
class Base protected () extends js.Object {
  def this(intern: InternalOptions) = this()
  def addColumn(
    tableName: java.lang.String,
    columnName: java.lang.String,
    columnSpec: ColumnSpec,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addColumnAsync(tableName: java.lang.String, columnName: java.lang.String, columnSpec: ColumnSpec): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addForeignKey(
    tableName: java.lang.String,
    referencedTableName: java.lang.String,
    keyName: java.lang.String,
    fieldMapping: js.Any,
    rules: ForeignKeyRules,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addForeignKeyAsync(
    tableName: java.lang.String,
    referencedTableName: java.lang.String,
    keyName: java.lang.String,
    fieldMapping: js.Any,
    rules: ForeignKeyRules
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addIndex(tableName: java.lang.String, indexName: java.lang.String, columns: java.lang.String): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: java.lang.String,
    uniqueOrCb: CallbackFunction
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: java.lang.String,
    uniqueOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: java.lang.String,
    uniqueOrCb: scala.Boolean
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: java.lang.String,
    uniqueOrCb: scala.Boolean,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addIndex(tableName: java.lang.String, indexName: java.lang.String, columns: js.Array[java.lang.String]): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: js.Array[java.lang.String],
    uniqueOrCb: CallbackFunction
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: js.Array[java.lang.String],
    uniqueOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: js.Array[java.lang.String],
    uniqueOrCb: scala.Boolean
  ): scala.Unit = js.native
  def addIndex(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: js.Array[java.lang.String],
    uniqueOrCb: scala.Boolean,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def addIndexAsync(tableName: java.lang.String, indexName: java.lang.String, columns: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addIndexAsync(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: java.lang.String,
    unique: scala.Boolean
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addIndexAsync(tableName: java.lang.String, indexName: java.lang.String, columns: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addIndexAsync(
    tableName: java.lang.String,
    indexName: java.lang.String,
    columns: js.Array[java.lang.String],
    unique: scala.Boolean
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addMigrationRecord(name: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def addMigrationRecordAsync(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def addSeedRecord(name: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def addSeedRecordAsync(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def all(sql: java.lang.String): scala.Unit = js.native
  def all(sql: java.lang.String, paramsOrCb: CallbackFunction): scala.Unit = js.native
  def all(sql: java.lang.String, paramsOrCb: CallbackFunction, callback: CallbackFunction): scala.Unit = js.native
  def all(sql: java.lang.String, paramsOrCb: js.Array[_]): scala.Unit = js.native
  def all(sql: java.lang.String, paramsOrCb: js.Array[_], callback: CallbackFunction): scala.Unit = js.native
  def allAsync(sql: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def allAsync(sql: java.lang.String, params: js.Array[_]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def allLoadedMigrations(callback: CallbackFunction): scala.Unit = js.native
  def allLoadedMigrationsAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def allLoadedSeeds(callback: CallbackFunction): scala.Unit = js.native
  def allLoadedSeedsAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def bindForeignKey(tableName: java.lang.String, columnName: java.lang.String, fkOptions: ForeignKeySpec): js.Function1[/* callback */ CallbackFunction, scala.Unit] = js.native
    // TODO Make ids match the type of ids in buildWhereClause(ids);
  def buildWhereClause(ids: js.Any): java.lang.String = js.native
  def changeColumn(
    tableName: java.lang.String,
    columnName: java.lang.String,
    columnSpec: ColumnSpec,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def changeColumnAsync(tableName: java.lang.String, columnName: java.lang.String, columnSpec: ColumnSpec): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def checkDBMS(dbms: js.Any, callback: CallbackFunction): scala.Unit = js.native
  def checkDBMSAsync(dbms: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def close(): scala.Unit = js.native
  def close(callback: CallbackFunction): scala.Unit = js.native
  // Promisified methods
  def closeAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createColumnDef(name: java.lang.String, spec: ColumnSpec): ColumnDef = js.native
  def createColumnDef(name: java.lang.String, spec: ColumnSpec, options: js.Any): ColumnDef = js.native
  def createDatabase(options: js.Any*): scala.Unit = js.native
  def createDatabaseAsync(options: js.Any*): bluebirdLib.bluebirdMod.namespaced[_] = js.native
    // TODO Figure out a type for `options`!
  //createColumnConstraint(spec: ColumnSpec, options?: any, ...implementationDefinedOptions: any[]): string;
  def createMigrationsTable(callback: CallbackFunction): scala.Unit = js.native
  def createMigrationsTableAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createSeedsTable(callback: CallbackFunction): scala.Unit = js.native
  def createSeedsTableAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createTable(tableName: java.lang.String, options: CreateTableOptions, callback: CallbackFunction): scala.Unit = js.native
  def createTable(tableName: java.lang.String, options: js.Any, callback: CallbackFunction): scala.Unit = js.native
  def createTableAsync(tableName: java.lang.String, options: CreateTableOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createTableAsync(tableName: java.lang.String, options: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def deleteMigration(migrationName: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def deleteMigrationAsync(migrationName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def deleteSeed(seedName: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def deleteSeedAsync(seedName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropDatabase(options: js.Any*): scala.Unit = js.native
  def dropDatabaseAsync(options: js.Any*): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropTable(tableName: java.lang.String): scala.Unit = js.native
  def dropTable(tableName: java.lang.String, optionsOrCb: CallbackFunction): scala.Unit = js.native
  def dropTable(tableName: java.lang.String, optionsOrCb: CallbackFunction, callback: CallbackFunction): scala.Unit = js.native
  def dropTable(tableName: java.lang.String, optionsOrCb: DropTableOptions): scala.Unit = js.native
  def dropTable(tableName: java.lang.String, optionsOrCb: DropTableOptions, callback: CallbackFunction): scala.Unit = js.native
  def dropTableAsync(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropTableAsync(tableName: java.lang.String, options: DropTableOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def endMigration(callback: CallbackFunction): scala.Unit = js.native
  def endMigrationAsync(callback: CallbackFunction): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def escapeDDL(str: java.lang.String): java.lang.String = js.native
  def escapeString(str: java.lang.String): java.lang.String = js.native
  def insert(tableName: java.lang.String, columnNameOrValueArray: js.Any): scala.Unit = js.native
  def insert(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): scala.Unit = js.native
  def insert(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def insert(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): scala.Unit = js.native
  def insert(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: js.Any,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def insertAsync(tableName: java.lang.String, columnNameOrValueArray: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def insertAsync(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrCb: CallbackFunction): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def insertAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: CallbackFunction,
    callback: CallbackFunction
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def insertAsync(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrCb: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def insertAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrCb: js.Any,
    callback: CallbackFunction
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def lookup(tableName: java.lang.String, column: java.lang.String): scala.Unit = js.native
  def lookup(tableName: java.lang.String, column: java.lang.String, id: js.Any): scala.Unit = js.native
  def lookup(tableName: java.lang.String, column: java.lang.String, id: js.Any, callback: CallbackFunction): scala.Unit = js.native
  def lookupAsync(tableName: java.lang.String, column: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def lookupAsync(tableName: java.lang.String, column: java.lang.String, id: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def lookupAsync(tableName: java.lang.String, column: java.lang.String, id: js.Any, callback: CallbackFunction): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def mapDataType(str: java.lang.String): java.lang.String = js.native
  def normalizeColumnSpec(spec: ColumnSpec): ColumnSpec = js.native
  def normalizeColumnSpec(spec: java.lang.String): ColumnSpec = js.native
  def quoteArr(arr: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def quoteDDLArr(arr: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def recurseCallbackArray(foreignKeys: js.Array[java.lang.String], callback: CallbackFunction): scala.Unit = js.native
  def recurseCallbackArrayAsync(foreignKeys: js.Array[java.lang.String]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def remove(table: java.lang.String, ids: js.Any, callback: CallbackFunction): scala.Unit = js.native
  def removeAsync(table: java.lang.String, ids: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeColumn(tableName: java.lang.String, columnName: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def removeColumnAsync(tableName: java.lang.String, columnName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeForeignKey(tableName: java.lang.String, keyName: java.lang.String): scala.Unit = js.native
  def removeForeignKey(tableName: java.lang.String, keyName: java.lang.String, optionsOrCb: CallbackFunction): scala.Unit = js.native
  def removeForeignKey(
    tableName: java.lang.String,
    keyName: java.lang.String,
    optionsOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def removeForeignKey(tableName: java.lang.String, keyName: java.lang.String, optionsOrCb: RemoveForeignKeyOptions): scala.Unit = js.native
  def removeForeignKey(
    tableName: java.lang.String,
    keyName: java.lang.String,
    optionsOrCb: RemoveForeignKeyOptions,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def removeForeignKeyAsync(tableName: java.lang.String, keyName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeForeignKeyAsync(tableName: java.lang.String, keyName: java.lang.String, options: RemoveForeignKeyOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeIndex(tableNameOrIndexName: java.lang.String): scala.Unit = js.native
  def removeIndex(tableNameOrIndexName: java.lang.String, indexNameOrCb: CallbackFunction): scala.Unit = js.native
  def removeIndex(
    tableNameOrIndexName: java.lang.String,
    indexNameOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def removeIndex(tableNameOrIndexName: java.lang.String, indexNameOrCb: java.lang.String): scala.Unit = js.native
  def removeIndex(
    tableNameOrIndexName: java.lang.String,
    indexNameOrCb: java.lang.String,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def removeIndexAsync(tableNameOrIndexName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def removeIndexAsync(tableNameOrIndexName: java.lang.String, indexName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def renameColumn(
    tableName: java.lang.String,
    oldColumnName: java.lang.String,
    newColumnName: java.lang.String,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def renameColumnAsync(tableName: java.lang.String, oldColumnName: java.lang.String, newColumnName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def renameTable(tableName: java.lang.String, newTableName: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def renameTableAsync(tableName: java.lang.String, newTableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def runSql(): scala.Unit = js.native
  def runSql(sql: java.lang.String): scala.Unit = js.native
  def runSql(sql: java.lang.String, paramsOrCb: CallbackFunction): scala.Unit = js.native
  def runSql(sql: java.lang.String, paramsOrCb: CallbackFunction, callback: CallbackFunction): scala.Unit = js.native
  def runSql(sql: java.lang.String, paramsOrCb: js.Array[_]): scala.Unit = js.native
  def runSql(sql: java.lang.String, paramsOrCb: js.Array[_], callback: CallbackFunction): scala.Unit = js.native
  def runSqlAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def runSqlAsync(sql: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def runSqlAsync(sql: java.lang.String, params: js.Array[_]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def startMigration(callback: CallbackFunction): scala.Unit = js.native
  def startMigrationAsync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def switchDatabase(options: js.Any*): scala.Unit = js.native
  def switchDatabaseAsync(options: js.Any*): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def truncate(tableName: java.lang.String, callback: CallbackFunction): scala.Unit = js.native
  def truncateAsync(tableName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def update(tableName: java.lang.String, columnNameOrValueArray: js.Any): scala.Unit = js.native
  def update(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): scala.Unit = js.native
  def update(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction
  ): scala.Unit = js.native
  def update(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def update(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any
  ): scala.Unit = js.native
  def update(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any,
    callback: CallbackFunction
  ): scala.Unit = js.native
  def updateAsync(tableName: java.lang.String, columnNameOrValueArray: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateAsync(tableName: java.lang.String, columnNameOrValueArray: js.Any, valueArrayOrIds: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: CallbackFunction,
    callback: CallbackFunction
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def updateAsync(
    tableName: java.lang.String,
    columnNameOrValueArray: js.Any,
    valueArrayOrIds: js.Any,
    idsOrCb: js.Any,
    callback: CallbackFunction
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

