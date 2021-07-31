package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportNamedDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null
  
  var declaration: Declaration | Null
  
  var exportKind: `type` | value | Null
  
  var source: StringLiteral_ | Null
  
  var specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]
  
  @JSName("type")
  var type_ExportNamedDeclaration_ : ExportNamedDeclaration
}
object ExportNamedDeclaration_ {
  
  @scala.inline
  def apply(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration_]
  }
  
  @scala.inline
  implicit class ExportNamedDeclaration_MutableBuilder[Self <: ExportNamedDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    @scala.inline
    def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setExportKind(value: `type` | value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
