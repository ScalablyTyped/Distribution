package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Base class of pointer info types.
     */
@JSGlobal("BABYLON.PointerInfoBase")
@js.native
class PointerInfoBase protected () extends js.Object {
  /**
           * Instantiates the base class of pointers info.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           */
  def this(/**
           * Defines the type of event (BABYLON.PointerEventTypes)
           */
  `type`: scala.Double, /**
           * Defines the related dom event
           */
  event: stdLib.MouseWheelEvent) = this()
  /**
           * Instantiates the base class of pointers info.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           */
  def this(/**
           * Defines the type of event (BABYLON.PointerEventTypes)
           */
  `type`: scala.Double, /**
           * Defines the related dom event
           */
  event: stdLib.PointerEvent) = this()
  /**
           * Defines the related dom event
           */
  var event: stdLib.PointerEvent | stdLib.MouseWheelEvent = js.native
  /**
           * Defines the type of event (BABYLON.PointerEventTypes)
           */
  var `type`: scala.Double = js.native
}

