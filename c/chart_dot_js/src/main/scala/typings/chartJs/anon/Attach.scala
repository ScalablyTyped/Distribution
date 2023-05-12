package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attach extends StObject {
  
  var attach: js.UndefOr[js.Function] = js.undefined
  
  var detach: js.UndefOr[js.Function] = js.undefined
  
  var resize: js.UndefOr[js.Function] = js.undefined
}
object Attach {
  
  inline def apply(): Attach = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attach]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attach] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: js.Function): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
    
    inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
    
    inline def setDetach(value: js.Function): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    inline def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    inline def setResize(value: js.Function): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
