package typings.regexpTreeSaQo4gle.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassRange
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.ClassRange] {
  
  var from: Char
  
  var to: Char
}
object ClassRange {
  
  inline def apply(from: Char, to: Char): ClassRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassRange")
    __obj.asInstanceOf[ClassRange]
  }
  
  extension [Self <: ClassRange](x: Self) {
    
    inline def setFrom(value: Char): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Char): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
