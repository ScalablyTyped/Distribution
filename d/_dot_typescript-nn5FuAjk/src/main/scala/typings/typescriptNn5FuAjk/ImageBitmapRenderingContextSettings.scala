package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmapRenderingContextSettings extends StObject {
  
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
}
object ImageBitmapRenderingContextSettings {
  
  inline def apply(): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
  
  extension [Self <: ImageBitmapRenderingContextSettings](x: Self) {
    
    inline def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
  }
}
