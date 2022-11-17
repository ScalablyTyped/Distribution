package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillerControllerDatasetOptions extends StObject {
  
  /**
    * Both line and radar charts support a fill option on the dataset object which can be used to create area between two datasets or a dataset and a boundary, i.e. the scale origin, start or end
    */
  var fill: FillTarget | ComplexFillTarget
}
object FillerControllerDatasetOptions {
  
  inline def apply(fill: FillTarget | ComplexFillTarget): FillerControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillerControllerDatasetOptions]
  }
  
  extension [Self <: FillerControllerDatasetOptions](x: Self) {
    
    inline def setFill(value: FillTarget | ComplexFillTarget): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
  }
}
