package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithChildren extends StObject {
  
  var bind: js.UndefOr[Boolean] = js.undefined
  
  var withChildren: js.UndefOr[Boolean] = js.undefined
}
object WithChildren {
  
  inline def apply(): WithChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithChildren] (val x: Self) extends AnyVal {
    
    inline def setBind(value: Boolean): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setWithChildren(value: Boolean): Self = StObject.set(x, "withChildren", value.asInstanceOf[js.Any])
    
    inline def setWithChildrenUndefined: Self = StObject.set(x, "withChildren", js.undefined)
  }
}
