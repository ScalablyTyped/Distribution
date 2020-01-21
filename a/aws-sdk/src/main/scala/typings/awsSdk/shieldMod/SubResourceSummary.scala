package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResourceSummary extends js.Object {
  /**
    * The list of attack types and associated counters.
    */
  var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.native
  /**
    * The counters that describe the details of the attack.
    */
  var Counters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the SubResource.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The SubResource type.
    */
  var Type: js.UndefOr[SubResourceType] = js.native
}

object SubResourceSummary {
  @scala.inline
  def apply(
    AttackVectors: SummarizedAttackVectorList = null,
    Counters: SummarizedCounterList = null,
    Id: String = null,
    Type: SubResourceType = null
  ): SubResourceSummary = {
    val __obj = js.Dynamic.literal()
    if (AttackVectors != null) __obj.updateDynamic("AttackVectors")(AttackVectors.asInstanceOf[js.Any])
    if (Counters != null) __obj.updateDynamic("Counters")(Counters.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubResourceSummary]
  }
}

