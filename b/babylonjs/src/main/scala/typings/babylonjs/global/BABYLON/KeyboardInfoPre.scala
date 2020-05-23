package typings.babylonjs.global.BABYLON

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.KeyboardInfoPre")
@js.native
class KeyboardInfoPre protected ()
  extends typings.babylonjs.BABYLON.KeyboardInfoPre {
  /**
    * Instantiates a new keyboard pre info.
    * This class is used to store keyboard related info for the onPreKeyboardObservable event.
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
    * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
    */
  /* CompleteClass */
  override var skipOnPointerObservable: Boolean = js.native
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  /* CompleteClass */
  override var `type`: Double = js.native
}

