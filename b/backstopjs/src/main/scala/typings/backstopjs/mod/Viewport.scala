package typings.backstopjs.mod

import typings.backstopjs.backstopjsStrings.desktop
import typings.backstopjs.backstopjsStrings.phone
import typings.backstopjs.backstopjsStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.backstopjs.mod.ViewportNext
  - typings.backstopjs.mod.ViewportLegacy
*/
trait Viewport extends js.Object
object Viewport {
  
  @scala.inline
  def ViewportNext(height: Double, label: String, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  def ViewportLegacy(height: Double, name: phone | tablet | desktop, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}
