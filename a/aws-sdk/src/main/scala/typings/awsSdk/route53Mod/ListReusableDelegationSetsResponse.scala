package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReusableDelegationSetsResponse extends js.Object {
  /**
    * A complex type that contains one DelegationSet element for each reusable delegation set that was created by the current AWS account.
    */
  var DelegationSets: typings.awsSdk.route53Mod.DelegationSets = js.native
  /**
    * A flag that indicates whether there are more reusable delegation sets to be listed.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * For the second and subsequent calls to ListReusableDelegationSets, Marker is the value that you specified for the marker parameter in the request that produced the current response.
    */
  var Marker: PageMarker = js.native
  /**
    * The value that you specified for the maxitems parameter in the call to ListReusableDelegationSets that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, the value of NextMarker identifies the next reusable delegation set that Amazon Route 53 will return if you submit another ListReusableDelegationSets request and specify the value of NextMarker in the marker parameter.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.native
}

object ListReusableDelegationSetsResponse {
  @scala.inline
  def apply(
    DelegationSets: DelegationSets,
    IsTruncated: PageTruncated,
    Marker: PageMarker,
    MaxItems: PageMaxItems
  ): ListReusableDelegationSetsResponse = {
    val __obj = js.Dynamic.literal(DelegationSets = DelegationSets.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReusableDelegationSetsResponse]
  }
  @scala.inline
  implicit class ListReusableDelegationSetsResponseOps[Self <: ListReusableDelegationSetsResponse] (val x: Self) extends AnyVal {
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
    def setDelegationSetsVarargs(value: DelegationSet*): Self = this.set("DelegationSets", js.Array(value :_*))
    @scala.inline
    def setDelegationSets(value: DelegationSets): Self = this.set("DelegationSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: PageMarker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMarker(value: PageMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

