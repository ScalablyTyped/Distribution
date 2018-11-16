package typings
package dbDashMigrateDashPgLib.dbDashMigrateDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("db-migrate-pg", "PgDriver")
@js.native
class PgDriver protected ()
  extends dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.Base {
  def this(connection: pgLib.pgMod.Client, schema: java.lang.String, intern: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.InternalOptions) = this()
  def createColumnConstraint(
    spec: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.ColumnSpec,
    options: ColumnConstraintOptions,
    tableName: java.lang.String,
    columnName: java.lang.String
  ): ColumnConstraint = js.native
  def createDatabase(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createDatabase(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createDatabase(dbName: java.lang.String, optionsOrCb: CreateDatabaseOptions): scala.Unit = js.native
  def createDatabase(
    dbName: java.lang.String,
    optionsOrCb: CreateDatabaseOptions,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createDatabaseAsync(dbName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createDatabaseAsync(dbName: java.lang.String, options: CreateDatabaseOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createSequence(
    sqName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createSequence(
    sqName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createSequence(sqName: java.lang.String, optionsOrCb: CreateSequenceOptions): scala.Unit = js.native
  def createSequence(
    sqName: java.lang.String,
    optionsOrCb: CreateSequenceOptions,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def createSequenceAsync(sqName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createSequenceAsync(sqName: java.lang.String, options: CreateSequenceOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropDatabase(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropDatabase(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropDatabase(dbName: java.lang.String, optionsOrCb: DropDatabaseOptions): scala.Unit = js.native
  def dropDatabase(
    dbName: java.lang.String,
    optionsOrCb: DropDatabaseOptions,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropDatabaseAsync(dbName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropDatabaseAsync(dbName: java.lang.String, options: DropDatabaseOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropSequence(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropSequence(
    dbName: java.lang.String,
    optionsOrCb: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropSequence(dbName: java.lang.String, optionsOrCb: DropSequenceOptions): scala.Unit = js.native
  def dropSequence(
    dbName: java.lang.String,
    optionsOrCb: DropSequenceOptions,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def dropSequenceAsync(dbName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dropSequenceAsync(dbName: java.lang.String, options: DropSequenceOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def switchDatabase(
    options: SwitchDatabaseOptions,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def switchDatabase(
    options: java.lang.String,
    callback: dbDashMigrateDashBaseLib.dbDashMigrateDashBaseMod.CallbackFunction
  ): scala.Unit = js.native
  def switchDatabaseAsync(options: SwitchDatabaseOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def switchDatabaseAsync(options: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

