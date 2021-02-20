package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait WhileStatement_
  extends BlockParent
     with BaseNode
     with Loop
     with Scopable
     with Statement
     with While {
  
  var body: Statement = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_WhileStatement_ : WhileStatement = js.native
}
object WhileStatement_ {
  
  @scala.inline
  def apply(body: Statement, test: Expression, `type`: WhileStatement): WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhileStatement_]
  }
  
  @scala.inline
  implicit class WhileStatement_MutableBuilder[Self <: WhileStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
