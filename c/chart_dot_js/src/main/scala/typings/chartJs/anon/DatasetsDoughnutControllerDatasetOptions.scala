package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.DoughnutControllerDatasetOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetsDoughnutControllerDatasetOptions] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: DoughnutControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
