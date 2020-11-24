package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareExportDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var declaration: Flow | Null = js.native
  
  var default: Boolean | Null = js.native
  
  var source: StringLiteral_ | Null = js.native
  
  var specifiers: (js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]) | Null = js.native
  
  @JSName("type")
  var type_DeclareExportDeclaration_ : DeclareExportDeclaration = js.native
}
object DeclareExportDeclaration_ {
  
  @scala.inline
  def apply(`type`: DeclareExportDeclaration): DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportDeclaration_]
  }
  
  @scala.inline
  implicit class DeclareExportDeclaration_Ops[Self <: DeclareExportDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setType(value: DeclareExportDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaration(value: Flow): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = this.set("declaration", null)
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportNamespaceSpecifier_)*): Self = this.set("specifiers", js.Array(value :_*))
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersNull: Self = this.set("specifiers", null)
  }
}
