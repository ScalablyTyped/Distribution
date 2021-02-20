package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXMemberExpression_
  extends JSX
     with BaseNode {
  
  var `object`: JSXMemberExpression_ | JSXIdentifier_ = js.native
  
  var property: JSXIdentifier_ = js.native
  
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression = js.native
}
object JSXMemberExpression_ {
  
  @scala.inline
  def apply(
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    `type`: JSXMemberExpression
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
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
