package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayoutOptions extends LayoutOptions {
  var name: String = js.native
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.native
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.native
}

object BaseLayoutOptions {
  @scala.inline
  def apply(name: String): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayoutOptions]
  }
  @scala.inline
  implicit class BaseLayoutOptionsOps[Self <: BaseLayoutOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: /* e */ LayoutEventObject => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setStop(value: /* e */ LayoutEventObject => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

