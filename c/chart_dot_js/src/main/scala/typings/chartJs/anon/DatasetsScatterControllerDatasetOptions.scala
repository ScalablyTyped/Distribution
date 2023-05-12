package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.ScatterControllerDatasetOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetsScatterControllerDatasetOptions] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: ScatterControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
