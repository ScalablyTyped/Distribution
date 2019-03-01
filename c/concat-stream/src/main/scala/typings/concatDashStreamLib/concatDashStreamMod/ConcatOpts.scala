package typings
package concatDashStreamLib.concatDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatOpts extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
}

object ConcatOpts {
  @scala.inline
  def apply(encoding: java.lang.String = null): ConcatOpts = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[ConcatOpts]
  }
}

