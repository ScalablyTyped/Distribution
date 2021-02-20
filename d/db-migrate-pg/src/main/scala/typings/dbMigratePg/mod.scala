package typings.dbMigratePg

import typings.dbMigrateBase.mod.CallbackFunction
import typings.dbMigrateBase.mod.ColumnSpec
import typings.dbMigrateBase.mod.InternalOptions
import typings.dbMigrateBase.mod.^
import typings.pg.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("db-migrate-pg", "PgDriver")
  @js.native
  class PgDriver protected () extends ^ {
    def this(connection: Client, schema: String, intern: InternalOptions) = this()
    
    def createColumnConstraint(spec: ColumnSpec, options: ColumnConstraintOptions, tableName: String, columnName: String): ColumnConstraint = js.native
    
    def createDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions): Unit = js.native
    def createDatabase(dbName: String, optionsOrCb: CreateDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def createDatabaseAsync(dbName: String): typings.bluebird.mod.^[_] = js.native
    def createDatabaseAsync(dbName: String, options: CreateDatabaseOptions): typings.bluebird.mod.^[_] = js.native
    
    def createSequence(sqName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions): Unit = js.native
    def createSequence(sqName: String, optionsOrCb: CreateSequenceOptions, callback: CallbackFunction): Unit = js.native
    
    def createSequenceAsync(sqName: String): typings.bluebird.mod.^[_] = js.native
    def createSequenceAsync(sqName: String, options: CreateSequenceOptions): typings.bluebird.mod.^[_] = js.native
    
    def dropDatabase(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions): Unit = js.native
    def dropDatabase(dbName: String, optionsOrCb: DropDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def dropDatabaseAsync(dbName: String): typings.bluebird.mod.^[_] = js.native
    def dropDatabaseAsync(dbName: String, options: DropDatabaseOptions): typings.bluebird.mod.^[_] = js.native
    
    def dropSequence(dbName: String, optionsOrCb: CallbackFunction): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: CallbackFunction, callback: CallbackFunction): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions): Unit = js.native
    def dropSequence(dbName: String, optionsOrCb: DropSequenceOptions, callback: CallbackFunction): Unit = js.native
    
    def dropSequenceAsync(dbName: String): typings.bluebird.mod.^[_] = js.native
    def dropSequenceAsync(dbName: String, options: DropSequenceOptions): typings.bluebird.mod.^[_] = js.native
    
    def switchDatabase(options: String, callback: CallbackFunction): Unit = js.native
    def switchDatabase(options: SwitchDatabaseOptions, callback: CallbackFunction): Unit = js.native
    
    def switchDatabaseAsync(options: String): typings.bluebird.mod.^[_] = js.native
    def switchDatabaseAsync(options: SwitchDatabaseOptions): typings.bluebird.mod.^[_] = js.native
  }
  
  @js.native
  trait ColumnConstraint extends StObject {
    
    var constraints: String = js.native
    
    def foreignKey(callback: CallbackFunction): Unit = js.native
  }
  object ColumnConstraint {
    
    @scala.inline
    def apply(constraints: String, foreignKey: CallbackFunction => Unit): ColumnConstraint = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], foreignKey = js.Any.fromFunction1(foreignKey))
      __obj.asInstanceOf[ColumnConstraint]
    }
    
    @scala.inline
    implicit class ColumnConstraintMutableBuilder[Self <: ColumnConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeignKey(value: CallbackFunction => Unit): Self = StObject.set(x, "foreignKey", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ColumnConstraintOptions extends StObject {
    
    var emitPrimaryKey: js.UndefOr[Boolean] = js.native
  }
  object ColumnConstraintOptions {
    
    @scala.inline
    def apply(): ColumnConstraintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnConstraintOptions]
    }
    
    @scala.inline
    implicit class ColumnConstraintOptionsMutableBuilder[Self <: ColumnConstraintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmitPrimaryKey(value: Boolean): Self = StObject.set(x, "emitPrimaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitPrimaryKeyUndefined: Self = StObject.set(x, "emitPrimaryKey", js.undefined)
    }
  }
  
  @js.native
  trait CreateDatabaseOptions extends StObject
  
  @js.native
  trait CreateSequenceOptions extends StObject {
    
    var temp: js.UndefOr[Boolean] = js.native
  }
  object CreateSequenceOptions {
    
    @scala.inline
    def apply(): CreateSequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSequenceOptions]
    }
    
    @scala.inline
    implicit class CreateSequenceOptionsMutableBuilder[Self <: CreateSequenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemp(value: Boolean): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempUndefined: Self = StObject.set(x, "temp", js.undefined)
    }
  }
  
  @js.native
  trait DropDatabaseOptions extends StObject {
    
    var ifExists: js.UndefOr[Boolean] = js.native
  }
  object DropDatabaseOptions {
    
    @scala.inline
    def apply(): DropDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDatabaseOptions]
    }
    
    @scala.inline
    implicit class DropDatabaseOptionsMutableBuilder[Self <: DropDatabaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
    }
  }
  
  @js.native
  trait DropSequenceOptions extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.native
    
    var ifExists: js.UndefOr[Boolean] = js.native
    
    var restrict: js.UndefOr[Boolean] = js.native
  }
  object DropSequenceOptions {
    
    @scala.inline
    def apply(): DropSequenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropSequenceOptions]
    }
    
    @scala.inline
    implicit class DropSequenceOptionsMutableBuilder[Self <: DropSequenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setIfExists(value: Boolean): Self = StObject.set(x, "ifExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfExistsUndefined: Self = StObject.set(x, "ifExists", js.undefined)
      
      @scala.inline
      def setRestrict(value: Boolean): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictUndefined: Self = StObject.set(x, "restrict", js.undefined)
    }
  }
  
  @js.native
  trait SwitchDatabaseOptions extends StObject {
    
    var database: js.UndefOr[String] = js.native
  }
  object SwitchDatabaseOptions {
    
    @scala.inline
    def apply(): SwitchDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchDatabaseOptions]
    }
    
    @scala.inline
    implicit class SwitchDatabaseOptionsMutableBuilder[Self <: SwitchDatabaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
}
