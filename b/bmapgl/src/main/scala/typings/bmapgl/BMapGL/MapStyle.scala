package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStyle extends StObject {
  
  var features: js.Array[_] = js.native
  
  var style: String = js.native
}
object MapStyle {
  
  @scala.inline
  def apply(features: js.Array[_], style: String): MapStyle = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyle]
  }
  
  @scala.inline
  implicit class MapStyleMutableBuilder[Self <: MapStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[_]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
