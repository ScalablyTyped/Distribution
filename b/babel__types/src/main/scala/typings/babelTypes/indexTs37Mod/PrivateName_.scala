package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait PrivateName_
  extends Private
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_PrivateName_ : PrivateName = js.native
}
object PrivateName_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: PrivateName): PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateName_]
  }
  
  @scala.inline
  implicit class PrivateName_MutableBuilder[Self <: PrivateName_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
