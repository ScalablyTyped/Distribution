package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSNamespaceExportDeclaration_
  extends StObject
     with BaseNode
     with Statement {
  
  var id: Identifier_
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration_ : TSNamespaceExportDeclaration
}
object TSNamespaceExportDeclaration_ {
  
  inline def apply(id: Identifier_): TSNamespaceExportDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[TSNamespaceExportDeclaration_]
  }
  
  extension [Self <: TSNamespaceExportDeclaration_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
