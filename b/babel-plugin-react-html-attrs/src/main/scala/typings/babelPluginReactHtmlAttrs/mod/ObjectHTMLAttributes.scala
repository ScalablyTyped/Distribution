package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectHTMLAttributes[T] extends HTMLAttributes[T] {
  var classID: js.UndefOr[String] = js.undefined
  var classid: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var usemap: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
}

object ObjectHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    classID: String = null,
    classid: String = null,
    data: String = null,
    form: String = null,
    height: Double | String = null,
    name: String = null,
    `type`: String = null,
    useMap: String = null,
    usemap: String = null,
    width: Double | String = null,
    wmode: String = null
  ): ObjectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (classID != null) __obj.updateDynamic("classID")(classID.asInstanceOf[js.Any])
    if (classid != null) __obj.updateDynamic("classid")(classid.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (usemap != null) __obj.updateDynamic("usemap")(usemap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectHTMLAttributes[T]]
  }
}

