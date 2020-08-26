package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedZonesResponse extends js.Object {
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsSdk.route53Mod.HostedZones = js.native
  /**
    * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get more hosted zones by submitting another ListHostedZones request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker parameter in the request that produced the current response.
    */
  var Marker: PageMarker = js.native
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZones that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, the value of NextMarker identifies the first hosted zone in the next group of hosted zones. Submit another ListHostedZones request, and specify the value of NextMarker from the response in the marker parameter. This element is present only if IsTruncated is true.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.native
}

object ListHostedZonesResponse {
  @scala.inline
  def apply(HostedZones: HostedZones, IsTruncated: PageTruncated, Marker: PageMarker, MaxItems: PageMaxItems): ListHostedZonesResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesResponse]
  }
  @scala.inline
  implicit class ListHostedZonesResponseOps[Self <: ListHostedZonesResponse] (val x: Self) extends AnyVal {
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
    def setHostedZonesVarargs(value: HostedZone*): Self = this.set("HostedZones", js.Array(value :_*))
    @scala.inline
    def setHostedZones(value: HostedZones): Self = this.set("HostedZones", value.asInstanceOf[js.Any])
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

