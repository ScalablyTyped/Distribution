package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ExportAllDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null
  
  var source: StringLiteral_
  
  @JSName("type")
  var type_ExportAllDeclaration_ : ExportAllDeclaration
}
object ExportAllDeclaration_ {
  
  @scala.inline
  def apply(source: StringLiteral_): ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[ExportAllDeclaration_]
  }
  
  @scala.inline
  implicit class ExportAllDeclaration_MutableBuilder[Self <: ExportAllDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
