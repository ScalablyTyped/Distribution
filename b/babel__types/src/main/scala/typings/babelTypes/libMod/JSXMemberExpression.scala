package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var `object`: JSXMemberExpression | JSXIdentifier
  
  var property: JSXIdentifier
  
  @JSName("type")
  var type_JSXMemberExpression: typings.babelTypes.babelTypesStrings.JSXMemberExpression
}
object JSXMemberExpression {
  
  inline def apply(`object`: JSXMemberExpression | JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression]
  }
  
  extension [Self <: JSXMemberExpression](x: Self) {
    
    inline def setObject(value: JSXMemberExpression | JSXIdentifier): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: JSXIdentifier): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
