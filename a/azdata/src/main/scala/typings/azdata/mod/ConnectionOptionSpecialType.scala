package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionOptionSpecialType extends js.Object

@JSImport("azdata", "ConnectionOptionSpecialType")
@js.native
object ConnectionOptionSpecialType extends js.Object {
  @js.native
  sealed trait appName extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait authType extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait connectionName extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait databaseName extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait password extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait serverName extends ConnectionOptionSpecialType
  
  @js.native
  sealed trait userName extends ConnectionOptionSpecialType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConnectionOptionSpecialType with String] = js.native
  /* "appName" */ @js.native
  object appName extends TopLevel[appName with String]
  
  /* "authType" */ @js.native
  object authType extends TopLevel[authType with String]
  
  /* "connectionName" */ @js.native
  object connectionName extends TopLevel[connectionName with String]
  
  /* "databaseName" */ @js.native
  object databaseName extends TopLevel[databaseName with String]
  
  /* "password" */ @js.native
  object password extends TopLevel[password with String]
  
  /* "serverName" */ @js.native
  object serverName extends TopLevel[serverName with String]
  
  /* "userName" */ @js.native
  object userName extends TopLevel[userName with String]
  
}

