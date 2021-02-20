package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait WithStatement_
  extends Statement
     with BaseNode {
  
  var body: Statement = js.native
  
  var `object`: Expression = js.native
  
  @JSName("type")
  var type_WithStatement_ : WithStatement = js.native
}
object WithStatement_ {
  
  @scala.inline
  def apply(body: Statement, `object`: Expression, `type`: WithStatement): WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement_]
  }
  
  @scala.inline
  implicit class WithStatement_MutableBuilder[Self <: WithStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
