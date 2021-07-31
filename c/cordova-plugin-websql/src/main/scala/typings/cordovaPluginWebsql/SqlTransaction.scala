package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlTransaction extends StObject {
  
  /**
    * Executes SQL statement via current transaction.
    * @param sql SQL statement to execute.
    * @param arguments SQL stetement arguments.
    * @param successCallback Called in case of query has been successfully done.
    * @param errorCallback   Called, when query fails. Return false to continue transaction; true or no return to rollback.
    */
  def executeSql(sql: String): Unit = js.native
  def executeSql(sql: String, arguments: js.Array[js.Any]): Unit = js.native
  def executeSql(
    sql: String,
    arguments: js.Array[js.Any],
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, Unit]
  ): Unit = js.native
  def executeSql(
    sql: String,
    arguments: js.Array[js.Any],
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, Unit],
    errorCallback: js.Function2[/* transaction */ this.type, /* error */ SqlError, js.Any]
  ): Unit = js.native
  def executeSql(
    sql: String,
    arguments: js.Array[js.Any],
    successCallback: Unit,
    errorCallback: js.Function2[/* transaction */ this.type, /* error */ SqlError, js.Any]
  ): Unit = js.native
  def executeSql(
    sql: String,
    arguments: Unit,
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, Unit]
  ): Unit = js.native
  def executeSql(
    sql: String,
    arguments: Unit,
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, Unit],
    errorCallback: js.Function2[/* transaction */ this.type, /* error */ SqlError, js.Any]
  ): Unit = js.native
  def executeSql(
    sql: String,
    arguments: Unit,
    successCallback: Unit,
    errorCallback: js.Function2[/* transaction */ this.type, /* error */ SqlError, js.Any]
  ): Unit = js.native
}
