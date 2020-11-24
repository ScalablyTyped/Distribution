package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostedZonesByNameResponse extends js.Object {
  
  /**
    * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
    */
  var DNSName: js.UndefOr[typings.awsSdk.route53Mod.DNSName] = js.native
  
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
  
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsSdk.route53Mod.HostedZones = js.native
  
  /**
    * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextDNSName: js.UndefOr[DNSName] = js.native
  
  /**
    * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextHostedZoneId: js.UndefOr[ResourceId] = js.native
}
object ListHostedZonesByNameResponse {
  
  @scala.inline
  def apply(HostedZones: HostedZones, IsTruncated: PageTruncated, MaxItems: PageMaxItems): ListHostedZonesByNameResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByNameResponse]
  }
  
  @scala.inline
  implicit class ListHostedZonesByNameResponseOps[Self <: ListHostedZonesByNameResponse] (val x: Self) extends AnyVal {
    
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
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSName(value: DNSName): Self = this.set("DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDNSName: Self = this.set("DNSName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
    
    @scala.inline
    def setNextDNSName(value: DNSName): Self = this.set("NextDNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextDNSName: Self = this.set("NextDNSName", js.undefined)
    
    @scala.inline
    def setNextHostedZoneId(value: ResourceId): Self = this.set("NextHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextHostedZoneId: Self = this.set("NextHostedZoneId", js.undefined)
  }
}
