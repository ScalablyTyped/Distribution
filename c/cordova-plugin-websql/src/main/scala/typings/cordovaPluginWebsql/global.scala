package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Database protected ()
    extends typings.cordovaPluginWebsql.Database {
    /** Constructor for Database object */
    def this(
      name: String,
      version: String,
      displayname: String,
      size: Double,
      creationCallback: js.Function1[/* database */ typings.cordovaPluginWebsql.Database, Unit]
    ) = this()
  }
  @js.native
  object Database
    extends /** Constructor for Database object */
  Instantiable5[
          /* name */ String, 
          /* version */ String, 
          /* displayname */ String, 
          /* size */ Double, 
          /* creationCallback */ js.Function1[/* database */ typings.cordovaPluginWebsql.Database, Unit], 
          typings.cordovaPluginWebsql.Database
        ]
  
  @js.native
  object SqlError extends js.Object {
    
    var CONSTRAINT_ERR: Double = js.native
    
    var DATABASE_ERR: Double = js.native
    
    var QUOTA_ERR: Double = js.native
    
    var SYNTAX_ERR: Double = js.native
    
    var TIMEOUT_ERR: Double = js.native
    
    var TOO_LARGE_ERR: Double = js.native
    
    // Error code constants from http://www.w3.org/TR/webdatabase/#sqlerror
    var UNKNOWN_ERR: Double = js.native
    
    var VERSION_ERR: Double = js.native
  }
  
  @js.native
  class SqlTransaction ()
    extends typings.cordovaPluginWebsql.SqlTransaction
  @js.native
  object SqlTransaction
    extends Instantiable0[typings.cordovaPluginWebsql.SqlTransaction]
}
