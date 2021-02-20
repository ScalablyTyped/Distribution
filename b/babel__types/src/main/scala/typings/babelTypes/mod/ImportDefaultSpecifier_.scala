package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ImportDefaultSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier = js.native
}
object ImportDefaultSpecifier_ {
  
  @scala.inline
  def apply(local: Identifier_, `type`: ImportDefaultSpecifier): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit class ImportDefaultSpecifier_MutableBuilder[Self <: ImportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
