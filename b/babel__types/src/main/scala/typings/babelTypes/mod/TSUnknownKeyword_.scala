package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnknownKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSUnknownKeyword_ : "TSUnknownKeyword"
}
object TSUnknownKeyword_ {
  
  inline def apply(): TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[TSUnknownKeyword_]
  }
  
  extension [Self <: TSUnknownKeyword_](x: Self) {
    
    inline def setType(value: "TSUnknownKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
