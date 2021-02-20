package typings.cesium.mod

import typings.cesium.anon.Toggled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ToggleButtonViewModel")
@js.native
class ToggleButtonViewModel protected () extends StObject {
  def this(command: Command) = this()
  def this(command: Command, options: Toggled) = this()
  
  var command: Command = js.native
  
  var toggled: Boolean = js.native
  
  var tooltip: String = js.native
}
