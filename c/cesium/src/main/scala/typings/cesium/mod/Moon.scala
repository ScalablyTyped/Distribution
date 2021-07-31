package typings.cesium.mod

import typings.cesium.anon.OnlySunLighting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Moon")
@js.native
class Moon () extends StObject {
  def this(options: OnlySunLighting) = this()
  
  def destroy(): Unit = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var onlySunLighting: Boolean = js.native
  
  var show: Boolean = js.native
  
  var textureUrl: String = js.native
}
