package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ImportDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null
  
  var importKind: `type` | typeof | value | Null
  
  var source: StringLiteral_
  
  var specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  
  @JSName("type")
  var type_ImportDeclaration_ : ImportDeclaration
}
object ImportDeclaration_ {
  
  inline def apply(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], assertions = null, end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[ImportDeclaration_]
  }
  
  extension [Self <: ImportDeclaration_](x: Self) {
    
    inline def setAssertions(value: ImportAttribute_): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setImportKind(value: `type` | typeof | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    inline def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
