package typings.baseui.anon

import typings.baseui.baseuiStrings.`20px`
import typings.baseui.baseuiStrings.`50Percentsign`
import typings.baseui.baseuiStrings.`border-box`
import typings.baseui.baseuiStrings.center
import typings.baseui.baseuiStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  val alignItems: center
  
  val borderRadius: `50Percentsign`
  
  val boxSizing: `border-box`
  
  val display: flex
  
  val height: `20px`
  
  val justifyContent: center
  
  val width: `20px`
}
object Display {
  
  inline def apply(): Display = {
    val __obj = js.Dynamic.literal(alignItems = "center", borderRadius = "50%", boxSizing = "border-box", display = "flex", height = "20px", justifyContent = "center", width = "20px")
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: center): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: `50Percentsign`): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBoxSizing(value: `border-box`): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: flex): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: `20px`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: `20px`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
