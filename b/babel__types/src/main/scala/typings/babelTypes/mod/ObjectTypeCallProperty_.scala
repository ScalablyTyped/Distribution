package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeCallProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty = js.native
  
  var value: FlowType = js.native
}
object ObjectTypeCallProperty_ {
  
  @scala.inline
  def apply(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeCallProperty_MutableBuilder[Self <: ObjectTypeCallProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeCallProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
