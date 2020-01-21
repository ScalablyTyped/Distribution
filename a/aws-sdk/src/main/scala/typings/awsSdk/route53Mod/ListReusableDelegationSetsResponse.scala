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
    MaxItems: PageMaxItems,
    NextMarker: PageMarker = null
  ): ListReusableDelegationSetsResponse = {
    val __obj = js.Dynamic.literal(DelegationSets = DelegationSets.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReusableDelegationSetsResponse]
  }
}

