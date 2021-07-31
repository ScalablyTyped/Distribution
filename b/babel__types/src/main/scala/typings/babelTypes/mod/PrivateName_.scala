package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait PrivateName_
  extends StObject
     with BaseNode
     with Private {
  
  var id: Identifier_
  
  @JSName("type")
  var type_PrivateName_ : PrivateName
}
object PrivateName_ {
  
  @scala.inline
  def apply(id: Identifier_): PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PrivateName")
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
