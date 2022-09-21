package typings.baseui.anon

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  val bottom: typings.baseui.baseuiStrings.bottom
  
  val left: typings.baseui.baseuiStrings.left
  
  val right: typings.baseui.baseuiStrings.right
  
  val top: typings.baseui.baseuiStrings.top
}
object Bottom {
  
  inline def apply(): Bottom = {
    val __obj = js.Dynamic.literal(bottom = "bottom", left = "left", right = "right", top = "top")
    __obj.asInstanceOf[Bottom]
  }
  
  extension [Self <: Bottom](x: Self) {
    
    inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
