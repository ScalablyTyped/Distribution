package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  @JSName("$color")
  var $color: js.UndefOr[Any] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[Any] = js.undefined
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object Theme {
  
  inline def apply($theme: typings.baseui.stylesTypesMod.Theme): Theme = {
    val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def set$color(value: Any): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    inline def set$size(value: Any): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
