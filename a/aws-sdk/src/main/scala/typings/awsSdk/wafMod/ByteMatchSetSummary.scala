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
}

