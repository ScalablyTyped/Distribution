package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitTestTrackableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRHitTestOptions
  extends StObject
     with IWebXRLegacyHitTestOptions {
  
  /**
    * Do not create a permanent hit test. Will usually be used when only
    * transient inputs are needed.
    */
  var disablePermanentHitTest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable transient (for example touch-based) hit test inspections
    */
  var enableTransientHitTest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override the default entity type(s) of the hit-test result
    */
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.undefined
  
  /**
    * Offset ray for the permanent hit test
    */
  var offsetRay: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Override the default transient hit test profile (generic-touchscreen).
    */
  var transientHitTestProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Offset ray for the transient hit test
    */
  var transientOffsetRay: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Instead of using viewer space for hit tests, use the reference space defined in the session manager
    */
  var useReferenceSpace: js.UndefOr[Boolean] = js.undefined
}
object IWebXRHitTestOptions {
  
  inline def apply(): IWebXRHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRHitTestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRHitTestOptions] (val x: Self) extends AnyVal {
    
    inline def setDisablePermanentHitTest(value: Boolean): Self = StObject.set(x, "disablePermanentHitTest", value.asInstanceOf[js.Any])
    
    inline def setDisablePermanentHitTestUndefined: Self = StObject.set(x, "disablePermanentHitTest", js.undefined)
    
    inline def setEnableTransientHitTest(value: Boolean): Self = StObject.set(x, "enableTransientHitTest", value.asInstanceOf[js.Any])
    
    inline def setEnableTransientHitTestUndefined: Self = StObject.set(x, "enableTransientHitTest", js.undefined)
    
    inline def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setOffsetRay(value: Vector3): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    inline def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    inline def setTransientHitTestProfile(value: String): Self = StObject.set(x, "transientHitTestProfile", value.asInstanceOf[js.Any])
    
    inline def setTransientHitTestProfileUndefined: Self = StObject.set(x, "transientHitTestProfile", js.undefined)
    
    inline def setTransientOffsetRay(value: Vector3): Self = StObject.set(x, "transientOffsetRay", value.asInstanceOf[js.Any])
    
    inline def setTransientOffsetRayUndefined: Self = StObject.set(x, "transientOffsetRay", js.undefined)
    
    inline def setUseReferenceSpace(value: Boolean): Self = StObject.set(x, "useReferenceSpace", value.asInstanceOf[js.Any])
    
    inline def setUseReferenceSpaceUndefined: Self = StObject.set(x, "useReferenceSpace", js.undefined)
  }
}
