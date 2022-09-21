package typings.ckeditor4.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  var removed: js.Array[String]
  
  var set: StringDictionary[String]
}
object Set {
  
  inline def apply(removed: js.Array[String], set: StringDictionary[String]): Set = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setSet(value: StringDictionary[String]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
