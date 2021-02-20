package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderProgressEvent extends StObject {
  
  /**
    * Defines if data length to load can be evaluated
    */
  val lengthComputable: Boolean = js.native
  
  /**
    * Defines the loaded data length
    */
  val loaded: Double = js.native
  
  /**
    * Defines the data length to load
    */
  val total: Double = js.native
}
object ISceneLoaderProgressEvent {
  
  @scala.inline
  def apply(lengthComputable: Boolean, loaded: Double, total: Double): ISceneLoaderProgressEvent = {
    val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderProgressEvent]
  }
  
  @scala.inline
  implicit class ISceneLoaderProgressEventMutableBuilder[Self <: ISceneLoaderProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
