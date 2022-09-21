package typings.chartJs.anon

import typings.chartJs.mod.ScatterControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetsScatterControllerDatasetOptions extends StObject {
  
  var datasets: ScatterControllerDatasetOptions
}
object DatasetsScatterControllerDatasetOptions {
  
  inline def apply(datasets: ScatterControllerDatasetOptions): DatasetsScatterControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetsScatterControllerDatasetOptions]
  }
  
  extension [Self <: DatasetsScatterControllerDatasetOptions](x: Self) {
    
    inline def setDatasets(value: ScatterControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
