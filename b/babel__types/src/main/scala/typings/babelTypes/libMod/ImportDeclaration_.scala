package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ImportDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ImportOrExportDeclaration
     with ModuleDeclaration
     with Node
     with Standardized
     with Statement {
  
  var assertions: js.UndefOr[js.Array[ImportAttribute_] | Null] = js.undefined
  
  var attributes: js.UndefOr[js.Array[ImportAttribute_] | Null] = js.undefined
  
  var importKind: js.UndefOr[`type` | typeof | value | Null] = js.undefined
  
  var module: js.UndefOr[Boolean | Null] = js.undefined
  
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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[ImportDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
    inline def setAssertionsVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "assertions", js.Array(value*))
    
    inline def setAttributes(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setImportKind(value: `type` | typeof | value): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    inline def setImportKindUndefined: Self = StObject.set(x, "importKind", js.undefined)
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleNull: Self = StObject.set(x, "module", null)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
