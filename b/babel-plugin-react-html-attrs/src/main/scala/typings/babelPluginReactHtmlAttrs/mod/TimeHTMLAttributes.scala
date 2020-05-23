package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeHTMLAttributes[T] extends HTMLAttributes[T] {
  var dateTime: js.UndefOr[String] = js.undefined
  var datetime: js.UndefOr[String] = js.undefined
}

object TimeHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, dateTime: String = null, datetime: String = null): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
}

