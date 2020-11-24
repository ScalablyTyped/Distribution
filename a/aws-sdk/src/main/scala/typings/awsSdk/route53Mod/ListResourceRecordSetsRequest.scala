package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceRecordSetsRequest extends js.Object {
  
  /**
    * The ID of the hosted zone that contains the resource record sets that you want to list.
    */
  var HostedZoneId: ResourceId = js.native
  
  /**
    * (Optional) The maximum number of resource records sets to include in the response body for this request. If the response includes more than maxitems resource record sets, the value of the IsTruncated element in the response is true, and the values of the NextRecordName and NextRecordType elements in the response identify the first resource record set in the next group of maxitems resource record sets.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, specify the value of NextRecordIdentifier from the previous response to get the next resource record set that has the current DNS name and type.
    */
  var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.native
  
  /**
    * The first name in the lexicographic ordering of resource record sets that you want to list. If the specified record name doesn't exist, the results begin with the first resource record set that has a name greater than the value of name.
    */
  var StartRecordName: js.UndefOr[DNSName] = js.native
  
  /**
    * The type of resource record set to begin the record listing from. Valid values for basic resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | NS | PTR | SOA | SPF | SRV | TXT  Values for weighted, latency, geolocation, and failover resource record sets: A | AAAA | CAA | CNAME | MX | NAPTR | PTR | SPF | SRV | TXT  Values for alias resource record sets:     API Gateway custom regional API or edge-optimized API: A    CloudFront distribution: A or AAAA    Elastic Beanstalk environment that has a regionalized subdomain: A    Elastic Load Balancing load balancer: A | AAAA    S3 bucket: A    VPC interface VPC endpoint: A    Another resource record set in this hosted zone: The type of the resource record set that the alias references.   Constraint: Specifying type without specifying name returns an InvalidInput error.
    */
  var StartRecordType: js.UndefOr[RRType] = js.native
}
object ListResourceRecordSetsRequest {
  
  @scala.inline
  def apply(HostedZoneId: ResourceId): ListResourceRecordSetsRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsRequest]
  }
  
  @scala.inline
  implicit class ListResourceRecordSetsRequestOps[Self <: ListResourceRecordSetsRequest] (val x: Self) extends AnyVal {
    
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
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    
    @scala.inline
    def setStartRecordIdentifier(value: ResourceRecordSetIdentifier): Self = this.set("StartRecordIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRecordIdentifier: Self = this.set("StartRecordIdentifier", js.undefined)
    
    @scala.inline
    def setStartRecordName(value: DNSName): Self = this.set("StartRecordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRecordName: Self = this.set("StartRecordName", js.undefined)
    
    @scala.inline
    def setStartRecordType(value: RRType): Self = this.set("StartRecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRecordType: Self = this.set("StartRecordType", js.undefined)
  }
}
