package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterRequest extends StObject {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.undefined
  
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.undefined
  
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * The unique ID of the detector of the GuardDuty account that you want to create a filter for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * Represents the criteria to be used in the filter for querying findings. You can only use the following attributes to query findings:   accountId   region   confidence   id   resource.accessKeyDetails.accessKeyId   resource.accessKeyDetails.principalId   resource.accessKeyDetails.userName   resource.accessKeyDetails.userType   resource.instanceDetails.iamInstanceProfile.id   resource.instanceDetails.imageId   resource.instanceDetails.instanceId   resource.instanceDetails.outpostArn   resource.instanceDetails.networkInterfaces.ipv6Addresses   resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress   resource.instanceDetails.networkInterfaces.publicDnsName   resource.instanceDetails.networkInterfaces.publicIp   resource.instanceDetails.networkInterfaces.securityGroups.groupId   resource.instanceDetails.networkInterfaces.securityGroups.groupName   resource.instanceDetails.networkInterfaces.subnetId   resource.instanceDetails.networkInterfaces.vpcId   resource.instanceDetails.tags.key   resource.instanceDetails.tags.value   resource.resourceType   service.action.actionType   service.action.awsApiCallAction.api   service.action.awsApiCallAction.callerType   service.action.awsApiCallAction.remoteIpDetails.city.cityName   service.action.awsApiCallAction.remoteIpDetails.country.countryName   service.action.awsApiCallAction.remoteIpDetails.ipAddressV4   service.action.awsApiCallAction.remoteIpDetails.organization.asn   service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg   service.action.awsApiCallAction.serviceName   service.action.dnsRequestAction.domain   service.action.networkConnectionAction.blocked   service.action.networkConnectionAction.connectionDirection   service.action.networkConnectionAction.localPortDetails.port   service.action.networkConnectionAction.protocol   service.action.networkConnectionAction.localIpDetails.ipAddressV4   service.action.networkConnectionAction.remoteIpDetails.city.cityName   service.action.networkConnectionAction.remoteIpDetails.country.countryName   service.action.networkConnectionAction.remoteIpDetails.ipAddressV4   service.action.networkConnectionAction.remoteIpDetails.organization.asn   service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg   service.action.networkConnectionAction.remotePortDetails.port   service.additionalInfo.threatListName   service.archived When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived findings are listed. When this attribute is not set, all existing findings are listed.   service.resourceRole   severity   type   updatedAt Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains milliseconds.  
    */
  var FindingCriteria: typings.awsSdk.guarddutyMod.FindingCriteria
  
  /**
    * The name of the filter.
    */
  var Name: FilterName
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
  
  /**
    * The tags to be added to a new filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateFilterRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FindingCriteria: FindingCriteria, Name: FilterName): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingCriteria = FindingCriteria.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterRequest]
  }
  
  @scala.inline
  implicit class CreateFilterRequestMutableBuilder[Self <: CreateFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FilterAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: FilterDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: FilterRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
