package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait Noop_
  extends StObject
     with BaseNode
     with Miscellaneous {
  
  @JSName("type")
  var type_Noop_ : Noop
}
object Noop_ {
  
  inline def apply(): Noop_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[Noop_]
  }
  
  extension [Self <: Noop_](x: Self) {
    
    inline def setType(value: Noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
