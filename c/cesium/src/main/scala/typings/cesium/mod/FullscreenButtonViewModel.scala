package typings.cesium.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "FullscreenButtonViewModel")
@js.native
class FullscreenButtonViewModel () extends StObject {
  def this(fullscreenElement: String) = this()
  def this(fullscreenElement: Element) = this()
  
  var command: Command = js.native
  
  def destroy(): Unit = js.native
  
  var fullscreenElement: Element = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var isFullscreen: Boolean = js.native
  
  var isFullscreenEnabled: Boolean = js.native
  
  var tooltip: String = js.native
}
