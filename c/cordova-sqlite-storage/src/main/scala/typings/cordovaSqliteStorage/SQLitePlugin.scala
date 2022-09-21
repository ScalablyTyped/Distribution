package typings.cordovaSqliteStorage

import org.scalablytyped.runtime.StringDictionary
import typings.cordovaSqliteStorage.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQLitePlugin {
  
  @js.native
  trait Database extends StObject {
    
    def close(): Unit = js.native
    def close(success: Unit, error: ErrorCallback): Unit = js.native
    def close(success: SuccessCallback): Unit = js.native
    def close(success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any]): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: Unit, error: ErrorCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: StatementSuccessCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: StatementSuccessCallback, error: ErrorCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: Unit, error: ErrorCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: StatementSuccessCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: StatementSuccessCallback, error: ErrorCallback): Unit = js.native
    
    def readTransaction(fn: TransactionFunction): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: Unit, success: SuccessCallback): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
    def readTransaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
    
    def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[Any]])]): Unit = js.native
    def sqlBatch(
      sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[Any]])],
      success: Unit,
      error: ErrorCallback
    ): Unit = js.native
    def sqlBatch(sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[Any]])], success: SuccessCallback): Unit = js.native
    def sqlBatch(
      sqlStatements: js.Array[String | (js.Tuple2[String, js.Array[Any]])],
      success: SuccessCallback,
      error: ErrorCallback
    ): Unit = js.native
    
    def transaction(fn: TransactionFunction): Unit = js.native
    def transaction(fn: TransactionFunction, error: Unit, success: SuccessCallback): Unit = js.native
    def transaction(fn: TransactionFunction, error: ErrorCallback): Unit = js.native
    def transaction(fn: TransactionFunction, error: ErrorCallback, success: SuccessCallback): Unit = js.native
  }
  
  type DatabaseSuccessCallback = js.Function1[/* db */ Database, Unit]
  
  trait DeleteArgs extends StObject {
    
    var iosDatabaseLocation: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object DeleteArgs {
    
    inline def apply(name: String): DeleteArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteArgs]
    }
    
    extension [Self <: DeleteArgs](x: Self) {
      
      inline def setIosDatabaseLocation(value: String): Self = StObject.set(x, "iosDatabaseLocation", value.asInstanceOf[js.Any])
      
      inline def setIosDatabaseLocationUndefined: Self = StObject.set(x, "iosDatabaseLocation", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  trait OpenArgs
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var androidDatabaseImplementation: js.UndefOr[Double] = js.undefined
    
    var androidLockWorkaround: js.UndefOr[Double] = js.undefined
    
    var createFromLocation: js.UndefOr[Double] = js.undefined
    
    var iosDatabaseLocation: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object OpenArgs {
    
    inline def apply(name: String): OpenArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenArgs]
    }
    
    extension [Self <: OpenArgs](x: Self) {
      
      inline def setAndroidDatabaseImplementation(value: Double): Self = StObject.set(x, "androidDatabaseImplementation", value.asInstanceOf[js.Any])
      
      inline def setAndroidDatabaseImplementationUndefined: Self = StObject.set(x, "androidDatabaseImplementation", js.undefined)
      
      inline def setAndroidLockWorkaround(value: Double): Self = StObject.set(x, "androidLockWorkaround", value.asInstanceOf[js.Any])
      
      inline def setAndroidLockWorkaroundUndefined: Self = StObject.set(x, "androidLockWorkaround", js.undefined)
      
      inline def setCreateFromLocation(value: Double): Self = StObject.set(x, "createFromLocation", value.asInstanceOf[js.Any])
      
      inline def setCreateFromLocationUndefined: Self = StObject.set(x, "createFromLocation", js.undefined)
      
      inline def setIosDatabaseLocation(value: String): Self = StObject.set(x, "iosDatabaseLocation", value.asInstanceOf[js.Any])
      
      inline def setIosDatabaseLocationUndefined: Self = StObject.set(x, "iosDatabaseLocation", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var insertId: js.UndefOr[Double] = js.undefined
    
    var rows: Item
    
    var rowsAffected: Double
  }
  object Results {
    
    inline def apply(rows: Item, rowsAffected: Double): Results = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
      
      inline def setRows(value: Item): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLite extends StObject {
    
    def deleteDatabase(args: DeleteArgs): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: Unit, error: ErrorCallback): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: SuccessCallback): Unit = js.native
    def deleteDatabase(args: DeleteArgs, success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    def echoTest(): Unit = js.native
    def echoTest(ok: js.Function1[/* value */ String, Unit]): Unit = js.native
    def echoTest(ok: js.Function1[/* value */ String, Unit], error: js.Function1[/* msg */ String, Unit]): Unit = js.native
    def echoTest(ok: Unit, error: js.Function1[/* msg */ String, Unit]): Unit = js.native
    
    def openDatabase(args: OpenArgs): Database = js.native
    def openDatabase(args: OpenArgs, success: Unit, error: ErrorCallback): Database = js.native
    def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback): Database = js.native
    def openDatabase(args: OpenArgs, success: DatabaseSuccessCallback, error: ErrorCallback): Database = js.native
    
    def selfTest(): Unit = js.native
    def selfTest(success: Unit, error: ErrorCallback): Unit = js.native
    def selfTest(success: SuccessCallback): Unit = js.native
    def selfTest(success: SuccessCallback, error: ErrorCallback): Unit = js.native
  }
  
  type StatementSuccessCallback = js.Function1[/* results */ Results, Unit]
  
  type SuccessCallback = js.Function0[Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any]): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: Unit, error: TransactionStatementErrorCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: TransactionStatementSuccessCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.Array[Any],
      success: TransactionStatementSuccessCallback,
      error: TransactionStatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: Unit, success: Unit, error: TransactionStatementErrorCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: TransactionStatementSuccessCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: Unit,
      success: TransactionStatementSuccessCallback,
      error: TransactionStatementErrorCallback
    ): Unit = js.native
  }
  
  type TransactionFunction = js.Function1[/* tx */ Transaction, Unit]
  
  type TransactionStatementErrorCallback = js.Function2[/* tx */ Transaction, /* err */ js.Error, Boolean | Unit]
  
  type TransactionStatementSuccessCallback = js.Function2[/* tx */ Transaction, /* results */ Results, Unit]
}
