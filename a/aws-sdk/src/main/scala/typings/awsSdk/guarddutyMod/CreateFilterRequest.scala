package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFilterRequest extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.native
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.native
  /**
    * The unique ID of the detector of the GuardDuty account that you want to create a filter for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Represents the criteria to be used in the filter for querying findings. You can only use the following attributes to query findings:   accountId   region   confidence   id   resource.accessKeyDetails.accessKeyId   resource.accessKeyDetails.principalId   resource.accessKeyDetails.userName   resource.accessKeyDetails.userType   resource.instanceDetails.iamInstanceProfile.id   resource.instanceDetails.imageId   resource.instanceDetails.instanceId   resource.instanceDetails.outpostArn   resource.instanceDetails.networkInterfaces.ipv6Addresses   resource.instanceDetails.networkInterfaces.privateIpAddresses.privateIpAddress   resource.instanceDetails.networkInterfaces.publicDnsName   resource.instanceDetails.networkInterfaces.publicIp   resource.instanceDetails.networkInterfaces.securityGroups.groupId   resource.instanceDetails.networkInterfaces.securityGroups.groupName   resource.instanceDetails.networkInterfaces.subnetId   resource.instanceDetails.networkInterfaces.vpcId   resource.instanceDetails.tags.key   resource.instanceDetails.tags.value   resource.resourceType   service.action.actionType   service.action.awsApiCallAction.api   service.action.awsApiCallAction.callerType   service.action.awsApiCallAction.remoteIpDetails.city.cityName   service.action.awsApiCallAction.remoteIpDetails.country.countryName   service.action.awsApiCallAction.remoteIpDetails.ipAddressV4   service.action.awsApiCallAction.remoteIpDetails.organization.asn   service.action.awsApiCallAction.remoteIpDetails.organization.asnOrg   service.action.awsApiCallAction.serviceName   service.action.dnsRequestAction.domain   service.action.networkConnectionAction.blocked   service.action.networkConnectionAction.connectionDirection   service.action.networkConnectionAction.localPortDetails.port   service.action.networkConnectionAction.protocol   service.action.networkConnectionAction.localIpDetails.ipAddressV4   service.action.networkConnectionAction.remoteIpDetails.city.cityName   service.action.networkConnectionAction.remoteIpDetails.country.countryName   service.action.networkConnectionAction.remoteIpDetails.ipAddressV4   service.action.networkConnectionAction.remoteIpDetails.organization.asn   service.action.networkConnectionAction.remoteIpDetails.organization.asnOrg   service.action.networkConnectionAction.remotePortDetails.port   service.additionalInfo.threatListName   service.archived When this attribute is set to TRUE, only archived findings are listed. When it's set to FALSE, only unarchived findings are listed. When this attribute is not set, all existing findings are listed.   service.resourceRole   severity   type   updatedAt Type: ISO 8601 string format: YYYY-MM-DDTHH:MM:SS.SSSZ or YYYY-MM-DDTHH:MM:SSZ depending on whether the value contains milliseconds.  
    */
  var FindingCriteria: typings.awsSdk.guarddutyMod.FindingCriteria = js.native
  /**
    * The name of the filter.
    */
  var Name: FilterName = js.native
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.native
  /**
    * The tags to be added to a new filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingCriteria: FindingCriteria, Name: FilterName): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingCriteria = FindingCriteria.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterRequest]
  }
  @scala.inline
  implicit class CreateFilterRequestOps[Self <: CreateFilterRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("FindingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: FilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: FilterAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: FilterDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRank(value: FilterRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("Rank", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

