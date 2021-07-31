package typings.cesium.mod

import typings.cesium.anon.Articulations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ModelGraphics")
@js.native
class ModelGraphics () extends StObject {
  def this(options: Articulations) = this()
  
  var articulations: PropertyBag = js.native
  
  var clampAnimations: Property | Boolean = js.native
  
  var clippingPlanes: Property | ClippingPlaneCollection = js.native
  
  def clone(result: ModelGraphics): ModelGraphics = js.native
  
  var color: Property | Color = js.native
  
  var colorBlendAmount: Property | Double = js.native
  
  var colorBlendMode: Property | ColorBlendMode = js.native
  
  val definitionChanged: Event[js.Array[js.Any]] = js.native
  
  var distanceDisplayCondition: Property | DistanceDisplayCondition = js.native
  
  var heightReference: Property | HeightReference = js.native
  
  var imageBasedLightingFactor: Property | Cartesian2 = js.native
  
  var incrementallyLoadTextures: Property | Boolean = js.native
  
  var lightColor: Property | Cartesian3 = js.native
  
  var maximumScale: Property | Double = js.native
  
  def merge(source: ModelGraphics): ModelGraphics = js.native
  
  var minimumPixelSize: Property | Double = js.native
  
  var nodeTransformations: PropertyBag = js.native
  
  var runAnimations: Property | Boolean = js.native
  
  var scale: Property | Double = js.native
  
  var shadows: Property | ShadowMode = js.native
  
  var show: Property | Boolean = js.native
  
  var silhouetteColor: Property | Color = js.native
  
  var silhouetteSize: Property | Double = js.native
  
  var uri: Property | String = js.native
}
