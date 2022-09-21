package typings.regexpTreeSaQo4gle.astMod

import typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericBackreference
  extends StObject
     with Base[typings.regexpTreeSaQo4gle.regexpTreeSaQo4gleStrings.Backreference]
     with Backreference {
  
  var kind: number
  
  var number: Double
  
  var reference: Double
}
object NumericBackreference {
  
  inline def apply(number: Double, reference: Double): NumericBackreference = {
    val __obj = js.Dynamic.literal(kind = "number", number = number.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[NumericBackreference]
  }
  
  extension [Self <: NumericBackreference](x: Self) {
    
    inline def setKind(value: number): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
