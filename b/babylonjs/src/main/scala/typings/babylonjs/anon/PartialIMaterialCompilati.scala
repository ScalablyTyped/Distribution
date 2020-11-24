package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IMaterialCompilationOptions> */
@js.native
trait PartialIMaterialCompilati extends js.Object {
  
  var clipPlane: js.UndefOr[Boolean] = js.native
  
  var useInstances: js.UndefOr[Boolean] = js.native
}
object PartialIMaterialCompilati {
  
  @scala.inline
  def apply(): PartialIMaterialCompilati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIMaterialCompilati]
  }
  
  @scala.inline
  implicit class PartialIMaterialCompilatiOps[Self <: PartialIMaterialCompilati] (val x: Self) extends AnyVal {
    
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
    def deleteClipPlane: Self = this.set("clipPlane", js.undefined)
    
    @scala.inline
    def setUseInstances(value: Boolean): Self = this.set("useInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseInstances: Self = this.set("useInstances", js.undefined)
  }
}
