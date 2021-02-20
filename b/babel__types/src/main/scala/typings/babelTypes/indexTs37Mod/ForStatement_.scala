package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ForStatement_
  extends BlockParent
     with BaseNode
     with For
     with Loop
     with Scopable
     with Statement {
  
  var body: Statement = js.native
  
  var init: VariableDeclaration_ | Expression | Null = js.native
  
  var test: Expression | Null = js.native
  
  @JSName("type")
  var type_ForStatement_ : ForStatement = js.native
  
  var update: Expression | Null = js.native
}
object ForStatement_ {
  
  @scala.inline
  def apply(body: Statement, `type`: ForStatement): ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement_]
  }
  
  @scala.inline
  implicit class ForStatement_MutableBuilder[Self <: ForStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: VariableDeclaration_ | Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setType(value: ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Expression): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = StObject.set(x, "update", null)
  }
}
