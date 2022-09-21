package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNamespaceExportDeclaration
  extends StObject
     with BaseNode
     with Node
     with Statement
     with TypeScript {
  
  var id: Identifier_
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
}
object TSNamespaceExportDeclaration {
  
  inline def apply(id: Identifier_): TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[TSNamespaceExportDeclaration]
  }
  
  extension [Self <: TSNamespaceExportDeclaration](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
