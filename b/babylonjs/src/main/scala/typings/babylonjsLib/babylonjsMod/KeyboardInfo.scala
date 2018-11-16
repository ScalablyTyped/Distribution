package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is used to store keyboard related info for the onKeyboardObservable event.
     */
@JSImport("babylonjs", "KeyboardInfo")
@js.native
class KeyboardInfo protected ()
  extends babylonjsLib.BABYLONNs.KeyboardInfo {
  /**
           * Instantiates a new keyboard info.
           * This class is used to store keyboard related info for the onKeyboardObservable event.
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

