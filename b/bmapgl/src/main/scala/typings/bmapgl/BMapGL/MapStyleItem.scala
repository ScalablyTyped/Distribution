package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleItem extends StObject {
  
  var elementType: js.UndefOr[String] = js.undefined
  
  var featureType: js.UndefOr[String] = js.undefined
  
  var stylers: MapStyleItemStylers
}
object MapStyleItem {
  
  @scala.inline
  def apply(stylers: MapStyleItemStylers): MapStyleItem = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleItem]
  }
  
  @scala.inline
  implicit class MapStyleItemMutableBuilder[Self <: MapStyleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
    
    @scala.inline
    def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    @scala.inline
    def setStylers(value: MapStyleItemStylers): Self = StObject.set(x, "stylers", value.asInstanceOf[js.Any])
  }
}
