package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mitigation extends js.Object {
  /**
    * The name of the mitigation taken for this attack.
    */
  var MitigationName: js.UndefOr[String] = js.native
}

object Mitigation {
  @scala.inline
  def apply(MitigationName: String = null): Mitigation = {
    val __obj = js.Dynamic.literal()
    if (MitigationName != null) __obj.updateDynamic("MitigationName")(MitigationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mitigation]
  }
}

