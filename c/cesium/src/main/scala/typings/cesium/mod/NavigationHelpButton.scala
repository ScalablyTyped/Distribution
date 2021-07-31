package typings.cesium.mod

import typings.cesium.anon.InstructionsInitiallyVisible
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "NavigationHelpButton")
@js.native
class NavigationHelpButton protected () extends StObject {
  def this(options: InstructionsInitiallyVisible) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: NavigationHelpButtonViewModel = js.native
}
