package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Use \`{@link JQuery.Event }\`.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cypressLib.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  var char: js.Any = js.native
  var charCode: scala.Double = js.native
  var key: js.Any = js.native
  var keyCode: scala.Double = js.native
}

