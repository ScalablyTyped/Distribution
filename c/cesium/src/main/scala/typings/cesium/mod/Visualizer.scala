package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Visualizer")
@js.native
abstract class Visualizer () extends js.Object {
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def update(time: JulianDate): Boolean = js.native
}
