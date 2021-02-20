package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ExportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var exported: Identifier_ | StringLiteral_ = js.native
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier = js.native
}
object ExportSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ExportSpecifier): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier_]
  }
  
  @scala.inline
  implicit class ExportSpecifier_MutableBuilder[Self <: ExportSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
