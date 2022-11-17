package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDatasetController extends StObject {
  
  /**
    * Element type used to generate a meta data (e.g. Chart.element.PointElement).
    */
  /* static member */
  var dataElementType: Any
  
  /**
    * Element type used to generate a meta dataset (e.g. Chart.element.LineElement).
    */
  /* static member */
  var datasetElementType: Any
  
  /**
    * @type {any}
    */
  /* static member */
  var defaults: Any
}
object TypeofDatasetController {
  
  inline def apply(dataElementType: Any, datasetElementType: Any, defaults: Any): TypeofDatasetController = {
    val __obj = js.Dynamic.literal(dataElementType = dataElementType.asInstanceOf[js.Any], datasetElementType = datasetElementType.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatasetController]
  }
  
  extension [Self <: TypeofDatasetController](x: Self) {
    
    inline def setDataElementType(value: Any): Self = StObject.set(x, "dataElementType", value.asInstanceOf[js.Any])
    
    inline def setDatasetElementType(value: Any): Self = StObject.set(x, "datasetElementType", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
  }
}
