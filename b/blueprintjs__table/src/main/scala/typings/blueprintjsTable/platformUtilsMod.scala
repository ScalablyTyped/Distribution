package typings.blueprintjsTable

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/common/internal/platformUtils", JSImport.Namespace)
@js.native
object platformUtilsMod extends js.Object {
  
  def isMac(): Boolean = js.native
  def isMac(platformOverride: String): Boolean = js.native
  
  def isModKeyPressed(event: KeyboardEvent): Boolean = js.native
  def isModKeyPressed(event: KeyboardEvent, platformOverride: String): Boolean = js.native
}
