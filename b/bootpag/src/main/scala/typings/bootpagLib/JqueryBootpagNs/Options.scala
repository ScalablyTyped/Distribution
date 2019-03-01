package typings
package bootpagLib.JqueryBootpagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * css class for active (default 'active')
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class for disabled (default 'disabled')
    */
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * name of first (default 'FIRST')
    */
  var first: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class for first (default 'first')
    */
  var firstClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * do we ant first and last (default true)
    */
  var firstLastUse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * template for pagination links (default "javascript:void(0);")
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * variable name in href template for page number (default "{{number}}")
    */
  var hrefVariable: js.UndefOr[java.lang.String] = js.undefined
  /**
    * name of last (default 'LAST')
    */
  var last: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class for last (default 'last')
    */
  var lastClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * next/prev buttons move over one page or maximum visible pages (default true)
    */
  var leaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * maximum number of visible pages
    */
  var maxVisible: scala.Double
  /**
    * next button text (default ???)
    */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class for next (default 'next')
    */
  var nextClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * page to show on start
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * prev button text (default ???)
    */
  var prev: js.UndefOr[java.lang.String] = js.undefined
  /**
    * css class for prev (default 'prev')
    */
  var prevClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * number of pages
    */
  var total: scala.Double
  /**
    * css class for wrap (default 'pagination')
    */
  var wrapClass: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maxVisible: scala.Double,
    total: scala.Double,
    activeClass: java.lang.String = null,
    disabledClass: java.lang.String = null,
    first: java.lang.String = null,
    firstClass: java.lang.String = null,
    firstLastUse: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    hrefVariable: java.lang.String = null,
    last: java.lang.String = null,
    lastClass: java.lang.String = null,
    leaps: js.UndefOr[scala.Boolean] = js.undefined,
    next: java.lang.String = null,
    nextClass: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    prev: java.lang.String = null,
    prevClass: java.lang.String = null,
    wrapClass: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxVisible")(maxVisible)
    __obj.updateDynamic("total")(total)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (first != null) __obj.updateDynamic("first")(first)
    if (firstClass != null) __obj.updateDynamic("firstClass")(firstClass)
    if (!js.isUndefined(firstLastUse)) __obj.updateDynamic("firstLastUse")(firstLastUse)
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefVariable != null) __obj.updateDynamic("hrefVariable")(hrefVariable)
    if (last != null) __obj.updateDynamic("last")(last)
    if (lastClass != null) __obj.updateDynamic("lastClass")(lastClass)
    if (!js.isUndefined(leaps)) __obj.updateDynamic("leaps")(leaps)
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextClass != null) __obj.updateDynamic("nextClass")(nextClass)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (prevClass != null) __obj.updateDynamic("prevClass")(prevClass)
    if (wrapClass != null) __obj.updateDynamic("wrapClass")(wrapClass)
    __obj.asInstanceOf[Options]
  }
}

