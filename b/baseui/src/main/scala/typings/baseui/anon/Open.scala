package typings.baseui.anon

import typings.baseui.baseuiStrings.close
import typings.baseui.baseuiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  val close: typings.baseui.baseuiStrings.close
  
  val open: typings.baseui.baseuiStrings.open
}
object Open {
  
  inline def apply(): Open = {
    val __obj = js.Dynamic.literal(close = "close", open = "open")
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    inline def setClose(value: close): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: open): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
