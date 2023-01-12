package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipY extends StObject {
  
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  var preferBlob: js.UndefOr[Boolean] = js.undefined
  
  var preferImageBitmap: js.UndefOr[Boolean] = js.undefined
  
  var skipColorSpaceConversion: js.UndefOr[Boolean] = js.undefined
}
object FlipY {
  
  inline def apply(): FlipY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlipY] (val x: Self) extends AnyVal {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setPreferBlob(value: Boolean): Self = StObject.set(x, "preferBlob", value.asInstanceOf[js.Any])
    
    inline def setPreferBlobUndefined: Self = StObject.set(x, "preferBlob", js.undefined)
    
    inline def setPreferImageBitmap(value: Boolean): Self = StObject.set(x, "preferImageBitmap", value.asInstanceOf[js.Any])
    
    inline def setPreferImageBitmapUndefined: Self = StObject.set(x, "preferImageBitmap", js.undefined)
    
    inline def setSkipColorSpaceConversion(value: Boolean): Self = StObject.set(x, "skipColorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setSkipColorSpaceConversionUndefined: Self = StObject.set(x, "skipColorSpaceConversion", js.undefined)
  }
}
