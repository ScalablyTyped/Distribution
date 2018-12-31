package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectNull extends js.Object {
  /**
    * Set if null data point will be connected or not.
    * If true set, the region of null data will be connected without any data point. If false set, the region of null data will not be connected and get empty.
    */
  var connectNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change step type for step chart. 'step', 'step-before' and 'step-after' can be used.
    */
  var step: js.UndefOr[Anon_Type] = js.undefined
}

