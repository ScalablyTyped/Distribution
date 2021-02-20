package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbindEnum extends StObject {
  
  val values: js.Array[Double] = js.native
}
object EmbindEnum {
  
  @scala.inline
  def apply(values: js.Array[Double]): EmbindEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbindEnum]
  }
  
  @scala.inline
  implicit class EmbindEnumMutableBuilder[Self <: EmbindEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
