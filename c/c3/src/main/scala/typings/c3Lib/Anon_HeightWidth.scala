package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_HeightWidth extends js.Object {
  /**
           * The desired height of the chart element.
           * If this option is not specified, the height of the chart will be calculated by the size of the parent element it's appended to.
           */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
           * The desired width of the chart element.
           * If this option is not specified, the width of the chart will be calculated by the size of the parent element it's appended to.
           * Note: This option should be specified if possible because it can improve its performance because some size calculations will be skipped by an explicit value.
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

