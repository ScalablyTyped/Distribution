package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareModuleExports_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var typeAnnotation: TypeAnnotation_
  
  @JSName("type")
  var type_DeclareModuleExports_ : DeclareModuleExports
}
object DeclareModuleExports_ {
  
  inline def apply(typeAnnotation: TypeAnnotation_): DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[DeclareModuleExports_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclareModuleExports_] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
