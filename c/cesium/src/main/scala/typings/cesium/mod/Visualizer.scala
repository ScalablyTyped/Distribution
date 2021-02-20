package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Visualizer")
@js.native
abstract class Visualizer () extends StObject {
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def update(time: JulianDate): Boolean = js.native
}
