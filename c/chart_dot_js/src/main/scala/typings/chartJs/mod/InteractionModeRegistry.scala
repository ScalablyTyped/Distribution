package typings.chartJs.mod

import typings.chartJs.chartJsStrings.`x-axis`
import typings.chartJs.chartJsStrings.dataset
import typings.chartJs.chartJsStrings.index
import typings.chartJs.chartJsStrings.label
import typings.chartJs.chartJsStrings.nearest
import typings.chartJs.chartJsStrings.point
import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
@js.native
trait InteractionModeRegistry extends StObject {
  
  var dataset: typings.chartJs.chartJsStrings.dataset = js.native
  
  var index: typings.chartJs.chartJsStrings.index = js.native
  
  var label: typings.chartJs.chartJsStrings.label = js.native
  
  var nearest: typings.chartJs.chartJsStrings.nearest = js.native
  
  var point: typings.chartJs.chartJsStrings.point = js.native
  
  var single: typings.chartJs.chartJsStrings.single = js.native
  
  var x: typings.chartJs.chartJsStrings.x = js.native
  
  var `x-axis`: typings.chartJs.chartJsStrings.`x-axis` = js.native
  
  var y: typings.chartJs.chartJsStrings.y = js.native
}
object InteractionModeRegistry {
  
  @scala.inline
  def apply(
    dataset: dataset,
    index: index,
    label: label,
    nearest: nearest,
    point: point,
    single: single,
    x: x,
    `x-axis`: `x-axis`,
    y: y
  ): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionModeRegistry]
  }
  
  @scala.inline
  implicit class InteractionModeRegistryMutableBuilder[Self <: InteractionModeRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: single): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: typings.chartJs.chartJsStrings.x): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-axis`(value: `x-axis`): Self = StObject.set(x, "x-axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: y): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
