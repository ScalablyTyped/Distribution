package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression__
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var `object`: JSXMemberExpression__ | JSXIdentifier__
  
  var property: JSXIdentifier__
  
  @JSName("type")
  var type_JSXMemberExpression__ : JSXMemberExpression
}
object JSXMemberExpression__ {
  
  inline def apply(`object`: JSXMemberExpression__ | JSXIdentifier__, property: JSXIdentifier__): JSXMemberExpression__ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXMemberExpression__] (val x: Self) extends AnyVal {
    
    inline def setObject(value: JSXMemberExpression__ | JSXIdentifier__): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: JSXIdentifier__): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
