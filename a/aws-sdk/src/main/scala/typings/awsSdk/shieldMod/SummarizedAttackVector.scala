package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummarizedAttackVector extends js.Object {
  /**
    * The list of counters that describe the details of the attack.
    */
  var VectorCounters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The attack type, for example, SNMP reflection or SYN flood.
    */
  var VectorType: String = js.native
}

object SummarizedAttackVector {
  @scala.inline
  def apply(VectorType: String, VectorCounters: SummarizedCounterList = null): SummarizedAttackVector = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    if (VectorCounters != null) __obj.updateDynamic("VectorCounters")(VectorCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummarizedAttackVector]
  }
}

