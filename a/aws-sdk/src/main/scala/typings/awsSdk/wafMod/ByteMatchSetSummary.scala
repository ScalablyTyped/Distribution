package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetSummary extends js.Object {
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet, update a ByteMatchSet, remove a ByteMatchSet from a Rule, and delete a ByteMatchSet from AWS WAF.  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: ResourceName = js.native
}

object ByteMatchSetSummary {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, Name: ResourceName): ByteMatchSetSummary = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetSummary]
  }
  @scala.inline
  implicit class ByteMatchSetSummaryOps[Self <: ByteMatchSetSummary] (val x: Self) extends AnyVal {
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
    def setByteMatchSetId(value: ResourceId): Self = this.set("ByteMatchSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

