package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNullKeyword_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSNullKeyword_ : "TSNullKeyword"
}
object TSNullKeyword_ {
  
  inline def apply(): TSNullKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[TSNullKeyword_]
  }
  
  extension [Self <: TSNullKeyword_](x: Self) {
    
    inline def setType(value: "TSNullKeyword"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
