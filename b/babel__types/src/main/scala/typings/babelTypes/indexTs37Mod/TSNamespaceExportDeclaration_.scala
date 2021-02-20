package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSNamespaceExportDeclaration_
  extends Statement
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration_ : TSNamespaceExportDeclaration = js.native
}
object TSNamespaceExportDeclaration_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: TSNamespaceExportDeclaration): TSNamespaceExportDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNamespaceExportDeclaration_]
  }
  
  @scala.inline
  implicit class TSNamespaceExportDeclaration_MutableBuilder[Self <: TSNamespaceExportDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
