package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSObjectKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSObjectKeyword_ : "TSObjectKeyword"
}
object TSObjectKeyword_ {
  
  inline def apply(): TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[TSObjectKeyword_]
  }
  
  extension [Self <: TSObjectKeyword_](x: Self) {
    
    inline def setType(value: "TSObjectKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
