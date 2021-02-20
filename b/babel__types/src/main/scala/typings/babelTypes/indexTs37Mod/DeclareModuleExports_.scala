package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareModuleExports_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var typeAnnotation: TypeAnnotation_ = js.native
  
  @JSName("type")
  var type_DeclareModuleExports_ : DeclareModuleExports = js.native
}
object DeclareModuleExports_ {
  
  @scala.inline
  def apply(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModuleExports_]
  }
  
  @scala.inline
  implicit class DeclareModuleExports_MutableBuilder[Self <: DeclareModuleExports_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
