package typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod

import typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.UnmarshalledDataRetrievalRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDataRetrievalPolicy extends DataRetrievalPolicy {
  /**
    * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
    */
  @JSName("Rules")
  var Rules_UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[UnmarshalledDataRetrievalRule]] = js.native
}

object UnmarshalledDataRetrievalPolicy {
  @scala.inline
  def apply(): UnmarshalledDataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDataRetrievalPolicy]
  }
  @scala.inline
  implicit class UnmarshalledDataRetrievalPolicyOps[Self <: UnmarshalledDataRetrievalPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRulesVarargs(value: UnmarshalledDataRetrievalRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[UnmarshalledDataRetrievalRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

