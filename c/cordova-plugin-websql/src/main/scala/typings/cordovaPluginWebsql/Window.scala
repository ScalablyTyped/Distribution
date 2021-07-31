package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  /**
    * Creates (opens, if exist) database with supplied parameters.
    * @param  name        Database name
    * @param  version     Database version
    * @param  displayname Database display name
    * @param  size        Size, in bytes
    * @param  creationCallback Callback, that executed on database creation. Accepts Database object.
    */
  def openDatabase(name: String, version: String, displayname: String, size: Double): Database = js.native
  def openDatabase(
    name: String,
    version: String,
    displayname: String,
    size: Double,
    creationCallback: js.Function1[/* database */ Database, Unit]
  ): Database = js.native
}
