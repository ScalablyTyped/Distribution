package typings.bootpag.JqueryBootpag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * css class for active (default 'active')
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * css class for disabled (default 'disabled')
    */
  var disabledClass: js.UndefOr[String] = js.native
  /**
    * name of first (default 'FIRST')
    */
  var first: js.UndefOr[String] = js.native
  /**
    * css class for first (default 'first')
    */
  var firstClass: js.UndefOr[String] = js.native
  /**
    * do we ant first and last (default true)
    */
  var firstLastUse: js.UndefOr[Boolean] = js.native
  /**
    * template for pagination links (default "javascript:void(0);")
    */
  var href: js.UndefOr[String] = js.native
  /**
    * variable name in href template for page number (default "{{number}}")
    */
  var hrefVariable: js.UndefOr[String] = js.native
  /**
    * name of last (default 'LAST')
    */
  var last: js.UndefOr[String] = js.native
  /**
    * css class for last (default 'last')
    */
  var lastClass: js.UndefOr[String] = js.native
  /**
    * next/prev buttons move over one page or maximum visible pages (default true)
    */
  var leaps: js.UndefOr[Boolean] = js.native
  /**
    * maximum number of visible pages
    */
  var maxVisible: Double = js.native
  /**
    * next button text (default ???)
    */
  var next: js.UndefOr[String] = js.native
  /**
    * css class for next (default 'next')
    */
  var nextClass: js.UndefOr[String] = js.native
  /**
    * page to show on start
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * prev button text (default ???)
    */
  var prev: js.UndefOr[String] = js.native
  /**
    * css class for prev (default 'prev')
    */
  var prevClass: js.UndefOr[String] = js.native
  /**
    * number of pages
    */
  var total: Double = js.native
  /**
    * css class for wrap (default 'pagination')
    */
  var wrapClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(maxVisible: Double, total: Double): Options = {
    val __obj = js.Dynamic.literal(maxVisible = maxVisible.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMaxVisible(value: Double): Self = this.set("maxVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    @scala.inline
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setFirstClass(value: String): Self = this.set("firstClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstClass: Self = this.set("firstClass", js.undefined)
    @scala.inline
    def setFirstLastUse(value: Boolean): Self = this.set("firstLastUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstLastUse: Self = this.set("firstLastUse", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefVariable(value: String): Self = this.set("hrefVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefVariable: Self = this.set("hrefVariable", js.undefined)
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setLastClass(value: String): Self = this.set("lastClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastClass: Self = this.set("lastClass", js.undefined)
    @scala.inline
    def setLeaps(value: Boolean): Self = this.set("leaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaps: Self = this.set("leaps", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNextClass(value: String): Self = this.set("nextClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextClass: Self = this.set("nextClass", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setPrevClass(value: String): Self = this.set("prevClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevClass: Self = this.set("prevClass", js.undefined)
    @scala.inline
    def setWrapClass(value: String): Self = this.set("wrapClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapClass: Self = this.set("wrapClass", js.undefined)
  }
  
}

