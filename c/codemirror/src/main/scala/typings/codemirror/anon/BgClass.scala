package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BgClass extends js.Object {
  var bgClass: String = js.native
  /** Object mapping gutter IDs to marker elements. */
  var gutterMarkers: js.Any = js.native
  var handle: js.Any = js.native
  var line: js.Any = js.native
  var text: String = js.native
  var textClass: String = js.native
  /** Array of line widgets attached to this line. */
  var widgets: js.Any = js.native
  var wrapClass: String = js.native
}

object BgClass {
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
  ): BgClass = {
    val __obj = js.Dynamic.literal(bgClass = bgClass.asInstanceOf[js.Any], gutterMarkers = gutterMarkers.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textClass = textClass.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], wrapClass = wrapClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgClass]
  }
  @scala.inline
  implicit class BgClassOps[Self <: BgClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBgClass(value: String): Self = this.set("bgClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutterMarkers(value: js.Any): Self = this.set("gutterMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: js.Any): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextClass(value: String): Self = this.set("textClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidgets(value: js.Any): Self = this.set("widgets", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapClass(value: String): Self = this.set("wrapClass", value.asInstanceOf[js.Any])
  }
  
}

