package typings
package cliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var `0`: java.lang.String | scala.Boolean
  var `1`: java.lang.String
  var `2`: js.UndefOr[java.lang.String] = js.undefined
  var `3`: js.UndefOr[js.Any] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    `0`: java.lang.String | scala.Boolean,
    `1`: java.lang.String,
    `2`: java.lang.String = null,
    `3`: js.Any = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`)
    if (`2` != null) __obj.updateDynamic("2")(`2`)
    if (`3` != null) __obj.updateDynamic("3")(`3`)
    __obj.asInstanceOf[Anon_0]
  }
}

