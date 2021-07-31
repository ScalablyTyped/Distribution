package typings.d3pie.anon

import typings.d3pie.d3pieStrings.`label-percentage1`
import typings.d3pie.d3pieStrings.`label-percentage2`
import typings.d3pie.d3pieStrings.`label-value1`
import typings.d3pie.d3pieStrings.`label-value2`
import typings.d3pie.d3pieStrings.label
import typings.d3pie.d3pieStrings.percentage
import typings.d3pie.d3pieStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  pieDistance :number | undefined} & d3pie.d3pie.ID3PieLabelsOptions */
trait pieDistancenumberundefine extends StObject {
  
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.undefined
  
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
  
  var pieDistance: js.UndefOr[Double] = js.undefined
}
object pieDistancenumberundefine {
  
  @scala.inline
  def apply(): pieDistancenumberundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieDistancenumberundefine]
  }
  
  @scala.inline
  implicit class pieDistancenumberundefineMutableBuilder[Self <: pieDistancenumberundefine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(
      value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHideWhenLessThanPercentage(value: Double): Self = StObject.set(x, "hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWhenLessThanPercentageUndefined: Self = StObject.set(x, "hideWhenLessThanPercentage", js.undefined)
    
    @scala.inline
    def setPieDistance(value: Double): Self = StObject.set(x, "pieDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPieDistanceUndefined: Self = StObject.set(x, "pieDistance", js.undefined)
  }
}
