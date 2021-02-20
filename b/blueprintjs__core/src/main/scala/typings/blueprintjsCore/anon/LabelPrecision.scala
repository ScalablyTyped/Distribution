package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelPrecision extends StObject {
  
  var labelPrecision: Double = js.native
}
object LabelPrecision {
  
  @scala.inline
  def apply(labelPrecision: Double): LabelPrecision = {
    val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPrecision]
  }
  
  @scala.inline
  implicit class LabelPrecisionMutableBuilder[Self <: LabelPrecision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelPrecision(value: Double): Self = StObject.set(x, "labelPrecision", value.asInstanceOf[js.Any])
  }
}
