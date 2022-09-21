package typings.babylonjs.indexMod

import typings.babylonjs.deviceInputEventsMod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PointerInfoPre")
@js.native
open class PointerInfoPre protected ()
  extends typings.babylonjs.eventsIndexMod.PointerInfoPre {
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: Double, event: IMouseEvent, localX: Double, localY: Double) = this()
}
