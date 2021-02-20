package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconOptions extends StObject {
  
  var anchor: js.UndefOr[Size] = js.native
  
  var imageOffset: js.UndefOr[Size] = js.native
  
  var imageSize: js.UndefOr[Size] = js.native
  
  var infoWindowAnchor: js.UndefOr[Size] = js.native
  
  var printImageUrl: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[js.Object] = js.native
}
object IconOptions {
  
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit class IconOptionsMutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Size): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setImageOffset(value: Size): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOffsetUndefined: Self = StObject.set(x, "imageOffset", js.undefined)
    
    @scala.inline
    def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    @scala.inline
    def setInfoWindowAnchor(value: Size): Self = StObject.set(x, "infoWindowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindowAnchorUndefined: Self = StObject.set(x, "infoWindowAnchor", js.undefined)
    
    @scala.inline
    def setPrintImageUrl(value: String): Self = StObject.set(x, "printImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintImageUrlUndefined: Self = StObject.set(x, "printImageUrl", js.undefined)
    
    @scala.inline
    def setSrcset(value: js.Object): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
  }
}
