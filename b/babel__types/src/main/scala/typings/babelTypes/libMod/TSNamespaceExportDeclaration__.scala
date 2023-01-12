package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNamespaceExportDeclaration__
  extends StObject
     with BaseNode
     with Node
     with Statement
     with TypeScript {
  
  var id: Identifier_
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration__ : TSNamespaceExportDeclaration
}
object TSNamespaceExportDeclaration__ {
  
  inline def apply(id: Identifier_): TSNamespaceExportDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[TSNamespaceExportDeclaration__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNamespaceExportDeclaration__] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
