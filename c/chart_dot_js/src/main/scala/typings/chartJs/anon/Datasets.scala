package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.BarControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datasets extends StObject {
  
  var datasets: BarControllerDatasetOptions
}
object Datasets {
  
  inline def apply(datasets: BarControllerDatasetOptions): Datasets = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datasets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datasets] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: BarControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
