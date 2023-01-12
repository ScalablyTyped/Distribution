package typings.baseui.anon

import typings.baseui.baseuiStrings.`10px`
import typings.baseui.baseuiStrings.`16px`
import typings.baseui.baseuiStrings.`50Percentsign`
import typings.baseui.baseuiStrings.center
import typings.baseui.baseuiStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  val alignItems: center
  
  val borderRadius: `50Percentsign`
  
  val display: flex
  
  val fontSize: `10px`
  
  val height: `16px`
  
  val justifyContent: center
  
  val width: `16px`
}
object AlignItems {
  
  inline def apply(): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = "center", borderRadius = "50%", display = "flex", fontSize = "10px", height = "16px", justifyContent = "center", width = "16px")
    __obj.asInstanceOf[AlignItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItems] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: `50Percentsign`): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: flex): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: `10px`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: `16px`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `16px`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
