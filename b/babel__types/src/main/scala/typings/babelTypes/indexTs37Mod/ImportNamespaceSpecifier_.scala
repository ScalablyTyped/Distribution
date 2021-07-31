package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ImportNamespaceSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier_ {
  
  @scala.inline
  def apply(local: Identifier_): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  implicit class ImportNamespaceSpecifier_MutableBuilder[Self <: ImportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
