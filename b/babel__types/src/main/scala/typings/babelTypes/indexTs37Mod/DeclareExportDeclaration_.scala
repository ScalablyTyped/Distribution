package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait DeclareExportDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var default: Boolean | Null
  
  var declaration: Flow | Null
  
  var source: StringLiteral_ | Null
  
  var specifiers: (js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]) | Null
  
  @JSName("type")
  var type_DeclareExportDeclaration_ : DeclareExportDeclaration
}
object DeclareExportDeclaration_ {
  
  @scala.inline
  def apply(): DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, source = null, specifiers = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[DeclareExportDeclaration_]
  }
  
  @scala.inline
  implicit class DeclareExportDeclaration_MutableBuilder[Self <: DeclareExportDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: Flow): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersNull: Self = StObject.set(x, "specifiers", null)
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
