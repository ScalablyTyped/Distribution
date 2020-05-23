package typings.babylonjs.global.BABYLON

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.KeyboardInfo")
@js.native
class KeyboardInfo protected ()
  extends typings.babylonjs.BABYLON.KeyboardInfo {
  /**
    * Instantiates a new keyboard info.
    * This class is used to store keyboard related info for the onKeyboardObservable event.
    * @param type Defines the type of event (KeyboardEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (KeyboardEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: KeyboardEvent
  ) = this()
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  override var event: KeyboardEvent = js.native
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  /* CompleteClass */
  override var `type`: Double = js.native
}

