package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningFragment_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_JSXOpeningFragment_ : "JSXOpeningFragment"
}
object JSXOpeningFragment_ {
  
  inline def apply(): JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment_]
  }
  
  extension [Self <: JSXOpeningFragment_](x: Self) {
    
    inline def setType(value: "JSXOpeningFragment"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
