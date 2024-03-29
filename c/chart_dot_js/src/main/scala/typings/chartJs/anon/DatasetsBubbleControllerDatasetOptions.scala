package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.BubbleControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetsBubbleControllerDatasetOptions extends StObject {
  
  var datasets: BubbleControllerDatasetOptions
}
object DatasetsBubbleControllerDatasetOptions {
  
  inline def apply(datasets: BubbleControllerDatasetOptions): DatasetsBubbleControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(datasets = datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetsBubbleControllerDatasetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetsBubbleControllerDatasetOptions] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: BubbleControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
