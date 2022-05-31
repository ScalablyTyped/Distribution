package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Convert extends StObject {
  
  var convert: js.UndefOr[Boolean] = js.undefined
  
  var destination: js.UndefOr[Cartesian3 | typings.cesium.mod.Rectangle] = js.undefined
  
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  
  var orientation: js.UndefOr[Up | Heading] = js.undefined
}
object Convert {
  
  inline def apply(): Convert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Convert]
  }
  
  extension [Self <: Convert](x: Self) {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDestination(value: Cartesian3 | typings.cesium.mod.Rectangle): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEndTransform(value: Matrix4): Self = StObject.set(x, "endTransform", value.asInstanceOf[js.Any])
    
    inline def setEndTransformUndefined: Self = StObject.set(x, "endTransform", js.undefined)
    
    inline def setOrientation(value: Up | Heading): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
