package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptionsWithThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expand extends StObject {
  
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[ExpandOptions] = js.native
  
  var label: js.UndefOr[LabelOptionsWithThreshold] = js.native
  
  /**
    * Sets the angular separation between each adjacent arc.
    */
  var padAngle: js.UndefOr[Double] = js.native
}
object Expand {
  
  @scala.inline
  def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: ExpandOptions): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelOptionsWithThreshold): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
  }
}
