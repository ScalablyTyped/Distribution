package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Horizontal extends StObject {
  
  val horizontal: typings.baseui.baseuiStrings.horizontal
  
  val vertical: typings.baseui.baseuiStrings.vertical
}
object Horizontal {
  
  inline def apply(): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = "horizontal", vertical = "vertical")
    __obj.asInstanceOf[Horizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
