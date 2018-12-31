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

