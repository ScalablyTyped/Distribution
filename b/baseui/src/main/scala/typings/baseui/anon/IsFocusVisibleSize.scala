package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisibleSize extends StObject {
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$size")
  var $size: typings.baseui.inputTypesMod.Size
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object IsFocusVisibleSize {
  
  inline def apply(
    $isFocusVisible: Boolean,
    $size: typings.baseui.inputTypesMod.Size,
    $theme: typings.baseui.stylesTypesMod.Theme
  ): IsFocusVisibleSize = {
    val __obj = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocusVisibleSize]
  }
  
  extension [Self <: IsFocusVisibleSize](x: Self) {
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$size(value: typings.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
