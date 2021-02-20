package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXMemberExpression_
  extends Node
     with Expression
     with JSX {
  
  var `object`: JSXMemberExpression_ | JSXIdentifier_ = js.native
  
  var property: JSXIdentifier_ = js.native
  
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression = js.native
}
object JSXMemberExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double,
    `type`: JSXMemberExpression
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression_]
  }
  
  @scala.inline
  implicit class JSXMemberExpression_MutableBuilder[Self <: JSXMemberExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: JSXMemberExpression_ | JSXIdentifier_): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: JSXIdentifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
