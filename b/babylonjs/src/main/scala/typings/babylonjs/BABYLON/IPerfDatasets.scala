package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerfDatasets extends StObject {
  
  /**
    * The data to be processed by the performance graph. Each slice will be of the form of [timestamp, numberOfPoints, value1, value2...]
    */
  var data: DynamicFloat32Array
  
  /**
    * The ids of our dataset.
    */
  var ids: js.Array[String]
  
  /**
    * A list of starting indices for each slice of data collected. Used for fast access of an arbitrary slice inside the data array.
    */
  var startingIndices: DynamicFloat32Array
}
object IPerfDatasets {
  
  inline def apply(data: DynamicFloat32Array, ids: js.Array[String], startingIndices: DynamicFloat32Array): IPerfDatasets = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], startingIndices = startingIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfDatasets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPerfDatasets] (val x: Self) extends AnyVal {
    
    inline def setData(value: DynamicFloat32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setStartingIndices(value: DynamicFloat32Array): Self = StObject.set(x, "startingIndices", value.asInstanceOf[js.Any])
  }
}
