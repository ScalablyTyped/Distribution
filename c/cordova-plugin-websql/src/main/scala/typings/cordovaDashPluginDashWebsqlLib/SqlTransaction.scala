package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlTransaction extends js.Object {
  /**
       * Executes SQL statement via current transaction.
       * @param sql SQL statement to execute.
       * @param arguments SQL stetement arguments.
       * @param successCallback Called in case of query has been successfully done.
       * @param errorCallback   Called, when query fails. Return false to continue transaction; true or no return to rollback.
       */
  def executeSql(sql: java.lang.String): scala.Unit = js.native
  /**
       * Executes SQL statement via current transaction.
       * @param sql SQL statement to execute.
       * @param arguments SQL stetement arguments.
       * @param successCallback Called in case of query has been successfully done.
       * @param errorCallback   Called, when query fails. Return false to continue transaction; true or no return to rollback.
       */
  def executeSql(sql: java.lang.String, arguments: js.Array[_]): scala.Unit = js.native
  /**
       * Executes SQL statement via current transaction.
       * @param sql SQL statement to execute.
       * @param arguments SQL stetement arguments.
       * @param successCallback Called in case of query has been successfully done.
       * @param errorCallback   Called, when query fails. Return false to continue transaction; true or no return to rollback.
       */
  def executeSql(
    sql: java.lang.String,
    arguments: js.Array[_],
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Executes SQL statement via current transaction.
       * @param sql SQL statement to execute.
       * @param arguments SQL stetement arguments.
       * @param successCallback Called in case of query has been successfully done.
       * @param errorCallback   Called, when query fails. Return false to continue transaction; true or no return to rollback.
       */
  def executeSql(
    sql: java.lang.String,
    arguments: js.Array[_],
    successCallback: js.Function2[/* transaction */ this.type, /* resultSet */ SqlResultSet, scala.Unit],
    errorCallback: js.Function2[/* transaction */ this.type, /* error */ SqlError, _]
  ): scala.Unit = js.native
}

@JSGlobal("SqlTransaction")
@js.native
object SqlTransaction
  extends org.scalablytyped.runtime.Instantiable0[SqlTransaction]

