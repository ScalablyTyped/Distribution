package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignTop extends StObject {
  
  @JSName("$alignTop")
  var $alignTop: Boolean
  
  @JSName("$size")
  var $size: typings.baseui.inputTypesMod.Size
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object AlignTop {
  
  inline def apply(
    $alignTop: Boolean,
    $size: typings.baseui.inputTypesMod.Size,
    $theme: typings.baseui.stylesTypesMod.Theme
  ): AlignTop = {
    val __obj = js.Dynamic.literal($alignTop = $alignTop.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTop]
  }
  
  extension [Self <: AlignTop](x: Self) {
    
    inline def set$alignTop(value: Boolean): Self = StObject.set(x, "$alignTop", value.asInstanceOf[js.Any])
    
    inline def set$size(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
