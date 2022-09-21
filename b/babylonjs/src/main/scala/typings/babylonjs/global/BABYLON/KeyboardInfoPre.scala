package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.KeyboardInfoPre")
@js.native
open class KeyboardInfoPre protected ()
  extends StObject
     with typings.babylonjs.BABYLON.KeyboardInfoPre {
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
  event: IKeyboardEvent
  ) = this()
  
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  var event: IKeyboardEvent = js.native
  
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  /* CompleteClass */
  var `type`: Double = js.native
}
