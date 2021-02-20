package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionNodeType extends StObject
@JSImport("azdata", "ExtensionNodeType")
@js.native
object ExtensionNodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExtensionNodeType with String] = js.native
  
  @js.native
  sealed trait Database extends ExtensionNodeType
  /* "Database" */ val Database: typings.azdata.mod.ExtensionNodeType.Database with String = js.native
  
  @js.native
  sealed trait Server extends ExtensionNodeType
  /* "Server" */ val Server: typings.azdata.mod.ExtensionNodeType.Server with String = js.native
}
