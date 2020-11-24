package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ImportDeclaration_
  extends Declaration
     with BaseNode
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null = js.native
  
  var importKind: `type` | typeof | value | Null = js.native
  
  var source: StringLiteral_ = js.native
  
  var specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_] = js.native
  
  @JSName("type")
  var type_ImportDeclaration_ : ImportDeclaration = js.native
}
object ImportDeclaration_ {
  
  @scala.inline
  def apply(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    `type`: ImportDeclaration
  ): ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration_]
  }
  
  @scala.inline
  implicit class ImportDeclaration_Ops[Self <: ImportDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = this.set("specifiers", js.Array(value :_*))
    
    @scala.inline
    def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = this.set("assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = this.set("assertions", null)
    
    @scala.inline
    def setImportKind(value: `type` | typeof | value): Self = this.set("importKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportKindNull: Self = this.set("importKind", null)
  }
}
