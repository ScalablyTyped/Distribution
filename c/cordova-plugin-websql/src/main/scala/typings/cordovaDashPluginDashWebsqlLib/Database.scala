package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var displayName: java.lang.String = js.native
  var name: java.lang.String = js.native
  var size: scala.Double = js.native
  var version: java.lang.String = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def readTransaction(callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit]): scala.Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit],
    errorCallback: js.Function1[/* error */ SqlError, scala.Unit]
  ): scala.Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit],
    errorCallback: js.Function1[/* error */ SqlError, scala.Unit],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def transaction(callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit]): scala.Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit],
    errorCallback: js.Function1[/* error */ SqlError, scala.Unit]
  ): scala.Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, scala.Unit],
    errorCallback: js.Function1[/* error */ SqlError, scala.Unit],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

@JSGlobal("Database")
@js.native
class DatabaseCls protected () extends Database {
  /** Constructor for Database object */
  def this(name: java.lang.String, version: java.lang.String, displayname: java.lang.String, size: scala.Double, creationCallback: js.Function1[/* database */ Database, scala.Unit]) = this()
}

@JSGlobal("Database")
@js.native
object Database
  extends /** Constructor for Database object */
org.scalablytyped.runtime.Instantiable5[
      /* name */ java.lang.String, 
      /* version */ java.lang.String, 
      /* displayname */ java.lang.String, 
      /* size */ scala.Double, 
      /* creationCallback */ js.Function1[/* database */ Database, scala.Unit], 
      Database
    ]

