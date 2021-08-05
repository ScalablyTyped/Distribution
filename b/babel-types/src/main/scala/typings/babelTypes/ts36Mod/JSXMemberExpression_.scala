package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression_
  extends StObject
     with Node
     with Expression
     with JSX {
  
  var `object`: JSXMemberExpression_ | JSXIdentifier_
  
  var property: JSXIdentifier_
  
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression
}
object JSXMemberExpression_ {
  
  inline def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression_]
  }
  
  extension [Self <: JSXMemberExpression_](x: Self) {
    
    inline def setObject(value: JSXMemberExpression_ | JSXIdentifier_): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: JSXIdentifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
