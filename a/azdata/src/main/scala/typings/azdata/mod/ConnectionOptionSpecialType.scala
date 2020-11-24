package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionOptionSpecialType extends js.Object
@JSImport("azdata", "ConnectionOptionSpecialType")
@js.native
object ConnectionOptionSpecialType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionOptionSpecialType with String] = js.native
  
  @js.native
  sealed trait appName extends ConnectionOptionSpecialType
  /* "appName" */ @js.native
  object appName extends TopLevel[appName with String]
  
  @js.native
  sealed trait authType extends ConnectionOptionSpecialType
  /* "authType" */ @js.native
  object authType extends TopLevel[authType with String]
  
  @js.native
  sealed trait connectionName extends ConnectionOptionSpecialType
  /* "connectionName" */ @js.native
  object connectionName extends TopLevel[connectionName with String]
  
  @js.native
  sealed trait databaseName extends ConnectionOptionSpecialType
  /* "databaseName" */ @js.native
  object databaseName extends TopLevel[databaseName with String]
  
  @js.native
  sealed trait password extends ConnectionOptionSpecialType
  /* "password" */ @js.native
  object password extends TopLevel[password with String]
  
  @js.native
  sealed trait serverName extends ConnectionOptionSpecialType
  /* "serverName" */ @js.native
  object serverName extends TopLevel[serverName with String]
  
  @js.native
  sealed trait userName extends ConnectionOptionSpecialType
  /* "userName" */ @js.native
  object userName extends TopLevel[userName with String]
}
