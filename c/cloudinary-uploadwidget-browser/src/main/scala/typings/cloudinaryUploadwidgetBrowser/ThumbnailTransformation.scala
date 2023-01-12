package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailTransformation
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var crop: js.UndefOr[String] = js.undefined
  
  var effect: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ThumbnailTransformation {
  
  inline def apply(): ThumbnailTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailTransformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThumbnailTransformation] (val x: Self) extends AnyVal {
    
    inline def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
