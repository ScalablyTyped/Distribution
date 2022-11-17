package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNumberKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSNumberKeyword_ : "TSNumberKeyword"
}
object TSNumberKeyword_ {
  
  inline def apply(): TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[TSNumberKeyword_]
  }
  
  extension [Self <: TSNumberKeyword_](x: Self) {
    
    inline def setType(value: "TSNumberKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
