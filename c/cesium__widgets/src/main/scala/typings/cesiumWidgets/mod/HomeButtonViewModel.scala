package typings.cesiumWidgets.mod

import typings.cesiumEngine.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/widgets", "HomeButtonViewModel")
@js.native
open class HomeButtonViewModel protected () extends StObject {
  def this(scene: Scene) = this()
  def this(scene: Scene, duration: Double) = this()
  
  /**
    * Gets the Command that is executed when the button is clicked.
    */
  var command: Command = js.native
  
  /**
    * Gets or sets the the duration of the camera flight in seconds.
    * A value of zero causes the camera to instantly switch to home view.
    * The duration will be computed based on the distance when undefined.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Gets the scene to control.
    */
  var scene: Scene = js.native
  
  /**
    * Gets or sets the tooltip.  This property is observable.
    */
  var tooltip: String = js.native
}
