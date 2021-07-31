package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXSpreadAttribute_
  extends StObject
     with BaseNode
     with JSX {
  
  var argument: Expression
  
  @JSName("type")
  var type_JSXSpreadAttribute_ : JSXSpreadAttribute
}
object JSXSpreadAttribute_ {
  
  @scala.inline
  def apply(argument: Expression): JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[JSXSpreadAttribute_]
  }
  
  @scala.inline
  implicit class JSXSpreadAttribute_MutableBuilder[Self <: JSXSpreadAttribute_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
