package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderProgressEvent extends js.Object {
  
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
  implicit class ISceneLoaderProgressEventOps[Self <: ISceneLoaderProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLengthComputable(value: Boolean): Self = this.set("lengthComputable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
