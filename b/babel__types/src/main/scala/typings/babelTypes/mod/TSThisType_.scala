package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSThisType_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TSThisType_ : "TSThisType"
}
object TSThisType_ {
  
  inline def apply(): TSThisType_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[TSThisType_]
  }
  
  extension [Self <: TSThisType_](x: Self) {
    
    inline def setType(value: "TSThisType"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
