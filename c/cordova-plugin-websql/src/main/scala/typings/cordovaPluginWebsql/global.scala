package typings.cordovaPluginWebsql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Database")
  @js.native
  class Database protected ()
    extends StObject
       with typings.cordovaPluginWebsql.Database {
    /** Constructor for Database object */
    def this(
      name: String,
      version: String,
      displayname: String,
      size: Double,
      creationCallback: js.Function1[/* database */ typings.cordovaPluginWebsql.Database, Unit]
    ) = this()
  }
  
  object SqlError {
    
    @JSGlobal("SqlError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SqlError.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    @scala.inline
    def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    @scala.inline
    def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    @scala.inline
    def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    @scala.inline
    def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    @scala.inline
    def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    // Error code constants from http://www.w3.org/TR/webdatabase/#sqlerror
    @JSGlobal("SqlError.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    @scala.inline
    def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SqlError.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    @scala.inline
    def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SqlTransaction")
  @js.native
  class SqlTransaction ()
    extends StObject
       with typings.cordovaPluginWebsql.SqlTransaction
}
