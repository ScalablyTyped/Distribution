package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleItemStylers
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[String]] {
  
  var color: js.UndefOr[String] = js.undefined
  
  var curZoomRegion: js.UndefOr[String] = js.undefined
  
  var curZoomRegionId: js.UndefOr[String] = js.undefined
  
  var fontsize: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
}
object MapStyleItemStylers {
  
  @scala.inline
  def apply(): MapStyleItemStylers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStyleItemStylers]
  }
  
  @scala.inline
  implicit class MapStyleItemStylersMutableBuilder[Self <: MapStyleItemStylers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCurZoomRegion(value: String): Self = StObject.set(x, "curZoomRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurZoomRegionId(value: String): Self = StObject.set(x, "curZoomRegionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurZoomRegionIdUndefined: Self = StObject.set(x, "curZoomRegionId", js.undefined)
    
    @scala.inline
    def setCurZoomRegionUndefined: Self = StObject.set(x, "curZoomRegion", js.undefined)
    
    @scala.inline
    def setFontsize(value: String): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
