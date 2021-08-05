package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DeclareFunction_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_
  
  var predicate: DeclaredPredicate_ | Null
  
  @JSName("type")
  var type_DeclareFunction_ : DeclareFunction
}
object DeclareFunction_ {
  
  inline def apply(id: Identifier_): DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[DeclareFunction_]
  }
  
  extension [Self <: DeclareFunction_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: DeclaredPredicate_): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    inline def setType(value: DeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
