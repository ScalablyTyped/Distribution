package typings.cesium.anon

import typings.cesium.mod.createElevationBandMaterialBand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layers extends StObject {
  
  var layers: js.Array[createElevationBandMaterialBand]
  
  var scene: typings.cesium.mod.Scene
}
object Layers {
  
  inline def apply(layers: js.Array[createElevationBandMaterialBand], scene: typings.cesium.mod.Scene): Layers = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layers] (val x: Self) extends AnyVal {
    
    inline def setLayers(value: js.Array[createElevationBandMaterialBand]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: createElevationBandMaterialBand*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
