package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noop_
  extends StObject
     with Node {
  
  @JSName("type")
  var type_Noop_ : Noop
}
object Noop_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): Noop_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[Noop_]
  }
  
  extension [Self <: Noop_](x: Self) {
    
    inline def setType(value: Noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
