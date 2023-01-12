package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super
  extends StObject
     with Node
     with Expression {
  
  @JSName("type")
  var type_Super: typings.babelTypes.babelTypesStrings.Super
}
object Super {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): Super = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Super] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
