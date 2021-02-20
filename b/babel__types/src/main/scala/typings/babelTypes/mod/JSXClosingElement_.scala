package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXClosingElement_
  extends Immutable
     with BaseNode
     with JSX {
  
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_ = js.native
  
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement = js.native
}
object JSXClosingElement_ {
  
  @scala.inline
  def apply(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement_]
  }
  
  @scala.inline
  implicit class JSXClosingElement_MutableBuilder[Self <: JSXClosingElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
