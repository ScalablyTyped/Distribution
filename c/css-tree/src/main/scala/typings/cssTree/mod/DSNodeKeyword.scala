package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeKeyword
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var name: String
  
  var `type`: Keyword
}
object DSNodeKeyword {
  
  inline def apply(name: String): DSNodeKeyword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Keyword")
    __obj.asInstanceOf[DSNodeKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DSNodeKeyword] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
