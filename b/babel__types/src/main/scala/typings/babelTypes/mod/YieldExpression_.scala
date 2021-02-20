package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait YieldExpression_
  extends Expression
     with BaseNode
     with Terminatorless {
  
  var argument: Expression | Null = js.native
  
  var delegate: Boolean = js.native
  
  @JSName("type")
  var type_YieldExpression_ : YieldExpression = js.native
}
object YieldExpression_ {
  
  @scala.inline
  def apply(delegate: Boolean, `type`: YieldExpression): YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression_]
  }
  
  @scala.inline
  implicit class YieldExpression_MutableBuilder[Self <: YieldExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    @scala.inline
    def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
