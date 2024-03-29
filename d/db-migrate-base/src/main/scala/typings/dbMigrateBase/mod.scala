package typings.dbMigrateBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("db-migrate-base", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Base {
    def this(intern: InternalOptions) = this()
  }
  
  @js.native
  trait Base extends StObject {
    
    def addColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
    
    def addColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): typings.bluebird.mod.^[Any] = js.native
    
    def addForeignKey(
      tableName: String,
      referencedTableName: String,
      keyName: String,
      fieldMapping: Any,
      rules: ForeignKeyRules,
      callback: CallbackFunction
    ): Unit = js.native
    
    def addForeignKeyAsync(
      tableName: String,
      referencedTableName: String,
      keyName: String,
      fieldMapping: Any,
      rules: ForeignKeyRules
    ): typings.bluebird.mod.^[Any] = js.native
    
    def addIndex(tableName: String, indexName: String, columns: String): Unit = js.native
    def addIndex(tableName: String, indexName: String, columns: String, uniqueOrCb: Boolean): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: String,
      uniqueOrCb: Boolean,
      callback: CallbackFunction
    ): Unit = js.native
    def addIndex(
      tableName: String,
      indexName: String,
      columns: String,
      uniqueOrCb: Unit,
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
    def addIndex(
      tableName: String,
      indexName: String,
      columns: js.Array[String],
      uniqueOrCb: Unit,
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
    
    def addIndexAsync(tableName: String, indexName: String, columns: String): typings.bluebird.mod.^[Any] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: String, unique: Boolean): typings.bluebird.mod.^[Any] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String]): typings.bluebird.mod.^[Any] = js.native
    def addIndexAsync(tableName: String, indexName: String, columns: js.Array[String], unique: Boolean): typings.bluebird.mod.^[Any] = js.native
    
    def addMigrationRecord(name: String, callback: CallbackFunction): Unit = js.native
    
    def addMigrationRecordAsync(name: String): typings.bluebird.mod.^[Any] = js.native
    
    def addSeedRecord(name: String, callback: CallbackFunction): Unit = js.native
    
    def addSeedRecordAsync(name: String): typings.bluebird.mod.^[Any] = js.native
    
    def all(sql: String): Unit = js.native
    def all(sql: String, paramsOrCb: js.Array[Any]): Unit = js.native
    def all(sql: String, paramsOrCb: js.Array[Any], callback: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
    def all(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def allAsync(sql: String): typings.bluebird.mod.^[Any] = js.native
    def allAsync(sql: String, params: js.Array[Any]): typings.bluebird.mod.^[Any] = js.native
    
    def allLoadedMigrations(callback: CallbackFunction): Unit = js.native
    
    def allLoadedMigrationsAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def allLoadedSeeds(callback: CallbackFunction): Unit = js.native
    
    def allLoadedSeedsAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def bindForeignKey(tableName: String, columnName: String, fkOptions: ForeignKeySpec): js.Function1[/* callback */ CallbackFunction, Unit] = js.native
    
    // TODO Make ids match the type of ids in buildWhereClause(ids);
    def buildWhereClause(ids: Any): String = js.native
    
    def changeColumn(tableName: String, columnName: String, columnSpec: ColumnSpec, callback: CallbackFunction): Unit = js.native
    
    def changeColumnAsync(tableName: String, columnName: String, columnSpec: ColumnSpec): typings.bluebird.mod.^[Any] = js.native
    
    def checkDBMS(dbms: Any, callback: CallbackFunction): Unit = js.native
    
    def checkDBMSAsync(dbms: Any): typings.bluebird.mod.^[Any] = js.native
    
    def close(): Unit = js.native
    def close(callback: CallbackFunction): Unit = js.native
    
    // Promisified methods
    def closeAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def createColumnDef(name: String, spec: ColumnSpec): ColumnDef = js.native
    def createColumnDef(name: String, spec: ColumnSpec, options: Any): ColumnDef = js.native
    
    def createDatabase(options: Any*): Unit = js.native
    
    def createDatabaseAsync(options: Any*): typings.bluebird.mod.^[Any] = js.native
    
    // TODO Figure out a type for `options`!
    //createColumnConstraint(spec: Base.ColumnSpec, options?: any, ...implementationDefinedOptions: any[]): string;
    def createMigrationsTable(callback: CallbackFunction): Unit = js.native
    
    def createMigrationsTableAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def createSeedsTable(callback: CallbackFunction): Unit = js.native
    
    def createSeedsTableAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def createTable(tableName: String, options: Any, callback: CallbackFunction): Unit = js.native
    def createTable(tableName: String, options: CreateTableOptions, callback: CallbackFunction): Unit = js.native
    
    def createTableAsync(tableName: String, options: Any): typings.bluebird.mod.^[Any] = js.native
    def createTableAsync(tableName: String, options: CreateTableOptions): typings.bluebird.mod.^[Any] = js.native
    
    def deleteMigration(migrationName: String, callback: CallbackFunction): Unit = js.native
    
    def deleteMigrationAsync(migrationName: String): typings.bluebird.mod.^[Any] = js.native
    
    def deleteSeed(seedName: String, callback: CallbackFunction): Unit = js.native
    
    def deleteSeedAsync(seedName: String): typings.bluebird.mod.^[Any] = js.native
    
    def dropDatabase(options: Any*): Unit = js.native
    
    def dropDatabaseAsync(options: Any*): typings.bluebird.mod.^[Any] = js.native
    
    def dropTable(tableName: String): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: DropTableOptions): Unit = js.native
    def dropTable(tableName: String, optionsOrCb: DropTableOptions, callback: CallbackFunction): Unit = js.native
    
    def dropTableAsync(tableName: String): typings.bluebird.mod.^[Any] = js.native
    def dropTableAsync(tableName: String, options: DropTableOptions): typings.bluebird.mod.^[Any] = js.native
    
    def endMigration(callback: CallbackFunction): Unit = js.native
    
    def endMigrationAsync(callback: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    
    def escape(str: String): String = js.native
    
    def escapeDDL(str: String): String = js.native
    
    def escapeString(str: String): String = js.native
    
    def insert(tableName: String, columnNameOrValueArray: Any): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Any): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Any, callback: CallbackFunction): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def insert(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: CallbackFunction): Unit = js.native
    def insert(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    
    def insertAsync(tableName: String, columnNameOrValueArray: Any): typings.bluebird.mod.^[Any] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Any): typings.bluebird.mod.^[Any] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Any, callback: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: Unit, callback: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def insertAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrCb: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def insertAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    
    def lookup(tableName: String, column: String): Unit = js.native
    def lookup(tableName: String, column: String, id: Any): Unit = js.native
    def lookup(tableName: String, column: String, id: Any, callback: CallbackFunction): Unit = js.native
    def lookup(tableName: String, column: String, id: Unit, callback: CallbackFunction): Unit = js.native
    
    def lookupAsync(tableName: String, column: String): typings.bluebird.mod.^[Any] = js.native
    def lookupAsync(tableName: String, column: String, id: Any): typings.bluebird.mod.^[Any] = js.native
    def lookupAsync(tableName: String, column: String, id: Any, callback: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def lookupAsync(tableName: String, column: String, id: Unit, callback: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    
    def mapDataType(str: String): String = js.native
    
    def normalizeColumnSpec(spec: String): ColumnSpec = js.native
    def normalizeColumnSpec(spec: ColumnSpec): ColumnSpec = js.native
    
    def quoteArr(arr: js.Array[String]): js.Array[String] = js.native
    
    def quoteDDLArr(arr: js.Array[String]): js.Array[String] = js.native
    
    def recurseCallbackArray(foreignKeys: js.Array[String], callback: CallbackFunction): Unit = js.native
    
    def recurseCallbackArrayAsync(foreignKeys: js.Array[String]): typings.bluebird.mod.^[Any] = js.native
    
    def remove(table: String, ids: Any, callback: CallbackFunction): Unit = js.native
    
    def removeAsync(table: String, ids: Any): typings.bluebird.mod.^[Any] = js.native
    
    def removeColumn(tableName: String, columnName: String, callback: CallbackFunction): Unit = js.native
    
    def removeColumnAsync(tableName: String, columnName: String): typings.bluebird.mod.^[Any] = js.native
    
    def removeForeignKey(tableName: String, keyName: String): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def removeForeignKey(tableName: String, keyName: String, optionsOrCb: RemoveForeignKeyOptions): Unit = js.native
    def removeForeignKey(
      tableName: String,
      keyName: String,
      optionsOrCb: RemoveForeignKeyOptions,
      callback: CallbackFunction
    ): Unit = js.native
    
    def removeForeignKeyAsync(tableName: String, keyName: String): typings.bluebird.mod.^[Any] = js.native
    def removeForeignKeyAsync(tableName: String, keyName: String, options: RemoveForeignKeyOptions): typings.bluebird.mod.^[Any] = js.native
    
    def removeIndex(tableNameOrIndexName: String): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: String, callback: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction): Unit = js.native
    def removeIndex(tableNameOrIndexName: String, indexNameOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def removeIndexAsync(tableNameOrIndexName: String): typings.bluebird.mod.^[Any] = js.native
    def removeIndexAsync(tableNameOrIndexName: String, indexName: String): typings.bluebird.mod.^[Any] = js.native
    
    def renameColumn(tableName: String, oldColumnName: String, newColumnName: String, callback: CallbackFunction): Unit = js.native
    
    def renameColumnAsync(tableName: String, oldColumnName: String, newColumnName: String): typings.bluebird.mod.^[Any] = js.native
    
    def renameTable(tableName: String, newTableName: String, callback: CallbackFunction): Unit = js.native
    
    def renameTableAsync(tableName: String, newTableName: String): typings.bluebird.mod.^[Any] = js.native
    
    def runSql(): Unit = js.native
    def runSql(sql: String): Unit = js.native
    def runSql(sql: String, paramsOrCb: js.Array[Any]): Unit = js.native
    def runSql(sql: String, paramsOrCb: js.Array[Any], callback: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: CallbackFunction): Unit = js.native
    def runSql(sql: String, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def runSql(sql: Unit, paramsOrCb: js.Array[Any]): Unit = js.native
    def runSql(sql: Unit, paramsOrCb: js.Array[Any], callback: CallbackFunction): Unit = js.native
    def runSql(sql: Unit, paramsOrCb: Unit, callback: CallbackFunction): Unit = js.native
    def runSql(sql: Unit, paramsOrCb: CallbackFunction): Unit = js.native
    def runSql(sql: Unit, paramsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    
    def runSqlAsync(): typings.bluebird.mod.^[Any] = js.native
    def runSqlAsync(sql: String): typings.bluebird.mod.^[Any] = js.native
    def runSqlAsync(sql: String, params: js.Array[Any]): typings.bluebird.mod.^[Any] = js.native
    def runSqlAsync(sql: Unit, params: js.Array[Any]): typings.bluebird.mod.^[Any] = js.native
    
    def startMigration(callback: CallbackFunction): Unit = js.native
    
    def startMigrationAsync(): typings.bluebird.mod.^[Any] = js.native
    
    def switchDatabase(options: Any*): Unit = js.native
    
    def switchDatabaseAsync(options: Any*): typings.bluebird.mod.^[Any] = js.native
    
    def truncate(tableName: String, callback: CallbackFunction): Unit = js.native
    
    def truncateAsync(tableName: String): typings.bluebird.mod.^[Any] = js.native
    
    def update(tableName: String, columnNameOrValueArray: Any): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any, idsOrCb: Any): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: Any,
      callback: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: Unit,
      callback: CallbackFunction
    ): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any, idsOrCb: CallbackFunction): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Unit, idsOrCb: Any): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: Any,
      callback: CallbackFunction
    ): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: Unit,
      callback: CallbackFunction
    ): Unit = js.native
    def update(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Unit, idsOrCb: CallbackFunction): Unit = js.native
    def update(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): Unit = js.native
    
    def updateAsync(tableName: String, columnNameOrValueArray: Any): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any, idsOrCb: Any): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: Any,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: Unit,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Any, idsOrCb: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Any,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Unit, idsOrCb: Any): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: Any,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: Unit,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(tableName: String, columnNameOrValueArray: Any, valueArrayOrIds: Unit, idsOrCb: CallbackFunction): typings.bluebird.mod.^[Any] = js.native
    def updateAsync(
      tableName: String,
      columnNameOrValueArray: Any,
      valueArrayOrIds: Unit,
      idsOrCb: CallbackFunction,
      callback: CallbackFunction
    ): typings.bluebird.mod.^[Any] = js.native
  }
  
  type CallbackFunction = js.Function2[/* err */ Any, /* response */ Any, Unit]
  
  trait ColumnDef extends StObject {
    
    // TODO Figure this out!
    var constraints: String
    
    var foreignKey: js.UndefOr[Any] = js.undefined
  }
  object ColumnDef {
    
    inline def apply(constraints: String): ColumnDef = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnDef] (val x: Self) extends AnyVal {
      
      inline def setConstraints(value: String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setForeignKey(value: Any): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    }
  }
  
  trait ColumnSpec extends StObject {
    
    var autoIncrement: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var foreignKey: js.UndefOr[ForeignKeySpec] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var notNull: js.UndefOr[Boolean] = js.undefined
    
    var primaryKey: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var unique: js.UndefOr[Boolean] = js.undefined
    
    var unsigned: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnSpec {
    
    inline def apply(`type`: String): ColumnSpec = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnSpec] (val x: Self) extends AnyVal {
      
      inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
      
      inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setForeignKey(value: ForeignKeySpec): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
      
      inline def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
      
      inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
      
      inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
    }
  }
  
  trait CreateTableOptions extends StObject {
    
    var columns: js.UndefOr[js.Array[ColumnSpec]] = js.undefined
    
    var ifNotExists: js.UndefOr[Boolean] = js.undefined
  }
  object CreateTableOptions {
    
    inline def apply(): CreateTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateTableOptions] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[ColumnSpec]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnSpec*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIfNotExists(value: Boolean): Self = StObject.set(x, "ifNotExists", value.asInstanceOf[js.Any])
      
      inline def setIfNotExistsUndefined: Self = StObject.set(x, "ifNotExists", js.undefined)
    }
  }
  
  trait DropTableOptions extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.undefined
  }
  object DropTableOptions {
    
    inline def apply(): DropTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropTableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropTableOptions] (val x: Self) extends AnyVal {
      
      inline def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      inline def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  trait ForeignKeyRules extends StObject {
    
    var onDelete: String
    
    var onUpdate: String
  }
  object ForeignKeyRules {
    
    inline def apply(onDelete: String, onUpdate: String): ForeignKeyRules = {
      val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeyRules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForeignKeyRules] (val x: Self) extends AnyVal {
      
      inline def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForeignKeySpec extends StObject {
    
    var mapping: String | Any
    
    var name: String
    
    var rules: js.UndefOr[ForeignKeyRules] = js.undefined
    
    var table: String
  }
  object ForeignKeySpec {
    
    inline def apply(mapping: String | Any, name: String, table: String): ForeignKeySpec = {
      val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForeignKeySpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForeignKeySpec] (val x: Self) extends AnyVal {
      
      inline def setMapping(value: String | Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRules(value: ForeignKeyRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalModule extends StObject {
    
    var log: Any
    
    var `type`: Any
  }
  object InternalModule {
    
    inline def apply(log: Any, `type`: Any): InternalModule = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalModule] (val x: Self) extends AnyVal {
      
      inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalOptions extends StObject {
    
    var mod: InternalModule
  }
  object InternalOptions {
    
    inline def apply(mod: InternalModule): InternalOptions = {
      val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      inline def setMod(value: InternalModule): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveForeignKeyOptions extends StObject {
    
    var dropIndex: js.UndefOr[Boolean] = js.undefined
  }
  object RemoveForeignKeyOptions {
    
    inline def apply(): RemoveForeignKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveForeignKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveForeignKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setDropIndex(value: Boolean): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
      
      inline def setDropIndexUndefined: Self = StObject.set(x, "dropIndex", js.undefined)
    }
  }
}
