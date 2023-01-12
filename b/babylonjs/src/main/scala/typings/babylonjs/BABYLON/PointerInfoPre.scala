package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerInfoPre
  extends StObject
     with PointerInfoBase {
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2
  
  /**
    * Defines picking info coming from a near interaction (proximity instead of ray-based picking)
    */
  var nearInteractionPickingInfo: Nullable[PickingInfo]
  
  /**
    * The original picking info that was used to trigger the pointer event
    */
  var originalPickingInfo: Nullable[PickingInfo]
  
  /**
    * Ray from a pointer if available (eg. 6dof controller)
    */
  var ray: Nullable[Ray]
  
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean
}
object PointerInfoPre {
  
  inline def apply(event: IMouseEvent, localPosition: Vector2, skipOnPointerObservable: Boolean, `type`: Double): PointerInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any], nearInteractionPickingInfo = null, originalPickingInfo = null, ray = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoPre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerInfoPre] (val x: Self) extends AnyVal {
    
    inline def setLocalPosition(value: Vector2): Self = StObject.set(x, "localPosition", value.asInstanceOf[js.Any])
    
    inline def setNearInteractionPickingInfo(value: Nullable[PickingInfo]): Self = StObject.set(x, "nearInteractionPickingInfo", value.asInstanceOf[js.Any])
    
    inline def setNearInteractionPickingInfoNull: Self = StObject.set(x, "nearInteractionPickingInfo", null)
    
    inline def setOriginalPickingInfo(value: Nullable[PickingInfo]): Self = StObject.set(x, "originalPickingInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginalPickingInfoNull: Self = StObject.set(x, "originalPickingInfo", null)
    
    inline def setRay(value: Nullable[Ray]): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
    
    inline def setRayNull: Self = StObject.set(x, "ray", null)
    
    inline def setSkipOnPointerObservable(value: Boolean): Self = StObject.set(x, "skipOnPointerObservable", value.asInstanceOf[js.Any])
  }
}
