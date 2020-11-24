package typings.babylonjs.webXRHitTestMod

import typings.babylonjs.XRHitTestTrackableType
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.webXRHitTestLegacyMod.IWebXRLegacyHitTestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRHitTestOptions extends IWebXRLegacyHitTestOptions {
  
  /**
    * Do not create a permanent hit test. Will usually be used when only
    * transient inputs are needed.
    */
  var disablePermanentHitTest: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable transient (for example touch-based) hit test inspections
    */
  var enableTransientHitTest: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the default entity type(s) of the hit-test result
    */
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
  
  /**
    * Offset ray for the permanent hit test
    */
  var offsetRay: js.UndefOr[Vector3] = js.native
  
  /**
    * Offset ray for the transient hit test
    */
  var transientOffsetRay: js.UndefOr[Vector3] = js.native
  
  /**
    * Instead of using viewer space for hit tests, use the reference space defined in the session manager
    */
  var useReferenceSpace: js.UndefOr[Boolean] = js.native
}
object IWebXRHitTestOptions {
  
  @scala.inline
  def apply(): IWebXRHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRHitTestOptions]
  }
  
  @scala.inline
  implicit class IWebXRHitTestOptionsOps[Self <: IWebXRHitTestOptions] (val x: Self) extends AnyVal {
    
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
    def setDisablePermanentHitTest(value: Boolean): Self = this.set("disablePermanentHitTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePermanentHitTest: Self = this.set("disablePermanentHitTest", js.undefined)
    
    @scala.inline
    def setEnableTransientHitTest(value: Boolean): Self = this.set("enableTransientHitTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTransientHitTest: Self = this.set("enableTransientHitTest", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setOffsetRay(value: Vector3): Self = this.set("offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRay: Self = this.set("offsetRay", js.undefined)
    
    @scala.inline
    def setTransientOffsetRay(value: Vector3): Self = this.set("transientOffsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransientOffsetRay: Self = this.set("transientOffsetRay", js.undefined)
    
    @scala.inline
    def setUseReferenceSpace(value: Boolean): Self = this.set("useReferenceSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseReferenceSpace: Self = this.set("useReferenceSpace", js.undefined)
  }
}
