package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bind extends StObject {
  
  var bind: js.UndefOr[Boolean] = js.undefined
  
  var keepOriginalCase: js.UndefOr[Boolean] = js.undefined
  
  var withChildren: js.UndefOr[Boolean] = js.undefined
}
object Bind {
  
  inline def apply(): Bind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bind]
  }
  
  extension [Self <: Bind](x: Self) {
    
    inline def setBind(value: Boolean): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setKeepOriginalCase(value: Boolean): Self = StObject.set(x, "keepOriginalCase", value.asInstanceOf[js.Any])
    
    inline def setKeepOriginalCaseUndefined: Self = StObject.set(x, "keepOriginalCase", js.undefined)
    
    inline def setWithChildren(value: Boolean): Self = StObject.set(x, "withChildren", value.asInstanceOf[js.Any])
    
    inline def setWithChildrenUndefined: Self = StObject.set(x, "withChildren", js.undefined)
  }
}
