package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
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
  
  var default: Boolean | Null = js.native
  
  var declaration: Flow | Null = js.native
  
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
