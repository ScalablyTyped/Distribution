package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeSpreadProperty_
  extends StObject
     with BaseNode
     with Flow
     with UserWhitespacable {
  
  var argument: FlowType
  
  @JSName("type")
  var type_ObjectTypeSpreadProperty_ : ObjectTypeSpreadProperty
}
object ObjectTypeSpreadProperty_ {
  
  inline def apply(argument: FlowType): ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[ObjectTypeSpreadProperty_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeSpreadProperty_] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: FlowType): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectTypeSpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
