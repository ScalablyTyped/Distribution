package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyle extends StObject {
  
  var features: js.Array[js.Any]
  
  var style: String
}
object MapStyle {
  
  inline def apply(features: js.Array[js.Any], style: String): MapStyle = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyle]
  }
  
  extension [Self <: MapStyle](x: Self) {
    
    inline def setFeatures(value: js.Array[js.Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
