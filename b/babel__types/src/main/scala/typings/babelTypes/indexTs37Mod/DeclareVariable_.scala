package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareVariable_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_DeclareVariable_ : DeclareVariable = js.native
}
object DeclareVariable_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: DeclareVariable): DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareVariable_]
  }
  
  @scala.inline
  implicit class DeclareVariable_MutableBuilder[Self <: DeclareVariable_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareVariable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
