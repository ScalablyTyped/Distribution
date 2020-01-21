package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceRecordSetsResponse extends js.Object {
  /**
    * A flag that indicates whether more resource record sets remain to be listed. If your results were truncated, you can make a follow-up pagination request by using the NextRecordName element.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The maximum number of records you requested.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, the value of SetIdentifier for the next resource record set that has the current DNS name and type. For information about routing policies, see Choosing a Routing Policy in the Amazon Route 53 Developer Guide.
    */
  var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.native
  /**
    * If the results were truncated, the name of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordName: js.UndefOr[DNSName] = js.native
  /**
    * If the results were truncated, the type of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordType: js.UndefOr[RRType] = js.native
  /**
    * Information about multiple resource record sets.
    */
  var ResourceRecordSets: typings.awsSdk.route53Mod.ResourceRecordSets = js.native
}

object ListResourceRecordSetsResponse {
  @scala.inline
  def apply(
    IsTruncated: PageTruncated,
    MaxItems: PageMaxItems,
    ResourceRecordSets: ResourceRecordSets,
    NextRecordIdentifier: ResourceRecordSetIdentifier = null,
    NextRecordName: DNSName = null,
    NextRecordType: RRType = null
  ): ListResourceRecordSetsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], ResourceRecordSets = ResourceRecordSets.asInstanceOf[js.Any])
    if (NextRecordIdentifier != null) __obj.updateDynamic("NextRecordIdentifier")(NextRecordIdentifier.asInstanceOf[js.Any])
    if (NextRecordName != null) __obj.updateDynamic("NextRecordName")(NextRecordName.asInstanceOf[js.Any])
    if (NextRecordType != null) __obj.updateDynamic("NextRecordType")(NextRecordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsResponse]
  }
}

