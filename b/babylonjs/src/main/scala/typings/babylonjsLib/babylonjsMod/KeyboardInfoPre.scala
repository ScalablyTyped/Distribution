package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is used to store keyboard related info for the onPreKeyboardObservable event.
     * Set the skipOnKeyboardObservable property to true if you want the engine to stop any process after this event is triggered, even not calling onKeyboardObservable
     */
@JSImport("babylonjs", "KeyboardInfoPre")
@js.native
class KeyboardInfoPre protected ()
  extends babylonjsLib.BABYLONNs.KeyboardInfoPre {
  /**
           * Instantiates a new keyboard pre info.
           * This class is used to store keyboard related info for the onPreKeyboardObservable event.
           * @param type Defines the type of event (BABYLON.KeyboardEventTypes)
           * @param event Defines the related dom event
           */
  def this(/**
           * Defines the type of event (BABYLON.KeyboardEventTypes)
           */
  `type`: scala.Double, /**
           * Defines the related dom event
           */
  event: stdLib.KeyboardEvent) = this()
}

