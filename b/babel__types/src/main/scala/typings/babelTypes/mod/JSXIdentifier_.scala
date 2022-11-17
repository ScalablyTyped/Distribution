package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXIdentifier_
  extends StObject
     with BaseNode {
  
  var name: String
  
  @JSName("type")
  var type_JSXIdentifier_ : "JSXIdentifier"
}
object JSXIdentifier_ {
  
  inline def apply(name: String): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[JSXIdentifier_]
  }
  
  extension [Self <: JSXIdentifier_](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: "JSXIdentifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
