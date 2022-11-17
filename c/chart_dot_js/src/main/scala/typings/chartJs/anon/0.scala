package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.FillerControllerDatasetOptions
import typings.chartJs.distChunksHelpersDotcoreMod.RadarControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var datasets: RadarControllerDatasetOptions & FillerControllerDatasetOptions
}
object `0` {
  
  inline def apply(datasets: RadarControllerDatasetOptions & FillerControllerDatasetOptions): `0` = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setDatasets(value: RadarControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
