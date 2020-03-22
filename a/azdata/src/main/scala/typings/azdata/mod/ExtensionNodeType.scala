package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionNodeType extends js.Object

@JSImport("azdata", "ExtensionNodeType")
@js.native
object ExtensionNodeType extends js.Object {
  @js.native
  sealed trait Database extends ExtensionNodeType
  
  @js.native
  sealed trait Server extends ExtensionNodeType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExtensionNodeType with String] = js.native
  /* "Database" */ @js.native
  object Database extends TopLevel[Database with String]
  
  /* "Server" */ @js.native
  object Server extends TopLevel[Server with String]
  
}

