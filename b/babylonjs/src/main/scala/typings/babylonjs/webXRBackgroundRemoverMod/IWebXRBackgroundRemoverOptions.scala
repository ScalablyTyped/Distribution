package typings.babylonjs.webXRBackgroundRemoverMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Ground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRBackgroundRemoverOptions extends js.Object {
  
  /**
    * Further background meshes to disable when entering AR
    */
  var backgroundMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  
  /**
    * flags to configure the removal of the environment helper.
    * If not set, the entire background will be removed. If set, flags should be set as well.
    */
  var environmentHelperRemovalFlags: js.UndefOr[Ground] = js.native
  
  /**
    * don't disable the environment helper
    */
  var ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.native
}
object IWebXRBackgroundRemoverOptions {
  
  @scala.inline
  def apply(): IWebXRBackgroundRemoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRBackgroundRemoverOptions]
  }
  
  @scala.inline
  implicit class IWebXRBackgroundRemoverOptionsOps[Self <: IWebXRBackgroundRemoverOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundMeshesVarargs(value: AbstractMesh*): Self = this.set("backgroundMeshes", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundMeshes(value: js.Array[AbstractMesh]): Self = this.set("backgroundMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundMeshes: Self = this.set("backgroundMeshes", js.undefined)
    
    @scala.inline
    def setEnvironmentHelperRemovalFlags(value: Ground): Self = this.set("environmentHelperRemovalFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentHelperRemovalFlags: Self = this.set("environmentHelperRemovalFlags", js.undefined)
    
    @scala.inline
    def setIgnoreEnvironmentHelper(value: Boolean): Self = this.set("ignoreEnvironmentHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEnvironmentHelper: Self = this.set("ignoreEnvironmentHelper", js.undefined)
  }
}
