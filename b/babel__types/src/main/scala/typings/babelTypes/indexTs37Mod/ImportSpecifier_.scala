package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ImportSpecifier
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ImportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var importKind: `type` | typeof | Null = js.native
  
  var imported: Identifier_ | StringLiteral_ = js.native
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier = js.native
}
object ImportSpecifier_ {
  
  @scala.inline
  def apply(imported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ImportSpecifier): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier_]
  }
  
  @scala.inline
  implicit class ImportSpecifier_MutableBuilder[Self <: ImportSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportKind(value: `type` | typeof): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportKindNull: Self = StObject.set(x, "importKind", null)
    
    @scala.inline
    def setImported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
