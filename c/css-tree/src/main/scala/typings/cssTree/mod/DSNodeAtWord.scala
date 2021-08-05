package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.AtKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeAtWord
  extends StObject
     with DSNode {
  
  var name: String
  
  var `type`: AtKeyword
}
object DSNodeAtWord {
  
  inline def apply(name: String): DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtKeyword")
    __obj.asInstanceOf[DSNodeAtWord]
  }
  
  extension [Self <: DSNodeAtWord](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: AtKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
