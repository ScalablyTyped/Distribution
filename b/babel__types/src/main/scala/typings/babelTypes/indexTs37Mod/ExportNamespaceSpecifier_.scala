package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ExportNamespaceSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var exported: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier = js.native
}
object ExportNamespaceSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_, `type`: ExportNamespaceSpecifier): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  implicit class ExportNamespaceSpecifier_MutableBuilder[Self <: ExportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
