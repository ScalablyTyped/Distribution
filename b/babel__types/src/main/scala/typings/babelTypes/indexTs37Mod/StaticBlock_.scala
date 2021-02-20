package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.StaticBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait StaticBlock_
  extends BlockParent
     with BaseNode
     with Scopable {
  
  var body: js.Array[Statement] = js.native
  
  @JSName("type")
  var type_StaticBlock_ : StaticBlock = js.native
}
object StaticBlock_ {
  
  @scala.inline
  def apply(body: js.Array[Statement], `type`: StaticBlock): StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticBlock_]
  }
  
  @scala.inline
  implicit class StaticBlock_MutableBuilder[Self <: StaticBlock_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: StaticBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
