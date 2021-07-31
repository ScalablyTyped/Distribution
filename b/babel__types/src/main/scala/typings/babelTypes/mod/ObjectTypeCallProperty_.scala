package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeCallProperty_
  extends StObject
     with BaseNode
     with Flow
     with UserWhitespacable {
  
  var static: Boolean
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty
  
  var value: FlowType
}
object ObjectTypeCallProperty_ {
  
  @scala.inline
  def apply(static: Boolean, value: FlowType): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
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
