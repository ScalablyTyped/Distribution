package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlbumsControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
}
object AlbumsControlOptions {
  
  @scala.inline
  def apply(): AlbumsControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlbumsControlOptions]
  }
  
  @scala.inline
  implicit class AlbumsControlOptionsMutableBuilder[Self <: AlbumsControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
