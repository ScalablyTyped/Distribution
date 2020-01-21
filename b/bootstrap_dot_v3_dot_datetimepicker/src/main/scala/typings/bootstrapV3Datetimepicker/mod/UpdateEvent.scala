package typings.bootstrapV3Datetimepicker.mod

import typings.jquery.JQueryMouseEventObject
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event_ because Already inherited
- typings.jquery.BaseJQueryEventObject because Already inherited
- typings.jquery.JQueryInputEventObject because Already inherited
- typings.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait UpdateEvent extends JQueryMouseEventObject {
  /** Change type as a momentjs format token. e.g. yyyy on year change */
  var change: String = js.native
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
  /** New viewDate. */
  var viewDate: Moment = js.native
}

