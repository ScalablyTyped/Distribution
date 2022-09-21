package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceRecordSetsResponse extends StObject {
  
  /**
    * A flag that indicates whether more resource record sets remain to be listed. If your results were truncated, you can make a follow-up pagination request by using the NextRecordName element.
    */
  var IsTruncated: PageTruncated
  
  /**
    * The maximum number of records you requested.
    */
  var MaxItems: PageMaxItems
  
  /**
    *  Resource record sets that have a routing policy other than simple: If results were truncated for a given DNS name and type, the value of SetIdentifier for the next resource record set that has the current DNS name and type. For information about routing policies, see Choosing a Routing Policy in the Amazon Route 53 Developer Guide.
    */
  var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined
  
  /**
    * If the results were truncated, the name of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordName: js.UndefOr[DNSName] = js.undefined
  
  /**
    * If the results were truncated, the type of the next record in the list. This element is present only if IsTruncated is true. 
    */
  var NextRecordType: js.UndefOr[RRType] = js.undefined
  
  /**
    * Information about multiple resource record sets.
    */
  var ResourceRecordSets: typings.awsSdk.route53Mod.ResourceRecordSets
}
object ListResourceRecordSetsResponse {
  
  inline def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, ResourceRecordSets: ResourceRecordSets): ListResourceRecordSetsResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], ResourceRecordSets = ResourceRecordSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceRecordSetsResponse]
  }
  
  extension [Self <: ListResourceRecordSetsResponse](x: Self) {
    
    inline def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextRecordIdentifier(value: ResourceRecordSetIdentifier): Self = StObject.set(x, "NextRecordIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNextRecordIdentifierUndefined: Self = StObject.set(x, "NextRecordIdentifier", js.undefined)
    
    inline def setNextRecordName(value: DNSName): Self = StObject.set(x, "NextRecordName", value.asInstanceOf[js.Any])
    
    inline def setNextRecordNameUndefined: Self = StObject.set(x, "NextRecordName", js.undefined)
    
    inline def setNextRecordType(value: RRType): Self = StObject.set(x, "NextRecordType", value.asInstanceOf[js.Any])
    
    inline def setNextRecordTypeUndefined: Self = StObject.set(x, "NextRecordType", js.undefined)
    
    inline def setResourceRecordSets(value: ResourceRecordSets): Self = StObject.set(x, "ResourceRecordSets", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordSetsVarargs(value: ResourceRecordSet*): Self = StObject.set(x, "ResourceRecordSets", js.Array(value*))
  }
}
