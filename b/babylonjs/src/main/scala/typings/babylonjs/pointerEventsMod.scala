package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.typesMod.Nullable
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes")
  @js.native
  class PointerEventTypes () extends StObject
  /* static members */
  object PointerEventTypes {
    
    /**
      * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERDOUBLETAP")
    @js.native
    val POINTERDOUBLETAP: Double = js.native
    
    /**
      * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERDOWN")
    @js.native
    val POINTERDOWN: Double = js.native
    
    /**
      * The pointermove event is fired when a pointer changes coordinates.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERMOVE")
    @js.native
    val POINTERMOVE: Double = js.native
    
    /**
      * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERPICK")
    @js.native
    val POINTERPICK: Double = js.native
    
    /**
      * The pointertap event is fired when a the object has been touched and released without drag.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERTAP")
    @js.native
    val POINTERTAP: Double = js.native
    
    /**
      * The pointerup event is fired when a pointer is no longer active.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERUP")
    @js.native
    val POINTERUP: Double = js.native
    
    /**
      * The pointerwheel event is fired when a mouse wheel has been rotated.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERWHEEL")
    @js.native
    val POINTERWHEEL: Double = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfo")
  @js.native
  class PointerInfo protected () extends PointerInfoBase {
    def this(
      `type`: Double,
      event: MouseWheelEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
    /**
      * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param pickInfo Defines the picking info associated to the info (if any)\
      */
    def this(
      `type`: Double,
      event: PointerEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
    
    /**
      * Defines the picking info associated to the info (if any)\
      */
    var pickInfo: Nullable[PickingInfo] = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfoBase")
  @js.native
  class PointerInfoBase protected () extends StObject {
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: MouseWheelEvent
    ) = this()
    /**
      * Instantiates the base class of pointers info.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: PointerEvent
    ) = this()
    
    /**
      * Defines the related dom event
      */
    var event: PointerEvent | MouseWheelEvent = js.native
    
    /**
      * Defines the type of event (PointerEventTypes)
      */
    var `type`: Double = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfoPre")
  @js.native
  class PointerInfoPre protected () extends PointerInfoBase {
    def this(`type`: Double, event: MouseWheelEvent, localX: Double, localY: Double) = this()
    /**
      * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param localX Defines the local x coordinates of the pointer when the event occured
      * @param localY Defines the local y coordinates of the pointer when the event occured
      */
    def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
    
    /**
      * Defines the local position of the pointer on the canvas.
      */
    var localPosition: Vector2 = js.native
    
    /**
      * Ray from a pointer if availible (eg. 6dof controller)
      */
    var ray: Nullable[Ray] = js.native
    
    /**
      * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
      */
    var skipOnPointerObservable: Boolean = js.native
  }
  
  trait PointerTouch extends StObject {
    
    /**
      * Id of touch. Unique for each finger.
      */
    var pointerId: Double
    
    /**
      * Event type passed from DOM.
      */
    var `type`: js.Any
    
    /**
      * X coordinate of touch.
      */
    var x: Double
    
    /**
      * Y coordinate of touch.
      */
    var y: Double
  }
  object PointerTouch {
    
    inline def apply(pointerId: Double, `type`: js.Any, x: Double, y: Double): PointerTouch = {
      val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerTouch]
    }
    
    extension [Self <: PointerTouch](x: Self) {
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
