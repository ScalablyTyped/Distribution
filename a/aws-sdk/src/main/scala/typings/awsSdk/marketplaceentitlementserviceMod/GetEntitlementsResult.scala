package typings.awsSdk.marketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEntitlementsResult extends js.Object {
  /**
    * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var Entitlements: js.UndefOr[EntitlementList] = js.native
  /**
    * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object GetEntitlementsResult {
  @scala.inline
  def apply(): GetEntitlementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntitlementsResult]
  }
  @scala.inline
  implicit class GetEntitlementsResultOps[Self <: GetEntitlementsResult] (val x: Self) extends AnyVal {
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
    def setEntitlementsVarargs(value: Entitlement*): Self = this.set("Entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: EntitlementList): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlements: Self = this.set("Entitlements", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

