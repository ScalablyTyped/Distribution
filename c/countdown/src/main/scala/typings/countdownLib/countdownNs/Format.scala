package typings
package countdownLib.countdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var delim: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var formatNumber: js.UndefOr[js.Function1[/* value */ scala.Double, java.lang.String]] = js.undefined
  var formatter: js.UndefOr[
    js.Function2[/* value */ scala.Double, /* unit */ scala.Double, java.lang.String]
  ] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var plural: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var singular: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

