package typings.braftEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alt extends js.Object {
  var alt: String = js.native
  var autoPlay: Boolean = js.native
  var controls: Boolean = js.native
  var id: String = js.native
  var loop: Boolean = js.native
  var poster: String = js.native
  var title: String = js.native
}

object Alt {
  @scala.inline
  def apply(
    alt: String,
    autoPlay: Boolean,
    controls: Boolean,
    id: String,
    loop: Boolean,
    poster: String,
    title: String
  ): Alt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  @scala.inline
  implicit class AltOps[Self <: Alt] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

