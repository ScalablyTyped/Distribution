package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitTestTrackableType
import org.scalablytyped.runtime.StObject
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
  implicit class IWebXRHitTestOptionsMutableBuilder[Self <: IWebXRHitTestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisablePermanentHitTest(value: Boolean): Self = StObject.set(x, "disablePermanentHitTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePermanentHitTestUndefined: Self = StObject.set(x, "disablePermanentHitTest", js.undefined)
    
    @scala.inline
    def setEnableTransientHitTest(value: Boolean): Self = StObject.set(x, "enableTransientHitTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTransientHitTestUndefined: Self = StObject.set(x, "enableTransientHitTest", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRay(value: Vector3): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    @scala.inline
    def setTransientOffsetRay(value: Vector3): Self = StObject.set(x, "transientOffsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientOffsetRayUndefined: Self = StObject.set(x, "transientOffsetRay", js.undefined)
    
    @scala.inline
    def setUseReferenceSpace(value: Boolean): Self = StObject.set(x, "useReferenceSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseReferenceSpaceUndefined: Self = StObject.set(x, "useReferenceSpace", js.undefined)
  }
}
