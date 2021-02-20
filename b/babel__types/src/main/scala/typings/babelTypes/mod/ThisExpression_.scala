package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ThisExpression_
  extends Expression
     with BaseNode {
  
  @JSName("type")
  var type_ThisExpression_ : ThisExpression = js.native
}
object ThisExpression_ {
  
  @scala.inline
  def apply(`type`: ThisExpression): ThisExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisExpression_]
  }
  
  @scala.inline
  implicit class ThisExpression_MutableBuilder[Self <: ThisExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
