package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProtectionsRequest extends js.Object {
  /**
    * The maximum number of Protection objects to be returned. If this is left blank the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of Protection objects returned could be less than MaxResults, even if there are still more Protection objects yet to return. If there are more Protection objects to return, AWS WAF will always also return a NextToken.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.native
  /**
    * The ListProtectionsRequest.NextToken value from a previous call to ListProtections. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListProtectionsRequest {
  @scala.inline
  def apply(): ListProtectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsRequest]
  }
  @scala.inline
  implicit class ListProtectionsRequestOps[Self <: ListProtectionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

