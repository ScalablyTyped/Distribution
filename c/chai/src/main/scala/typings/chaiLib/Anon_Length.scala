package typings
package chaiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  val length: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(length: scala.Int | scala.Double = null): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Length]
  }
}

