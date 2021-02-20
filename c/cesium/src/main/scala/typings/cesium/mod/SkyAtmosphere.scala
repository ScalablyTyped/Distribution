package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SkyAtmosphere")
@js.native
class SkyAtmosphere () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  var brightnessShift: Double = js.native
  
  def destroy(): Unit = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  var hueShift: Double = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var saturationShift: Double = js.native
  
  var show: Boolean = js.native
}
