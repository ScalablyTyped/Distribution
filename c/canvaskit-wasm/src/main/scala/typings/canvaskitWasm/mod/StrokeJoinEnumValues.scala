package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeJoinEnumValues extends EmbindEnum {
  
  var Bevel: StrokeJoin = js.native
  
  var Miter: StrokeJoin = js.native
  
  var Round: StrokeJoin = js.native
}
object StrokeJoinEnumValues {
  
  @scala.inline
  def apply(Bevel: StrokeJoin, Miter: StrokeJoin, Round: StrokeJoin, values: js.Array[Double]): StrokeJoinEnumValues = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeJoinEnumValues]
  }
  
  @scala.inline
  implicit class StrokeJoinEnumValuesMutableBuilder[Self <: StrokeJoinEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBevel(value: StrokeJoin): Self = StObject.set(x, "Bevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiter(value: StrokeJoin): Self = StObject.set(x, "Miter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: StrokeJoin): Self = StObject.set(x, "Round", value.asInstanceOf[js.Any])
  }
}
