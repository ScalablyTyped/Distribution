package typings.cssSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledQuery[ElementNode] extends js.Object {
  
  def apply(node: ElementNode): Boolean = js.native
  
  var shouldTestNextSiblings: js.UndefOr[Boolean] = js.native
}
