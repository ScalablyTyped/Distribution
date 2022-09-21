package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  var replace: String
  
  var search: js.RegExp
}
object Replace {
  
  inline def apply(replace: String, search: js.RegExp): Replace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  
  extension [Self <: Replace](x: Self) {
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: js.RegExp): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
