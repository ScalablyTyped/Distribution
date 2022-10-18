package typings.babylonjs.indexMod

import typings.babylonjs.eventsDeviceInputEventsMod.IKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "KeyboardInfo")
@js.native
open class KeyboardInfo protected ()
  extends typings.babylonjs.eventsIndexMod.KeyboardInfo {
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
  event: IKeyboardEvent
  ) = this()
}
