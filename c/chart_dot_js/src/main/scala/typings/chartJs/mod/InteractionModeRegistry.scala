package typings.chartJs.mod

import typings.chartJs.chartJsStrings.`x-axis`
import typings.chartJs.chartJsStrings.dataset
import typings.chartJs.chartJsStrings.index
import typings.chartJs.chartJsStrings.label
import typings.chartJs.chartJsStrings.nearest
import typings.chartJs.chartJsStrings.point
import typings.chartJs.chartJsStrings.single
import typings.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allow extending the IteractionMode type alias
// see https://github.com/microsoft/TypeScript/issues/28078#issuecomment-432339564
trait InteractionModeRegistry extends StObject {
  
  var dataset: typings.chartJs.chartJsStrings.dataset
  
  var index: typings.chartJs.chartJsStrings.index
  
  var label: typings.chartJs.chartJsStrings.label
  
  var nearest: typings.chartJs.chartJsStrings.nearest
  
  var point: typings.chartJs.chartJsStrings.point
  
  var single: typings.chartJs.chartJsStrings.single
  
  var x: typings.chartJs.chartJsStrings.x
  
  var `x-axis`: typings.chartJs.chartJsStrings.`x-axis`
  
  var y: typings.chartJs.chartJsStrings.y
}
object InteractionModeRegistry {
  
  inline def apply(): InteractionModeRegistry = {
    val __obj = js.Dynamic.literal(dataset = "dataset", index = "index", label = "label", nearest = "nearest", point = "point", single = "single", x = "x", y = "y")
    __obj.updateDynamic("x-axis")("x-axis")
    __obj.asInstanceOf[InteractionModeRegistry]
  }
  
  extension [Self <: InteractionModeRegistry](x: Self) {
    
    inline def setDataset(value: dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: single): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setX(value: typings.chartJs.chartJsStrings.x): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def `setX-axis`(value: `x-axis`): Self = StObject.set(x, "x-axis", value.asInstanceOf[js.Any])
    
    inline def setY(value: y): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
