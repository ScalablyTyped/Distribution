package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.FillerControllerDatasetOptions
import typings.chartJs.distChunksHelpersDotcoreMod.LineControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var datasets: LineControllerDatasetOptions & FillerControllerDatasetOptions
}
object `1` {
  
  inline def apply(datasets: LineControllerDatasetOptions & FillerControllerDatasetOptions): `1` = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDatasets(value: LineControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
