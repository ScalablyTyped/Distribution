package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextObject extends StObject {
  
  var exclude: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var include: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
}
object ContextObject {
  
  inline def apply(): ContextObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextObject]
  }
  
  extension [Self <: ContextObject](x: Self) {
    
    inline def setExclude(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setInclude(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
