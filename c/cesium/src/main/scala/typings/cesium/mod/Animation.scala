package typings.cesium.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Animation")
@js.native
class Animation protected () extends js.Object {
  def this(container: String, viewModel: AnimationViewModel) = this()
  def this(container: Element, viewModel: AnimationViewModel) = this()
  
  def applyThemeChanges(): Unit = js.native
  
  val container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def resize(): Unit = js.native
  
  val viewModel: AnimationViewModel = js.native
}
