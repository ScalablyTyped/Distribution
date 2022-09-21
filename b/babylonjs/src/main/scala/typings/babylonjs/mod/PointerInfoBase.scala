package typings.babylonjs.mod

import typings.babylonjs.deviceInputEventsMod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PointerInfoBase")
@js.native
open class PointerInfoBase protected ()
  extends typings.babylonjs.legacyMod.PointerInfoBase {
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
  event: IMouseEvent
  ) = this()
}
