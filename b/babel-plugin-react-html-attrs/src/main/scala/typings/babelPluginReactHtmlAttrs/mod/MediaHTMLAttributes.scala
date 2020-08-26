package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean | String] = js.native
  var controls: js.UndefOr[Boolean | String] = js.native
  var controlsList: js.UndefOr[String] = js.native
  var controlslist: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var crossorigin: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean | String] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var mediagroup: js.UndefOr[String] = js.native
  var muted: js.UndefOr[Boolean | String] = js.native
  var playsInline: js.UndefOr[Boolean] = js.native
  var playsinline: js.UndefOr[Boolean | String] = js.native
  var preload: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  @scala.inline
  implicit class MediaHTMLAttributesOps[Self <: MediaHTMLAttributes[_], T] (val x: Self with MediaHTMLAttributes[T]) extends AnyVal {
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setControls(value: Boolean | String): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsList(value: String): Self = this.set("controlsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsList: Self = this.set("controlsList", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setLoop(value: Boolean | String): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    @scala.inline
    def setMuted(value: Boolean | String): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

