package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_ThisExpression_ : "ThisExpression"
}
object ThisExpression_ {
  
  inline def apply(): ThisExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression_]
  }
  
  extension [Self <: ThisExpression_](x: Self) {
    
    inline def setType(value: "ThisExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
