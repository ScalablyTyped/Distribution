package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerfViewerCollectionStrategy extends StObject {
  
  /**
    * Function which does any necessary cleanup. Called when performanceViewerCollector.dispose() is called.
    */
  def dispose(): Unit
  
  /**
    * Function which gets the data for the strategy.
    */
  def getData(): Double
  
  /**
    * The id of the strategy.
    */
  var id: String
}
object IPerfViewerCollectionStrategy {
  
  inline def apply(dispose: () => Unit, getData: () => Double, id: String): IPerfViewerCollectionStrategy = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfViewerCollectionStrategy]
  }
  
  extension [Self <: IPerfViewerCollectionStrategy](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => Double): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
