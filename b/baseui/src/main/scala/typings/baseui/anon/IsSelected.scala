package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelected extends StObject {
  
  @JSName("$isSelected")
  var $isSelected: Boolean
  
  @JSName("$size")
  var $size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_
}
object IsSelected {
  
  inline def apply($isSelected: Boolean, $size: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_): IsSelected = {
    val __obj = js.Dynamic.literal($isSelected = $isSelected.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelected]
  }
  
  extension [Self <: IsSelected](x: Self) {
    
    inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
    
    inline def set$size(value: /* keyof baseui.anon.Compact */ mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
