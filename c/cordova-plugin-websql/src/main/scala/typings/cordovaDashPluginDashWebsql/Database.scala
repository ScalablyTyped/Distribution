package typings.cordovaDashPluginDashWebsql

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var displayName: String = js.native
  var name: String = js.native
  var size: Double = js.native
  var version: String = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def readTransaction(callback: js.Function1[/* transaction */ SqlTransaction, Unit]): Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit]
  ): Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def transaction(callback: js.Function1[/* transaction */ SqlTransaction, Unit]): Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit]
  ): Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
}

@JSGlobal("Database")
@js.native
class DatabaseCls protected () extends Database {
  /** Constructor for Database object */
  def this(
    name: String,
    version: String,
    displayname: String,
    size: Double,
    creationCallback: js.Function1[/* database */ Database, Unit]
  ) = this()
}

@JSGlobal("Database")
@js.native
object Database
  extends /** Constructor for Database object */
Instantiable5[
      /* name */ String, 
      /* version */ String, 
      /* displayname */ String, 
      /* size */ Double, 
      /* creationCallback */ js.Function1[/* database */ Database, Unit], 
      Database
    ]

