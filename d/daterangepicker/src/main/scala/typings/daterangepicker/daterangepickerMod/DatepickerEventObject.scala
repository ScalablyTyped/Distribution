package typings.daterangepicker.daterangepickerMod

import typings.jquery.JQueryMouseEventObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.jquery.BaseJQueryEventObject because Already inherited
- typings.jquery.JQueryInputEventObject because Already inherited
- typings.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait DatepickerEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: String = js.native
  /** @deprecated */
  var charCode: Double = js.native
  var date: Date = js.native
  var key: String = js.native
  /** @deprecated */
  var keyCode: Double = js.native
  def format(): String = js.native
  def format(format: String): String = js.native
}

