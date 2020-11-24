package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimplificationTask extends js.Object {
  
  /**
    * Mesh to simplify
    */
  var mesh: Mesh = js.native
  
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: Boolean = js.native
  
  /**
    * Array of settings
    */
  var settings: js.Array[ISimplificationSettings] = js.native
  
  /**
    * Simplification type
    */
  var simplificationType: SimplificationType = js.native
  
  /**
    * Callback called on success
    */
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}
object ISimplificationTask {
  
  @scala.inline
  def apply(
    mesh: Mesh,
    parallelProcessing: Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationTask]
  }
  
  @scala.inline
  implicit class ISimplificationTaskOps[Self <: ISimplificationTask] (val x: Self) extends AnyVal {
    
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
    def setMesh(value: Mesh): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelProcessing(value: Boolean): Self = this.set("parallelProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: ISimplificationSettings*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: js.Array[ISimplificationSettings]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplificationType(value: SimplificationType): Self = this.set("simplificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCallback(value: () => Unit): Self = this.set("successCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSuccessCallback: Self = this.set("successCallback", js.undefined)
  }
}
