package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowIncomplete extends js.Object {
  def check(script: nodeLib.Buffer, allowIncomplete: scala.Boolean): scala.Boolean
}

object Anon_AllowIncomplete {
  @scala.inline
  def apply(check: js.Function2[nodeLib.Buffer, scala.Boolean, scala.Boolean]): Anon_AllowIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.asInstanceOf[Anon_AllowIncomplete]
  }
}

