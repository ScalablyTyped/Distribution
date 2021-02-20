package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
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
  implicit class ImportDeclaration_MutableBuilder[Self <: ImportDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    @scala.inline
    def setImportKind(value: `type` | typeof | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
