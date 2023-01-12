package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNamespaceExportDeclaration
  extends StObject
     with Node
     with Statement {
  
  var id: Identifier_
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
}
object TSNamespaceExportDeclaration {
  
  @JSImport("babel-types", "TSNamespaceExportDeclaration")
  @js.native
  def apply(id: Identifier_): TSNamespaceExportDeclaration = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNamespaceExportDeclaration] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
