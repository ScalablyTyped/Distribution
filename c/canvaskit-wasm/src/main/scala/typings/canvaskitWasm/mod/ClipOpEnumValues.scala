package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipOpEnumValues extends EmbindEnum {
  
  var Difference: ClipOp = js.native
  
  var Intersect: ClipOp = js.native
}
object ClipOpEnumValues {
  
  @scala.inline
  def apply(Difference: ClipOp, Intersect: ClipOp, values: js.Array[Double]): ClipOpEnumValues = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipOpEnumValues]
  }
  
  @scala.inline
  implicit class ClipOpEnumValuesMutableBuilder[Self <: ClipOpEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifference(value: ClipOp): Self = StObject.set(x, "Difference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersect(value: ClipOp): Self = StObject.set(x, "Intersect", value.asInstanceOf[js.Any])
  }
}
