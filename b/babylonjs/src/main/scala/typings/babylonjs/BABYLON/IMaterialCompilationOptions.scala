package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialCompilationOptions extends js.Object {
  
  /**
    * Defines whether clip planes are enabled.
    */
  var clipPlane: Boolean = js.native
  
  /**
    * Defines whether instances are enabled.
    */
  var useInstances: Boolean = js.native
}
object IMaterialCompilationOptions {
  
  @scala.inline
  def apply(clipPlane: Boolean, useInstances: Boolean): IMaterialCompilationOptions = {
    val __obj = js.Dynamic.literal(clipPlane = clipPlane.asInstanceOf[js.Any], useInstances = useInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialCompilationOptions]
  }
  
  @scala.inline
  implicit class IMaterialCompilationOptionsOps[Self <: IMaterialCompilationOptions] (val x: Self) extends AnyVal {
    
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
    def setClipPlane(value: Boolean): Self = this.set("clipPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInstances(value: Boolean): Self = this.set("useInstances", value.asInstanceOf[js.Any])
  }
}
