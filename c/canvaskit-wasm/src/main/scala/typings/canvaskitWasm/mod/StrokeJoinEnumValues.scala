package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeJoinEnumValues
  extends StObject
     with EmbindEnum {
  
  var Bevel: StrokeJoin
  
  var Miter: StrokeJoin
  
  var Round: StrokeJoin
}
object StrokeJoinEnumValues {
  
  inline def apply(Bevel: StrokeJoin, Miter: StrokeJoin, Round: StrokeJoin, values: js.Array[Double]): StrokeJoinEnumValues = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeJoinEnumValues]
  }
  
  extension [Self <: StrokeJoinEnumValues](x: Self) {
    
    inline def setBevel(value: StrokeJoin): Self = StObject.set(x, "Bevel", value.asInstanceOf[js.Any])
    
    inline def setMiter(value: StrokeJoin): Self = StObject.set(x, "Miter", value.asInstanceOf[js.Any])
    
    inline def setRound(value: StrokeJoin): Self = StObject.set(x, "Round", value.asInstanceOf[js.Any])
  }
}
