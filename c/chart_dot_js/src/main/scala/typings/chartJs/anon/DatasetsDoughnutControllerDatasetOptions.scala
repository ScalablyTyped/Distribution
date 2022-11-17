package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.DoughnutControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetsDoughnutControllerDatasetOptions extends StObject {
  
  var datasets: DoughnutControllerDatasetOptions
}
object DatasetsDoughnutControllerDatasetOptions {
  
  inline def apply(datasets: DoughnutControllerDatasetOptions): DatasetsDoughnutControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetsDoughnutControllerDatasetOptions]
  }
  
  extension [Self <: DatasetsDoughnutControllerDatasetOptions](x: Self) {
    
    inline def setDatasets(value: DoughnutControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
