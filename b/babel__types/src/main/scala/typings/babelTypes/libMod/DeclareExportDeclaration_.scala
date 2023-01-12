package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareExportDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var default: js.UndefOr[Boolean | Null] = js.undefined
  
  var declaration: js.UndefOr[Flow | Null] = js.undefined
  
  var source: js.UndefOr[StringLiteral_ | Null] = js.undefined
  
  var specifiers: js.UndefOr[(js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]) | Null] = js.undefined
  
  @JSName("type")
  var type_DeclareExportDeclaration_ : DeclareExportDeclaration
}
object DeclareExportDeclaration_ {
  
  inline def apply(): DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[DeclareExportDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclareExportDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setDeclaration(value: Flow): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersNull: Self = StObject.set(x, "specifiers", null)
    
    inline def setSpecifiersUndefined: Self = StObject.set(x, "specifiers", js.undefined)
    
    inline def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
