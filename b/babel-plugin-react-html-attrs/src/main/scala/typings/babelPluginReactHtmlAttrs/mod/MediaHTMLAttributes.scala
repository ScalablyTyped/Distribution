package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
  var controls: js.UndefOr[Boolean | String] = js.undefined
  var controlsList: js.UndefOr[String] = js.undefined
  var controlslist: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var crossorigin: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean | String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var mediagroup: js.UndefOr[String] = js.undefined
  var muted: js.UndefOr[Boolean | String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var playsinline: js.UndefOr[Boolean | String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object MediaHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoplay: Boolean | String = null,
    controls: Boolean | String = null,
    controlsList: String = null,
    controlslist: String = null,
    crossOrigin: String = null,
    crossorigin: String = null,
    loop: Boolean | String = null,
    mediaGroup: String = null,
    mediagroup: String = null,
    muted: Boolean | String = null,
    playsInline: js.UndefOr[Boolean] = js.undefined,
    playsinline: Boolean | String = null,
    preload: String = null,
    src: String = null
  ): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (controlsList != null) __obj.updateDynamic("controlsList")(controlsList.asInstanceOf[js.Any])
    if (controlslist != null) __obj.updateDynamic("controlslist")(controlslist.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup.asInstanceOf[js.Any])
    if (mediagroup != null) __obj.updateDynamic("mediagroup")(mediagroup.asInstanceOf[js.Any])
    if (muted != null) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (!js.isUndefined(playsInline)) __obj.updateDynamic("playsInline")(playsInline.get.asInstanceOf[js.Any])
    if (playsinline != null) __obj.updateDynamic("playsinline")(playsinline.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
}

