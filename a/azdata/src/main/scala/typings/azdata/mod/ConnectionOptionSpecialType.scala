package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionOptionSpecialType extends StObject
@JSImport("azdata", "ConnectionOptionSpecialType")
@js.native
object ConnectionOptionSpecialType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionOptionSpecialType with String] = js.native
  
  @js.native
  sealed trait appName extends ConnectionOptionSpecialType
  /* "appName" */ val appName: typings.azdata.mod.ConnectionOptionSpecialType.appName with String = js.native
  
  @js.native
  sealed trait authType extends ConnectionOptionSpecialType
  /* "authType" */ val authType: typings.azdata.mod.ConnectionOptionSpecialType.authType with String = js.native
  
  @js.native
  sealed trait connectionName extends ConnectionOptionSpecialType
  /* "connectionName" */ val connectionName: typings.azdata.mod.ConnectionOptionSpecialType.connectionName with String = js.native
  
  @js.native
  sealed trait databaseName extends ConnectionOptionSpecialType
  /* "databaseName" */ val databaseName: typings.azdata.mod.ConnectionOptionSpecialType.databaseName with String = js.native
  
  @js.native
  sealed trait password extends ConnectionOptionSpecialType
  /* "password" */ val password: typings.azdata.mod.ConnectionOptionSpecialType.password with String = js.native
  
  @js.native
  sealed trait serverName extends ConnectionOptionSpecialType
  /* "serverName" */ val serverName: typings.azdata.mod.ConnectionOptionSpecialType.serverName with String = js.native
  
  @js.native
  sealed trait userName extends ConnectionOptionSpecialType
  /* "userName" */ val userName: typings.azdata.mod.ConnectionOptionSpecialType.userName with String = js.native
}
