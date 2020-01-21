package typings.dbMigratePg.mod

import typings.bluebird.mod.^
import typings.dbMigrateBase.mod.Base
import typings.dbMigrateBase.mod.CallbackFunction
import typings.dbMigrateBase.mod.ColumnSpec
import typings.dbMigrateBase.mod.InternalOptions
import typings.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("db-migrate-pg", "PgDriver")
@js.native
class PgDriver protected () extends Base {
  def this(connection: Client, schema: String, intern: InternalOptions) = this()
  def createColumnConstraint(spec: ColumnSpec, options: ColumnConstraintOptions, tableName: String, columnName: String): ColumnConstraint = js.native
  def createDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions): Unit = js.native
  def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions, callback: CallbackFunction): Unit = js.native
  def createDatabaseAsync(dbName: String): ^[_] = js.native
  def createDatabaseAsync(dbName: String, options: CreateDatabaseOptions): ^[_] = js.native
  def createSequence(sqName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions): Unit = js.native
  def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions, callback: CallbackFunction): Unit = js.native
  def createSequenceAsync(sqName: String): ^[_] = js.native
  def createSequenceAsync(sqName: String, options: CreateSequenceOptions): ^[_] = js.native
  def dropDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions): Unit = js.native
  def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions, callback: CallbackFunction): Unit = js.native
  def dropDatabaseAsync(dbName: String): ^[_] = js.native
  def dropDatabaseAsync(dbName: String, options: DropDatabaseOptions): ^[_] = js.native
  def dropSequence(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions): Unit = js.native
  def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions, callback: CallbackFunction): Unit = js.native
  def dropSequenceAsync(dbName: String): ^[_] = js.native
  def dropSequenceAsync(dbName: String, options: DropSequenceOptions): ^[_] = js.native
  def switchDatabase(options: String, callback: CallbackFunction): Unit = js.native
  def switchDatabase(options: SwitchDatabaseOptions, callback: CallbackFunction): Unit = js.native
  def switchDatabaseAsync(options: String): ^[_] = js.native
  def switchDatabaseAsync(options: SwitchDatabaseOptions): ^[_] = js.native
}

