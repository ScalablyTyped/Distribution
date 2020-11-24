package typings.cesium.mod

import typings.std.Element
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "InfoBox")
@js.native
class InfoBox protected () extends js.Object {
  def this(container: String) = this()
  def this(container: Element) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  var frame: HTMLIFrameElement = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: InfoBoxViewModel = js.native
}
