package typings.baseui.anon

import typings.baseui.baseuiStrings.`0px 8px`
import typings.baseui.baseuiStrings.`10px`
import typings.baseui.baseuiStrings.`20px`
import typings.baseui.baseuiStrings.`border-box`
import typings.baseui.baseuiStrings.center
import typings.baseui.baseuiStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxSizing extends StObject {
  
  val alignItems: center
  
  val borderRadius: `10px`
  
  val boxSizing: `border-box`
  
  val display: flex
  
  val height: `20px`
  
  val padding: `0px 8px`
}
object BoxSizing {
  
  inline def apply(): BoxSizing = {
    val __obj = js.Dynamic.literal(alignItems = "center", borderRadius = "10px", boxSizing = "border-box", display = "flex", height = "20px", padding = "0px 8px")
    __obj.asInstanceOf[BoxSizing]
  }
  
  extension [Self <: BoxSizing](x: Self) {
    
    inline def setAlignItems(value: center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: `10px`): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBoxSizing(value: `border-box`): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: flex): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: `20px`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: `0px 8px`): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
