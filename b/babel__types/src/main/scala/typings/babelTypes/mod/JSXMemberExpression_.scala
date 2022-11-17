package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression_
  extends StObject
     with BaseNode {
  
  var `object`: JSXMemberExpression_ | JSXIdentifier_
  
  var property: JSXIdentifier_
  
  @JSName("type")
  var type_JSXMemberExpression_ : "JSXMemberExpression"
}
object JSXMemberExpression_ {
  
  inline def apply(`object`: JSXMemberExpression_ | JSXIdentifier_, property: JSXIdentifier_): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression_]
  }
  
  extension [Self <: JSXMemberExpression_](x: Self) {
    
    inline def setObject(value: JSXMemberExpression_ | JSXIdentifier_): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: JSXIdentifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: "JSXMemberExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
