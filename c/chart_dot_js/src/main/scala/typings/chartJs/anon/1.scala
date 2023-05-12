package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.FillerControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.LineControllerDatasetOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: LineControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
  }
}
