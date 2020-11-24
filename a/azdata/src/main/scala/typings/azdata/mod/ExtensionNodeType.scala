package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionNodeType extends js.Object
@JSImport("azdata", "ExtensionNodeType")
@js.native
object ExtensionNodeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExtensionNodeType with String] = js.native
  
  @js.native
  sealed trait Database extends ExtensionNodeType
  /* "Database" */ @js.native
  object Database extends TopLevel[Database with String]
  
  @js.native
  sealed trait Server extends ExtensionNodeType
  /* "Server" */ @js.native
  object Server extends TopLevel[Server with String]
}
