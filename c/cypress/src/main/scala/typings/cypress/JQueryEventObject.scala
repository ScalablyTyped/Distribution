package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Use \`{@link JQuery.Event }\`.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.cypress.BaseJQueryEventObject because Already inherited
- typings.cypress.JQueryInputEventObject because Already inherited
- typings.cypress.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  var char: js.Any = js.native
  var charCode: Double = js.native
  var key: js.Any = js.native
  var keyCode: Double = js.native
}

