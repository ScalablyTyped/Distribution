package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionOptionSpecialType extends StObject
@JSImport("azdata", "ConnectionOptionSpecialType")
@js.native
object ConnectionOptionSpecialType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionOptionSpecialType & String] = js.native
  
  @js.native
  sealed trait appName
    extends StObject
       with ConnectionOptionSpecialType
  /* "appName" */ val appName: typings.azdata.mod.ConnectionOptionSpecialType.appName & String = js.native
  
  @js.native
  sealed trait authType
    extends StObject
       with ConnectionOptionSpecialType
  /* "authType" */ val authType: typings.azdata.mod.ConnectionOptionSpecialType.authType & String = js.native
  
  @js.native
  sealed trait connectionName
    extends StObject
       with ConnectionOptionSpecialType
  /* "connectionName" */ val connectionName: typings.azdata.mod.ConnectionOptionSpecialType.connectionName & String = js.native
  
  @js.native
  sealed trait databaseName
    extends StObject
       with ConnectionOptionSpecialType
  /* "databaseName" */ val databaseName: typings.azdata.mod.ConnectionOptionSpecialType.databaseName & String = js.native
  
  @js.native
  sealed trait password
    extends StObject
       with ConnectionOptionSpecialType
  /* "password" */ val password: typings.azdata.mod.ConnectionOptionSpecialType.password & String = js.native
  
  @js.native
  sealed trait serverName
    extends StObject
       with ConnectionOptionSpecialType
  /* "serverName" */ val serverName: typings.azdata.mod.ConnectionOptionSpecialType.serverName & String = js.native
  
  @js.native
  sealed trait userName
    extends StObject
       with ConnectionOptionSpecialType
  /* "userName" */ val userName: typings.azdata.mod.ConnectionOptionSpecialType.userName & String = js.native
}
