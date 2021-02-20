package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ExportDefaultSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var exported: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportDefaultSpecifier_ : ExportDefaultSpecifier = js.native
}
object ExportDefaultSpecifier_ {
  
  @scala.inline
  def apply(exported: Identifier_, `type`: ExportDefaultSpecifier): ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit class ExportDefaultSpecifier_MutableBuilder[Self <: ExportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
