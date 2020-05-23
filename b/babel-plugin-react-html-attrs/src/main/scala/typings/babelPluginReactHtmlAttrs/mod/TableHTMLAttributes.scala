package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var cellpadding: js.UndefOr[Double | String] = js.undefined
  var cellspacing: js.UndefOr[Double | String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
}

object TableHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    cellPadding: Double | String = null,
    cellSpacing: Double | String = null,
    cellpadding: Double | String = null,
    cellspacing: Double | String = null,
    summary: String = null
  ): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (cellpadding != null) __obj.updateDynamic("cellpadding")(cellpadding.asInstanceOf[js.Any])
    if (cellspacing != null) __obj.updateDynamic("cellspacing")(cellspacing.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
}

