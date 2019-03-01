package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Se extends js.Object {
  var se: java.lang.String
  var sig: java.lang.String
  var sp: java.lang.String
  var sr: java.lang.String
  var sv: java.lang.String
}

object Anon_Se {
  @scala.inline
  def apply(
    se: java.lang.String,
    sig: java.lang.String,
    sp: java.lang.String,
    sr: java.lang.String,
    sv: java.lang.String
  ): Anon_Se = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("se")(se)
    __obj.updateDynamic("sig")(sig)
    __obj.updateDynamic("sp")(sp)
    __obj.updateDynamic("sr")(sr)
    __obj.updateDynamic("sv")(sv)
    __obj.asInstanceOf[Anon_Se]
  }
}

