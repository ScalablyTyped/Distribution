package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDefaultExperienceOptions extends js.Object {
  
  /**
    * Enable or disable default UI to enter XR
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  
  /**
    * Should teleportation not initialize. defaults to false.
    */
  var disableTeleportation: js.UndefOr[Boolean] = js.native
  
  /**
    * Floor meshes that will be used for teleport
    */
  var floorMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  
  /**
    * If set to true, the first frame will not be used to reset position
    * The first frame is mainly used when copying transformation from the old camera
    * Mainly used in AR
    */
  var ignoreNativeCameraTransformation: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the controller mesh-loading. Can be used if you want to load your own meshes
    */
  var inputOptions: js.UndefOr[IWebXRInputOptions] = js.native
  
  /**
    * A list of optional features to init the session with
    * If set to true, all features we support will be added
    */
  var optionalFeatures: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * optional configuration for the output canvas
    */
  var outputCanvasOptions: js.UndefOr[WebXRManagedOutputCanvasOptions] = js.native
  
  /**
    * An optional rendering group id that will be set globally for teleportation, pointer selection and default controller meshes
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  
  /**
    * optional UI options. This can be used among other to change session mode and reference space type
    */
  var uiOptions: js.UndefOr[WebXREnterExitUIOptions] = js.native
  
  /**
    * When loading teleportation and pointer select, use stable versions instead of latest.
    */
  var useStablePlugins: js.UndefOr[Boolean] = js.native
}
object WebXRDefaultExperienceOptions {
  
  @scala.inline
  def apply(): WebXRDefaultExperienceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRDefaultExperienceOptions]
  }
  
  @scala.inline
  implicit class WebXRDefaultExperienceOptionsOps[Self <: WebXRDefaultExperienceOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableDefaultUI(value: Boolean): Self = this.set("disableDefaultUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDefaultUI: Self = this.set("disableDefaultUI", js.undefined)
    
    @scala.inline
    def setDisableTeleportation(value: Boolean): Self = this.set("disableTeleportation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTeleportation: Self = this.set("disableTeleportation", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: AbstractMesh*): Self = this.set("floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setFloorMeshes(value: js.Array[AbstractMesh]): Self = this.set("floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorMeshes: Self = this.set("floorMeshes", js.undefined)
    
    @scala.inline
    def setIgnoreNativeCameraTransformation(value: Boolean): Self = this.set("ignoreNativeCameraTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNativeCameraTransformation: Self = this.set("ignoreNativeCameraTransformation", js.undefined)
    
    @scala.inline
    def setInputOptions(value: IWebXRInputOptions): Self = this.set("inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputOptions: Self = this.set("inputOptions", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = this.set("optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFeatures(value: Boolean | js.Array[String]): Self = this.set("optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFeatures: Self = this.set("optionalFeatures", js.undefined)
    
    @scala.inline
    def setOutputCanvasOptions(value: WebXRManagedOutputCanvasOptions): Self = this.set("outputCanvasOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputCanvasOptions: Self = this.set("outputCanvasOptions", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingGroupId: Self = this.set("renderingGroupId", js.undefined)
    
    @scala.inline
    def setUiOptions(value: WebXREnterExitUIOptions): Self = this.set("uiOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiOptions: Self = this.set("uiOptions", js.undefined)
    
    @scala.inline
    def setUseStablePlugins(value: Boolean): Self = this.set("useStablePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStablePlugins: Self = this.set("useStablePlugins", js.undefined)
  }
}
