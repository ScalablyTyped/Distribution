package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier {
  
  var exported: Identifier_ | StringLiteral_
  
  var local: Identifier_
  
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier
}
object ExportSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_ | StringLiteral_, local: Identifier_): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[ExportSpecifier_]
  }
  
  @scala.inline
  implicit class ExportSpecifier_MutableBuilder[Self <: ExportSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
