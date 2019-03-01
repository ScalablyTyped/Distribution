package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basis extends js.Object {
  /**
    * Set custom spline interpolation
    */
  var `type`: js.UndefOr[
    c3Lib.c3LibStrings.linear | c3Lib.c3LibStrings.`linear-closed` | c3Lib.c3LibStrings.basis | c3Lib.c3LibStrings.`basis-open` | c3Lib.c3LibStrings.`basis-closed` | c3Lib.c3LibStrings.bundle | c3Lib.c3LibStrings.cardinal | c3Lib.c3LibStrings.`cardinal-open` | c3Lib.c3LibStrings.`cardinal-closed` | c3Lib.c3LibStrings.monotone
  ] = js.undefined
}

object Anon_Basis {
  @scala.inline
  def apply(
    `type`: c3Lib.c3LibStrings.linear | c3Lib.c3LibStrings.`linear-closed` | c3Lib.c3LibStrings.basis | c3Lib.c3LibStrings.`basis-open` | c3Lib.c3LibStrings.`basis-closed` | c3Lib.c3LibStrings.bundle | c3Lib.c3LibStrings.cardinal | c3Lib.c3LibStrings.`cardinal-open` | c3Lib.c3LibStrings.`cardinal-closed` | c3Lib.c3LibStrings.monotone = null
  ): Anon_Basis = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Basis]
  }
}

