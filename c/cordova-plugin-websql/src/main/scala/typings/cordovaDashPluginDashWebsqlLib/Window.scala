package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  /**
       * Creates (opens, if exist) database with supplied parameters.
       * @param  name        Database name
       * @param  version     Database version
       * @param  displayname Database display name
       * @param  size        Size, in bytes
       * @param  creationCallback Callback, that executed on database creation. Accepts Database object.
       */
  def openDatabase(
    name: java.lang.String,
    version: java.lang.String,
    displayname: java.lang.String,
    size: scala.Double
  ): Database = js.native
  /**
       * Creates (opens, if exist) database with supplied parameters.
       * @param  name        Database name
       * @param  version     Database version
       * @param  displayname Database display name
       * @param  size        Size, in bytes
       * @param  creationCallback Callback, that executed on database creation. Accepts Database object.
       */
  def openDatabase(
    name: java.lang.String,
    version: java.lang.String,
    displayname: java.lang.String,
    size: scala.Double,
    creationCallback: js.Function1[/* database */ Database, scala.Unit]
  ): Database = js.native
}

