package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLoaderProgressEvent extends StObject {
  
  /**
    * Defines if data length to load can be evaluated
    */
  val lengthComputable: Boolean
  
  /**
    * Defines the loaded data length
    */
  val loaded: Double
  
  /**
    * Defines the data length to load
    */
  val total: Double
}
object ISceneLoaderProgressEvent {
  
  inline def apply(lengthComputable: Boolean, loaded: Double, total: Double): ISceneLoaderProgressEvent = {
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISceneLoaderProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
