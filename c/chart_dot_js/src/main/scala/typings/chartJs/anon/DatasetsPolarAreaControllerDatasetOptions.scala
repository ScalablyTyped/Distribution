package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.PolarAreaControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetsPolarAreaControllerDatasetOptions extends StObject {
  
  var datasets: PolarAreaControllerDatasetOptions
}
object DatasetsPolarAreaControllerDatasetOptions {
  
  inline def apply(datasets: PolarAreaControllerDatasetOptions): DatasetsPolarAreaControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetsPolarAreaControllerDatasetOptions]
  }
  
  extension [Self <: DatasetsPolarAreaControllerDatasetOptions](x: Self) {
    
    inline def setDatasets(value: PolarAreaControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
