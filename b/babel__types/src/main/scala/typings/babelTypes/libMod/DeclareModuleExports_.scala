package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareModuleExports_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var typeAnnotation: TypeAnnotation_
  
  @JSName("type")
  var type_DeclareModuleExports_ : DeclareModuleExports
}
object DeclareModuleExports_ {
  
  inline def apply(typeAnnotation: TypeAnnotation_): DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[DeclareModuleExports_]
  }
  
  extension [Self <: DeclareModuleExports_](x: Self) {
    
    inline def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
