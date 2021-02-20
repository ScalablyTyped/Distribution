package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXEmptyExpression_
  extends JSX
     with BaseNode {
  
  @JSName("type")
  var type_JSXEmptyExpression_ : JSXEmptyExpression = js.native
}
object JSXEmptyExpression_ {
  
  @scala.inline
  def apply(`type`: JSXEmptyExpression): JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression_]
  }
  
  @scala.inline
  implicit class JSXEmptyExpression_MutableBuilder[Self <: JSXEmptyExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
