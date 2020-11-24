package typings.cesium.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BaseLayerPicker")
@js.native
class BaseLayerPicker protected () extends js.Object {
  def this(container: Element, options: typings.cesium.anon.Globe) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: BaseLayerPickerViewModel = js.native
}
