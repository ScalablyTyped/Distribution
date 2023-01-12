package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  /** Defaults to `"50px"`. */
  var left: js.UndefOr[String] = js.undefined
  
  /** Defaults to `"0px"`. */
  var top: js.UndefOr[String] = js.undefined
}
object Top {
  
  inline def apply(): Top = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
