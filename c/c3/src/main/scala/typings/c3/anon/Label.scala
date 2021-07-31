package typings.c3.anon

import typings.c3.mod.ExpandOptions
import typings.c3.mod.LabelOptionsWithThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  /**
    * Enable or disable expanding pie pieces.
    */
  var expand: js.UndefOr[ExpandOptions] = js.undefined
  
  var label: js.UndefOr[LabelOptionsWithThreshold] = js.undefined
  
  /**
    * Sets the angular separation between each adjacent arc.
    */
  var padAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Set title of donut chart.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Set width of donut chart.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
