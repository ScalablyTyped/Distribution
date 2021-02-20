package typings.cesium.mod

import typings.cesium.anon.Attenuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointCloudShading")
@js.native
class PointCloudShading () extends StObject {
  def this(option: Attenuation) = this()
  
  var attenuation: Boolean = js.native
  
  var backFaceCulling: Boolean = js.native
  
  var baseResolution: Double = js.native
  
  var eyeDomeLighting: Double = js.native
  
  var eyeDomeLightingRadius: Double = js.native
  
  var eyeDomeLightingStrenght: Double = js.native
  
  var geometricErrorScale: Double = js.native
  
  var maximumAttenuation: Double = js.native
  
  var normalShading: Boolean = js.native
}
/* static members */
object PointCloudShading {
  
  @JSImport("cesium", "PointCloudShading.isSupported")
  @js.native
  def isSupported(scene: Scene): Boolean = js.native
}
