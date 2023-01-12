package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait Super_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  @JSName("type")
  var type_Super_ : Super
}
object Super_ {
  
  inline def apply(): Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Super_] (val x: Self) extends AnyVal {
    
    inline def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
