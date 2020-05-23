package typings.bootpag.JqueryBootpag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * css class for active (default 'active')
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * css class for disabled (default 'disabled')
    */
  var disabledClass: js.UndefOr[String] = js.undefined
  /**
    * name of first (default 'FIRST')
    */
  var first: js.UndefOr[String] = js.undefined
  /**
    * css class for first (default 'first')
    */
  var firstClass: js.UndefOr[String] = js.undefined
  /**
    * do we ant first and last (default true)
    */
  var firstLastUse: js.UndefOr[Boolean] = js.undefined
  /**
    * template for pagination links (default "javascript:void(0);")
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * variable name in href template for page number (default "{{number}}")
    */
  var hrefVariable: js.UndefOr[String] = js.undefined
  /**
    * name of last (default 'LAST')
    */
  var last: js.UndefOr[String] = js.undefined
  /**
    * css class for last (default 'last')
    */
  var lastClass: js.UndefOr[String] = js.undefined
  /**
    * next/prev buttons move over one page or maximum visible pages (default true)
    */
  var leaps: js.UndefOr[Boolean] = js.undefined
  /**
    * maximum number of visible pages
    */
  var maxVisible: Double
  /**
    * next button text (default ???)
    */
  var next: js.UndefOr[String] = js.undefined
  /**
    * css class for next (default 'next')
    */
  var nextClass: js.UndefOr[String] = js.undefined
  /**
    * page to show on start
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * prev button text (default ???)
    */
  var prev: js.UndefOr[String] = js.undefined
  /**
    * css class for prev (default 'prev')
    */
  var prevClass: js.UndefOr[String] = js.undefined
  /**
    * number of pages
    */
  var total: Double
  /**
    * css class for wrap (default 'pagination')
    */
  var wrapClass: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    maxVisible: Double,
    total: Double,
    activeClass: String = null,
    disabledClass: String = null,
    first: String = null,
    firstClass: String = null,
    firstLastUse: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    hrefVariable: String = null,
    last: String = null,
    lastClass: String = null,
    leaps: js.UndefOr[Boolean] = js.undefined,
    next: String = null,
    nextClass: String = null,
    page: js.UndefOr[Double] = js.undefined,
    prev: String = null,
    prevClass: String = null,
    wrapClass: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(maxVisible = maxVisible.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (firstClass != null) __obj.updateDynamic("firstClass")(firstClass.asInstanceOf[js.Any])
    if (!js.isUndefined(firstLastUse)) __obj.updateDynamic("firstLastUse")(firstLastUse.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefVariable != null) __obj.updateDynamic("hrefVariable")(hrefVariable.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (lastClass != null) __obj.updateDynamic("lastClass")(lastClass.asInstanceOf[js.Any])
    if (!js.isUndefined(leaps)) __obj.updateDynamic("leaps")(leaps.get.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextClass != null) __obj.updateDynamic("nextClass")(nextClass.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevClass != null) __obj.updateDynamic("prevClass")(prevClass.asInstanceOf[js.Any])
    if (wrapClass != null) __obj.updateDynamic("wrapClass")(wrapClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

