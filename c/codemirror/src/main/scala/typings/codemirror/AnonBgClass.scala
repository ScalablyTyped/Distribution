package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBgClass extends js.Object {
  var bgClass: String
  /** Object mapping gutter IDs to marker elements. */
  var gutterMarkers: js.Any
  var handle: js.Any
  var line: js.Any
  var text: String
  var textClass: String
  /** Array of line widgets attached to this line. */
  var widgets: js.Any
  var wrapClass: String
}

object AnonBgClass {
  @scala.inline
  def apply(
    bgClass: String,
    gutterMarkers: js.Any,
    handle: js.Any,
    line: js.Any,
    text: String,
    textClass: String,
    widgets: js.Any,
    wrapClass: String
  ): AnonBgClass = {
    val __obj = js.Dynamic.literal(bgClass = bgClass.asInstanceOf[js.Any], gutterMarkers = gutterMarkers.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textClass = textClass.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], wrapClass = wrapClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBgClass]
  }
}

