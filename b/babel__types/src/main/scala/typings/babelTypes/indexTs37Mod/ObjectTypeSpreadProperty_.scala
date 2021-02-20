package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ObjectTypeSpreadProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var argument: FlowType = js.native
  
  @JSName("type")
  var type_ObjectTypeSpreadProperty_ : ObjectTypeSpreadProperty = js.native
}
object ObjectTypeSpreadProperty_ {
  
  @scala.inline
  def apply(argument: FlowType, `type`: ObjectTypeSpreadProperty): ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeSpreadProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeSpreadProperty_MutableBuilder[Self <: ObjectTypeSpreadProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: FlowType): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeSpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
