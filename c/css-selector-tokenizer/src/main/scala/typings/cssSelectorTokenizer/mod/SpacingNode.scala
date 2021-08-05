package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.spacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var `type`: spacing
  
  var value: String
}
object SpacingNode {
  
  inline def apply(value: String): SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spacing")
    __obj.asInstanceOf[SpacingNode]
  }
  
  extension [Self <: SpacingNode](x: Self) {
    
    inline def setType(value: spacing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
