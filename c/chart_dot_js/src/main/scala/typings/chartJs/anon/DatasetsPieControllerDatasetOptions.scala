package typings.chartJs.anon

import typings.chartJs.mod.PieControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetsPieControllerDatasetOptions extends StObject {
  
  var datasets: PieControllerDatasetOptions
}
object DatasetsPieControllerDatasetOptions {
  
  inline def apply(datasets: PieControllerDatasetOptions): DatasetsPieControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetsPieControllerDatasetOptions]
  }
  
  extension [Self <: DatasetsPieControllerDatasetOptions](x: Self) {
    
    inline def setDatasets(value: PieControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
