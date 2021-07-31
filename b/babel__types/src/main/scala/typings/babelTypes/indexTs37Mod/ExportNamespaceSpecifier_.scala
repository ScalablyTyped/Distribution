package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ExportNamespaceSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier {
  
  var exported: Identifier_
  
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier
}
object ExportNamespaceSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
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
