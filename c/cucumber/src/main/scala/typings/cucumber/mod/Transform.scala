package typings.cucumber.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var preferForRegexpMatch: js.UndefOr[Boolean] = js.undefined
  
  var regexp: RegExp
  
  def transformer(arg: String*): js.Any
  
  var typeName: js.UndefOr[String] = js.undefined
  
  var useForSnippets: js.UndefOr[Boolean] = js.undefined
}
object Transform {
  
  inline def apply(regexp: RegExp, transformer: /* repeated */ String => js.Any): Transform = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any], transformer = js.Any.fromFunction1(transformer))
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferForRegexpMatch(value: Boolean): Self = StObject.set(x, "preferForRegexpMatch", value.asInstanceOf[js.Any])
    
    inline def setPreferForRegexpMatchUndefined: Self = StObject.set(x, "preferForRegexpMatch", js.undefined)
    
    inline def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: /* repeated */ String => js.Any): Self = StObject.set(x, "transformer", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setUseForSnippets(value: Boolean): Self = StObject.set(x, "useForSnippets", value.asInstanceOf[js.Any])
    
    inline def setUseForSnippetsUndefined: Self = StObject.set(x, "useForSnippets", js.undefined)
  }
}
