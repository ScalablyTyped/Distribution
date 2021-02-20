package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percentage extends StObject {
  
  var label: js.UndefOr[String] = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Percentage {
  
  @scala.inline
  def apply(): Percentage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percentage]
  }
  
  @scala.inline
  implicit class PercentageMutableBuilder[Self <: Percentage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
