package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXOpeningElement_
  extends Node
     with Immutable
     with JSX {
  
  var attributes: js.Array[JSXAttribute_] = js.native
  
  var name: JSXIdentifier_ | JSXMemberExpression_ = js.native
  
  var selfClosing: Boolean = js.native
  
  @JSName("type")
  var type_JSXOpeningElement_ : JSXOpeningElement = js.native
}
object JSXOpeningElement_ {
  
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double,
    `type`: JSXOpeningElement
  ): JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement_]
  }
  
  @scala.inline
  implicit class JSXOpeningElement_MutableBuilder[Self <: JSXOpeningElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[JSXAttribute_]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: JSXAttribute_ *): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: JSXIdentifier_ | JSXMemberExpression_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
