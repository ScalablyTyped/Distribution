package typings.cesium.mod

import typings.cesium.anon.Toggled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ToggleButtonViewModel")
@js.native
open class ToggleButtonViewModel protected () extends StObject {
  def this(command: Command) = this()
  def this(command: Command, options: Toggled) = this()
  
  /**
    * Gets the command which will be executed when the button is toggled.
    */
  var command: Command = js.native
  
  /**
    * Gets or sets whether the button is currently toggled.  This property is observable.
    */
  var toggled: Boolean = js.native
  
  /**
    * Gets or sets the button's tooltip.  This property is observable.
    */
  var tooltip: String = js.native
}
