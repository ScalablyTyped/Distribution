package typings.baseui.anon

import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  val click: typings.baseui.baseuiStrings.click
  
  val hover: typings.baseui.baseuiStrings.hover
}
object Click {
  
  inline def apply(): Click = {
    val __obj = js.Dynamic.literal(click = "click", hover = "hover")
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setHover(value: hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
  }
}
