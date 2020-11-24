package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ExportNamedDeclaration_
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null = js.native
  
  var declaration: Declaration | Null = js.native
  
  var exportKind: `type` | value | Null = js.native
  
  var source: StringLiteral_ | Null = js.native
  
  var specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_] = js.native
  
  @JSName("type")
  var type_ExportNamedDeclaration_ : ExportNamedDeclaration = js.native
}
object ExportNamedDeclaration_ {
  
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    `type`: ExportNamedDeclaration
  ): ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration_]
  }
  
  @scala.inline
  implicit class ExportNamedDeclaration_Ops[Self <: ExportNamedDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_)*): Self = this.set("specifiers", js.Array(value :_*))
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportNamedDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = this.set("assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = this.set("assertions", null)
    
    @scala.inline
    def setDeclaration(value: Declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = this.set("declaration", null)
    
    @scala.inline
    def setExportKind(value: `type` | value): Self = this.set("exportKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportKindNull: Self = this.set("exportKind", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
}
