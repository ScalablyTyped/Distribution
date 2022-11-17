package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSVoidKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSVoidKeyword_ : "TSVoidKeyword"
}
object TSVoidKeyword_ {
  
  inline def apply(): TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[TSVoidKeyword_]
  }
  
  extension [Self <: TSVoidKeyword_](x: Self) {
    
    inline def setType(value: "TSVoidKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
