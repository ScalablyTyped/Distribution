package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait V8IntrinsicIdentifier_
  extends StObject
     with BaseNode
     with Miscellaneous {
  
  var name: String
  
  @JSName("type")
  var type_V8IntrinsicIdentifier_ : V8IntrinsicIdentifier
}
object V8IntrinsicIdentifier_ {
  
  inline def apply(name: String): V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[V8IntrinsicIdentifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V8IntrinsicIdentifier_] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
