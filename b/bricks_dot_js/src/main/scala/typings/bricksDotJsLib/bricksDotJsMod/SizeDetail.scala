package typings
package bricksDotJsLib.bricksDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeDetail extends js.Object {
  var columns: scala.Double
  var gutter: scala.Double
  var mq: js.UndefOr[java.lang.String] = js.undefined
}

object SizeDetail {
  @scala.inline
  def apply(columns: scala.Double, gutter: scala.Double, mq: java.lang.String = null): SizeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("gutter")(gutter)
    if (mq != null) __obj.updateDynamic("mq")(mq)
    __obj.asInstanceOf[SizeDetail]
  }
}

