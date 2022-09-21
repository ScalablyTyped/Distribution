package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2InstanceAggregationResponse extends StObject {
  
  /**
    * The Amazon Web Services account the Amazon EC2 instance belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) of the Amazon EC2 instance.
    */
  var ami: js.UndefOr[AmiId] = js.undefined
  
  /**
    * The Amazon EC2 instance ID.
    */
  var instanceId: NonEmptyString
  
  /**
    * The tags attached to the instance.
    */
  var instanceTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The number of network findings for the Amazon EC2 instance.
    */
  var networkFindings: js.UndefOr[Long] = js.undefined
  
  /**
    * The operating system of the Amazon EC2 instance.
    */
  var operatingSystem: js.UndefOr[String] = js.undefined
  
  /**
    * An object that contains the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object Ec2InstanceAggregationResponse {
  
  inline def apply(instanceId: NonEmptyString): Ec2InstanceAggregationResponse = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2InstanceAggregationResponse]
  }
  
  extension [Self <: Ec2InstanceAggregationResponse](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAmi(value: AmiId): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
    
    inline def setAmiUndefined: Self = StObject.set(x, "ami", js.undefined)
    
    inline def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceTags(value: TagMap): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagsUndefined: Self = StObject.set(x, "instanceTags", js.undefined)
    
    inline def setNetworkFindings(value: Long): Self = StObject.set(x, "networkFindings", value.asInstanceOf[js.Any])
    
    inline def setNetworkFindingsUndefined: Self = StObject.set(x, "networkFindings", js.undefined)
    
    inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
