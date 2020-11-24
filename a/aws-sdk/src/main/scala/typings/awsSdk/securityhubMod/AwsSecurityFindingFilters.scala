package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSecurityFindingFilters extends js.Object {
  
  /**
    * The AWS account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS AWS Foundations. Contains security standard-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured.
    */
  var CreatedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * A finding's description.
    */
  var Description: js.UndefOr[StringFilterList] = js.native
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security-findings providers' solutions, this generator can be called a rule, a check, a detector, a plugin, etc.
    */
  var GeneratorId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The security findings provider-specific identifier for a finding.
    */
  var Id: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A keyword for a finding.
    */
  var Keyword: js.UndefOr[KeywordFilterList] = js.native
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured.
    */
  var LastObservedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The name of the malware that was observed.
    */
  var MalwareName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The filesystem path of the malware that was observed.
    */
  var MalwarePath: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The state of the malware that was observed.
    */
  var MalwareState: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The type of the malware that was observed.
    */
  var MalwareType: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The destination domain of network-related information about a finding.
    */
  var NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The destination port of network-related information about a finding.
    */
  var NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * Indicates the direction of network traffic associated with a finding.
    */
  var NetworkDirection: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The protocol of network-related information about a finding.
    */
  var NetworkProtocol: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The source domain of network-related information about a finding.
    */
  var NetworkSourceDomain: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var NetworkSourceMac: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The source port of network-related information about a finding.
    */
  var NetworkSourcePort: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * The text of a note.
    */
  var NoteText: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The timestamp of when the note was updated.
    */
  var NoteUpdatedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The principal that created a note.
    */
  var NoteUpdatedBy: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The date/time that the process was launched.
    */
  var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The name of the process.
    */
  var ProcessName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The parent process ID.
    */
  var ProcessParentPid: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * The path to the process executable.
    */
  var ProcessPath: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The process ID.
    */
  var ProcessPid: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * The date/time that the process was terminated.
    */
  var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A data type where security-findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
    */
  var ProductFields: js.UndefOr[MapFilterList] = js.native
  
  /**
    * The name of the solution (product) that generates findings.
    */
  var ProductName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The recommendation of what to do about the issue described in a finding.
    */
  var RecommendationText: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The solution-generated identifier for a related finding.
    */
  var RelatedFindingsId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The ARN of the solution that generated a related finding.
    */
  var RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The IAM profile ARN of the instance.
    */
  var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The IPv4 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The IPv6 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.native
  
  /**
    * The key name associated with the instance.
    */
  var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The date and time the instance was launched.
    */
  var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The instance type of the instance.
    */
  var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The status of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The display name of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The identifier of the image related to a finding.
    */
  var ResourceContainerImageId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The name of the image related to a finding.
    */
  var ResourceContainerImageName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The date/time that the container was started.
    */
  var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The name of the container related to a finding.
    */
  var ResourceContainerName: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.native
  
  /**
    * The canonical identifier for the given resource type.
    */
  var ResourceId: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.native
  
  /**
    * Specifies the type of the resource that details are provided for.
    */
  var ResourceType: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The label of a finding's severity.
    */
  var SeverityLabel: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The normalized severity of a finding.
    */
  var SeverityNormalized: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var SeverityProduct: js.UndefOr[NumberFilterList] = js.native
  
  /**
    * A URL that links to a page about the current finding in the security-findings provider's solution.
    */
  var SourceUrl: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The category of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The date/time of the last observation of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * The source of the threat intelligence.
    */
  var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The URL for more details from the source of the threat intelligence.
    */
  var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The type of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The value of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A finding's title.
    */
  var Title: js.UndefOr[StringFilterList] = js.native
  
  /**
    * A finding type in the format of namespace/category/classifier that classifies a finding.
    */
  var Type: js.UndefOr[StringFilterList] = js.native
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. 
    */
  var UpdatedAt: js.UndefOr[DateFilterList] = js.native
  
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[MapFilterList] = js.native
  
  /**
    * The veracity of a finding.
    */
  var VerificationState: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The workflow state of a finding. Note that this field is deprecated. To search for a finding based on its workflow status, use WorkflowStatus.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.native
  
  /**
    * The status of the investigation into a finding. Allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that the resource owner has been notified about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.   
    */
  var WorkflowStatus: js.UndefOr[StringFilterList] = js.native
}
object AwsSecurityFindingFilters {
  
  @scala.inline
  def apply(): AwsSecurityFindingFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
  
  @scala.inline
  implicit class AwsSecurityFindingFiltersOps[Self <: AwsSecurityFindingFilters] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountIdVarargs(value: StringFilter*): Self = this.set("AwsAccountId", js.Array(value :_*))
    
    @scala.inline
    def setAwsAccountId(value: StringFilterList): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
    
    @scala.inline
    def setCompanyNameVarargs(value: StringFilter*): Self = this.set("CompanyName", js.Array(value :_*))
    
    @scala.inline
    def setCompanyName(value: StringFilterList): Self = this.set("CompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("CompanyName", js.undefined)
    
    @scala.inline
    def setComplianceStatusVarargs(value: StringFilter*): Self = this.set("ComplianceStatus", js.Array(value :_*))
    
    @scala.inline
    def setComplianceStatus(value: StringFilterList): Self = this.set("ComplianceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceStatus: Self = this.set("ComplianceStatus", js.undefined)
    
    @scala.inline
    def setConfidenceVarargs(value: NumberFilter*): Self = this.set("Confidence", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: NumberFilterList): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setCreatedAtVarargs(value: DateFilter*): Self = this.set("CreatedAt", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAt(value: DateFilterList): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setCriticalityVarargs(value: NumberFilter*): Self = this.set("Criticality", js.Array(value :_*))
    
    @scala.inline
    def setCriticality(value: NumberFilterList): Self = this.set("Criticality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriticality: Self = this.set("Criticality", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: StringFilter*): Self = this.set("Description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: StringFilterList): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFirstObservedAtVarargs(value: DateFilter*): Self = this.set("FirstObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setFirstObservedAt(value: DateFilterList): Self = this.set("FirstObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstObservedAt: Self = this.set("FirstObservedAt", js.undefined)
    
    @scala.inline
    def setGeneratorIdVarargs(value: StringFilter*): Self = this.set("GeneratorId", js.Array(value :_*))
    
    @scala.inline
    def setGeneratorId(value: StringFilterList): Self = this.set("GeneratorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratorId: Self = this.set("GeneratorId", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: StringFilter*): Self = this.set("Id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: StringFilterList): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setKeywordVarargs(value: KeywordFilter*): Self = this.set("Keyword", js.Array(value :_*))
    
    @scala.inline
    def setKeyword(value: KeywordFilterList): Self = this.set("Keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("Keyword", js.undefined)
    
    @scala.inline
    def setLastObservedAtVarargs(value: DateFilter*): Self = this.set("LastObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setLastObservedAt(value: DateFilterList): Self = this.set("LastObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastObservedAt: Self = this.set("LastObservedAt", js.undefined)
    
    @scala.inline
    def setMalwareNameVarargs(value: StringFilter*): Self = this.set("MalwareName", js.Array(value :_*))
    
    @scala.inline
    def setMalwareName(value: StringFilterList): Self = this.set("MalwareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMalwareName: Self = this.set("MalwareName", js.undefined)
    
    @scala.inline
    def setMalwarePathVarargs(value: StringFilter*): Self = this.set("MalwarePath", js.Array(value :_*))
    
    @scala.inline
    def setMalwarePath(value: StringFilterList): Self = this.set("MalwarePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMalwarePath: Self = this.set("MalwarePath", js.undefined)
    
    @scala.inline
    def setMalwareStateVarargs(value: StringFilter*): Self = this.set("MalwareState", js.Array(value :_*))
    
    @scala.inline
    def setMalwareState(value: StringFilterList): Self = this.set("MalwareState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMalwareState: Self = this.set("MalwareState", js.undefined)
    
    @scala.inline
    def setMalwareTypeVarargs(value: StringFilter*): Self = this.set("MalwareType", js.Array(value :_*))
    
    @scala.inline
    def setMalwareType(value: StringFilterList): Self = this.set("MalwareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMalwareType: Self = this.set("MalwareType", js.undefined)
    
    @scala.inline
    def setNetworkDestinationDomainVarargs(value: StringFilter*): Self = this.set("NetworkDestinationDomain", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationDomain(value: StringFilterList): Self = this.set("NetworkDestinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDestinationDomain: Self = this.set("NetworkDestinationDomain", js.undefined)
    
    @scala.inline
    def setNetworkDestinationIpV4Varargs(value: IpFilter*): Self = this.set("NetworkDestinationIpV4", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationIpV4(value: IpFilterList): Self = this.set("NetworkDestinationIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDestinationIpV4: Self = this.set("NetworkDestinationIpV4", js.undefined)
    
    @scala.inline
    def setNetworkDestinationIpV6Varargs(value: IpFilter*): Self = this.set("NetworkDestinationIpV6", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationIpV6(value: IpFilterList): Self = this.set("NetworkDestinationIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDestinationIpV6: Self = this.set("NetworkDestinationIpV6", js.undefined)
    
    @scala.inline
    def setNetworkDestinationPortVarargs(value: NumberFilter*): Self = this.set("NetworkDestinationPort", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationPort(value: NumberFilterList): Self = this.set("NetworkDestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDestinationPort: Self = this.set("NetworkDestinationPort", js.undefined)
    
    @scala.inline
    def setNetworkDirectionVarargs(value: StringFilter*): Self = this.set("NetworkDirection", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDirection(value: StringFilterList): Self = this.set("NetworkDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkDirection: Self = this.set("NetworkDirection", js.undefined)
    
    @scala.inline
    def setNetworkProtocolVarargs(value: StringFilter*): Self = this.set("NetworkProtocol", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProtocol(value: StringFilterList): Self = this.set("NetworkProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProtocol: Self = this.set("NetworkProtocol", js.undefined)
    
    @scala.inline
    def setNetworkSourceDomainVarargs(value: StringFilter*): Self = this.set("NetworkSourceDomain", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceDomain(value: StringFilterList): Self = this.set("NetworkSourceDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSourceDomain: Self = this.set("NetworkSourceDomain", js.undefined)
    
    @scala.inline
    def setNetworkSourceIpV4Varargs(value: IpFilter*): Self = this.set("NetworkSourceIpV4", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceIpV4(value: IpFilterList): Self = this.set("NetworkSourceIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSourceIpV4: Self = this.set("NetworkSourceIpV4", js.undefined)
    
    @scala.inline
    def setNetworkSourceIpV6Varargs(value: IpFilter*): Self = this.set("NetworkSourceIpV6", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceIpV6(value: IpFilterList): Self = this.set("NetworkSourceIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSourceIpV6: Self = this.set("NetworkSourceIpV6", js.undefined)
    
    @scala.inline
    def setNetworkSourceMacVarargs(value: StringFilter*): Self = this.set("NetworkSourceMac", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceMac(value: StringFilterList): Self = this.set("NetworkSourceMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSourceMac: Self = this.set("NetworkSourceMac", js.undefined)
    
    @scala.inline
    def setNetworkSourcePortVarargs(value: NumberFilter*): Self = this.set("NetworkSourcePort", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourcePort(value: NumberFilterList): Self = this.set("NetworkSourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkSourcePort: Self = this.set("NetworkSourcePort", js.undefined)
    
    @scala.inline
    def setNoteTextVarargs(value: StringFilter*): Self = this.set("NoteText", js.Array(value :_*))
    
    @scala.inline
    def setNoteText(value: StringFilterList): Self = this.set("NoteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteText: Self = this.set("NoteText", js.undefined)
    
    @scala.inline
    def setNoteUpdatedAtVarargs(value: DateFilter*): Self = this.set("NoteUpdatedAt", js.Array(value :_*))
    
    @scala.inline
    def setNoteUpdatedAt(value: DateFilterList): Self = this.set("NoteUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteUpdatedAt: Self = this.set("NoteUpdatedAt", js.undefined)
    
    @scala.inline
    def setNoteUpdatedByVarargs(value: StringFilter*): Self = this.set("NoteUpdatedBy", js.Array(value :_*))
    
    @scala.inline
    def setNoteUpdatedBy(value: StringFilterList): Self = this.set("NoteUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteUpdatedBy: Self = this.set("NoteUpdatedBy", js.undefined)
    
    @scala.inline
    def setProcessLaunchedAtVarargs(value: DateFilter*): Self = this.set("ProcessLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setProcessLaunchedAt(value: DateFilterList): Self = this.set("ProcessLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessLaunchedAt: Self = this.set("ProcessLaunchedAt", js.undefined)
    
    @scala.inline
    def setProcessNameVarargs(value: StringFilter*): Self = this.set("ProcessName", js.Array(value :_*))
    
    @scala.inline
    def setProcessName(value: StringFilterList): Self = this.set("ProcessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessName: Self = this.set("ProcessName", js.undefined)
    
    @scala.inline
    def setProcessParentPidVarargs(value: NumberFilter*): Self = this.set("ProcessParentPid", js.Array(value :_*))
    
    @scala.inline
    def setProcessParentPid(value: NumberFilterList): Self = this.set("ProcessParentPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessParentPid: Self = this.set("ProcessParentPid", js.undefined)
    
    @scala.inline
    def setProcessPathVarargs(value: StringFilter*): Self = this.set("ProcessPath", js.Array(value :_*))
    
    @scala.inline
    def setProcessPath(value: StringFilterList): Self = this.set("ProcessPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessPath: Self = this.set("ProcessPath", js.undefined)
    
    @scala.inline
    def setProcessPidVarargs(value: NumberFilter*): Self = this.set("ProcessPid", js.Array(value :_*))
    
    @scala.inline
    def setProcessPid(value: NumberFilterList): Self = this.set("ProcessPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessPid: Self = this.set("ProcessPid", js.undefined)
    
    @scala.inline
    def setProcessTerminatedAtVarargs(value: DateFilter*): Self = this.set("ProcessTerminatedAt", js.Array(value :_*))
    
    @scala.inline
    def setProcessTerminatedAt(value: DateFilterList): Self = this.set("ProcessTerminatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessTerminatedAt: Self = this.set("ProcessTerminatedAt", js.undefined)
    
    @scala.inline
    def setProductArnVarargs(value: StringFilter*): Self = this.set("ProductArn", js.Array(value :_*))
    
    @scala.inline
    def setProductArn(value: StringFilterList): Self = this.set("ProductArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductArn: Self = this.set("ProductArn", js.undefined)
    
    @scala.inline
    def setProductFieldsVarargs(value: MapFilter*): Self = this.set("ProductFields", js.Array(value :_*))
    
    @scala.inline
    def setProductFields(value: MapFilterList): Self = this.set("ProductFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductFields: Self = this.set("ProductFields", js.undefined)
    
    @scala.inline
    def setProductNameVarargs(value: StringFilter*): Self = this.set("ProductName", js.Array(value :_*))
    
    @scala.inline
    def setProductName(value: StringFilterList): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    
    @scala.inline
    def setRecommendationTextVarargs(value: StringFilter*): Self = this.set("RecommendationText", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationText(value: StringFilterList): Self = this.set("RecommendationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationText: Self = this.set("RecommendationText", js.undefined)
    
    @scala.inline
    def setRecordStateVarargs(value: StringFilter*): Self = this.set("RecordState", js.Array(value :_*))
    
    @scala.inline
    def setRecordState(value: StringFilterList): Self = this.set("RecordState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordState: Self = this.set("RecordState", js.undefined)
    
    @scala.inline
    def setRelatedFindingsIdVarargs(value: StringFilter*): Self = this.set("RelatedFindingsId", js.Array(value :_*))
    
    @scala.inline
    def setRelatedFindingsId(value: StringFilterList): Self = this.set("RelatedFindingsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedFindingsId: Self = this.set("RelatedFindingsId", js.undefined)
    
    @scala.inline
    def setRelatedFindingsProductArnVarargs(value: StringFilter*): Self = this.set("RelatedFindingsProductArn", js.Array(value :_*))
    
    @scala.inline
    def setRelatedFindingsProductArn(value: StringFilterList): Self = this.set("RelatedFindingsProductArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedFindingsProductArn: Self = this.set("RelatedFindingsProductArn", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIamInstanceProfileArnVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceIamInstanceProfileArn", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIamInstanceProfileArn(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceIamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceIamInstanceProfileArn: Self = this.set("ResourceAwsEc2InstanceIamInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceImageIdVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceImageId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceImageId(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceImageId: Self = this.set("ResourceAwsEc2InstanceImageId", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV4AddressesVarargs(value: IpFilter*): Self = this.set("ResourceAwsEc2InstanceIpV4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV4Addresses(value: IpFilterList): Self = this.set("ResourceAwsEc2InstanceIpV4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceIpV4Addresses: Self = this.set("ResourceAwsEc2InstanceIpV4Addresses", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV6AddressesVarargs(value: IpFilter*): Self = this.set("ResourceAwsEc2InstanceIpV6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV6Addresses(value: IpFilterList): Self = this.set("ResourceAwsEc2InstanceIpV6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceIpV6Addresses: Self = this.set("ResourceAwsEc2InstanceIpV6Addresses", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceKeyNameVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceKeyName", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceKeyName(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceKeyName: Self = this.set("ResourceAwsEc2InstanceKeyName", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceLaunchedAtVarargs(value: DateFilter*): Self = this.set("ResourceAwsEc2InstanceLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceLaunchedAt(value: DateFilterList): Self = this.set("ResourceAwsEc2InstanceLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceLaunchedAt: Self = this.set("ResourceAwsEc2InstanceLaunchedAt", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceSubnetIdVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceSubnetId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceSubnetId(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceSubnetId: Self = this.set("ResourceAwsEc2InstanceSubnetId", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceTypeVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceType", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceType(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceType: Self = this.set("ResourceAwsEc2InstanceType", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceVpcIdVarargs(value: StringFilter*): Self = this.set("ResourceAwsEc2InstanceVpcId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceVpcId(value: StringFilterList): Self = this.set("ResourceAwsEc2InstanceVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsEc2InstanceVpcId: Self = this.set("ResourceAwsEc2InstanceVpcId", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyCreatedAtVarargs(value: DateFilter*): Self = this.set("ResourceAwsIamAccessKeyCreatedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyCreatedAt(value: DateFilterList): Self = this.set("ResourceAwsIamAccessKeyCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsIamAccessKeyCreatedAt: Self = this.set("ResourceAwsIamAccessKeyCreatedAt", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyStatusVarargs(value: StringFilter*): Self = this.set("ResourceAwsIamAccessKeyStatus", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyStatus(value: StringFilterList): Self = this.set("ResourceAwsIamAccessKeyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsIamAccessKeyStatus: Self = this.set("ResourceAwsIamAccessKeyStatus", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyUserNameVarargs(value: StringFilter*): Self = this.set("ResourceAwsIamAccessKeyUserName", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyUserName(value: StringFilterList): Self = this.set("ResourceAwsIamAccessKeyUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsIamAccessKeyUserName: Self = this.set("ResourceAwsIamAccessKeyUserName", js.undefined)
    
    @scala.inline
    def setResourceAwsS3BucketOwnerIdVarargs(value: StringFilter*): Self = this.set("ResourceAwsS3BucketOwnerId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsS3BucketOwnerId(value: StringFilterList): Self = this.set("ResourceAwsS3BucketOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsS3BucketOwnerId: Self = this.set("ResourceAwsS3BucketOwnerId", js.undefined)
    
    @scala.inline
    def setResourceAwsS3BucketOwnerNameVarargs(value: StringFilter*): Self = this.set("ResourceAwsS3BucketOwnerName", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsS3BucketOwnerName(value: StringFilterList): Self = this.set("ResourceAwsS3BucketOwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAwsS3BucketOwnerName: Self = this.set("ResourceAwsS3BucketOwnerName", js.undefined)
    
    @scala.inline
    def setResourceContainerImageIdVarargs(value: StringFilter*): Self = this.set("ResourceContainerImageId", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerImageId(value: StringFilterList): Self = this.set("ResourceContainerImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceContainerImageId: Self = this.set("ResourceContainerImageId", js.undefined)
    
    @scala.inline
    def setResourceContainerImageNameVarargs(value: StringFilter*): Self = this.set("ResourceContainerImageName", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerImageName(value: StringFilterList): Self = this.set("ResourceContainerImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceContainerImageName: Self = this.set("ResourceContainerImageName", js.undefined)
    
    @scala.inline
    def setResourceContainerLaunchedAtVarargs(value: DateFilter*): Self = this.set("ResourceContainerLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerLaunchedAt(value: DateFilterList): Self = this.set("ResourceContainerLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceContainerLaunchedAt: Self = this.set("ResourceContainerLaunchedAt", js.undefined)
    
    @scala.inline
    def setResourceContainerNameVarargs(value: StringFilter*): Self = this.set("ResourceContainerName", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerName(value: StringFilterList): Self = this.set("ResourceContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceContainerName: Self = this.set("ResourceContainerName", js.undefined)
    
    @scala.inline
    def setResourceDetailsOtherVarargs(value: MapFilter*): Self = this.set("ResourceDetailsOther", js.Array(value :_*))
    
    @scala.inline
    def setResourceDetailsOther(value: MapFilterList): Self = this.set("ResourceDetailsOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDetailsOther: Self = this.set("ResourceDetailsOther", js.undefined)
    
    @scala.inline
    def setResourceIdVarargs(value: StringFilter*): Self = this.set("ResourceId", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: StringFilterList): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourcePartitionVarargs(value: StringFilter*): Self = this.set("ResourcePartition", js.Array(value :_*))
    
    @scala.inline
    def setResourcePartition(value: StringFilterList): Self = this.set("ResourcePartition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePartition: Self = this.set("ResourcePartition", js.undefined)
    
    @scala.inline
    def setResourceRegionVarargs(value: StringFilter*): Self = this.set("ResourceRegion", js.Array(value :_*))
    
    @scala.inline
    def setResourceRegion(value: StringFilterList): Self = this.set("ResourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRegion: Self = this.set("ResourceRegion", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: MapFilter*): Self = this.set("ResourceTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceTags(value: MapFilterList): Self = this.set("ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("ResourceTags", js.undefined)
    
    @scala.inline
    def setResourceTypeVarargs(value: StringFilter*): Self = this.set("ResourceType", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: StringFilterList): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setSeverityLabelVarargs(value: StringFilter*): Self = this.set("SeverityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSeverityLabel(value: StringFilterList): Self = this.set("SeverityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityLabel: Self = this.set("SeverityLabel", js.undefined)
    
    @scala.inline
    def setSeverityNormalizedVarargs(value: NumberFilter*): Self = this.set("SeverityNormalized", js.Array(value :_*))
    
    @scala.inline
    def setSeverityNormalized(value: NumberFilterList): Self = this.set("SeverityNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityNormalized: Self = this.set("SeverityNormalized", js.undefined)
    
    @scala.inline
    def setSeverityProductVarargs(value: NumberFilter*): Self = this.set("SeverityProduct", js.Array(value :_*))
    
    @scala.inline
    def setSeverityProduct(value: NumberFilterList): Self = this.set("SeverityProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityProduct: Self = this.set("SeverityProduct", js.undefined)
    
    @scala.inline
    def setSourceUrlVarargs(value: StringFilter*): Self = this.set("SourceUrl", js.Array(value :_*))
    
    @scala.inline
    def setSourceUrl(value: StringFilterList): Self = this.set("SourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUrl: Self = this.set("SourceUrl", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorCategoryVarargs(value: StringFilter*): Self = this.set("ThreatIntelIndicatorCategory", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorCategory(value: StringFilterList): Self = this.set("ThreatIntelIndicatorCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorCategory: Self = this.set("ThreatIntelIndicatorCategory", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorLastObservedAtVarargs(value: DateFilter*): Self = this.set("ThreatIntelIndicatorLastObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorLastObservedAt(value: DateFilterList): Self = this.set("ThreatIntelIndicatorLastObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorLastObservedAt: Self = this.set("ThreatIntelIndicatorLastObservedAt", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorSourceVarargs(value: StringFilter*): Self = this.set("ThreatIntelIndicatorSource", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorSource(value: StringFilterList): Self = this.set("ThreatIntelIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorSource: Self = this.set("ThreatIntelIndicatorSource", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorSourceUrlVarargs(value: StringFilter*): Self = this.set("ThreatIntelIndicatorSourceUrl", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorSourceUrl(value: StringFilterList): Self = this.set("ThreatIntelIndicatorSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorSourceUrl: Self = this.set("ThreatIntelIndicatorSourceUrl", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorTypeVarargs(value: StringFilter*): Self = this.set("ThreatIntelIndicatorType", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorType(value: StringFilterList): Self = this.set("ThreatIntelIndicatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorType: Self = this.set("ThreatIntelIndicatorType", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorValueVarargs(value: StringFilter*): Self = this.set("ThreatIntelIndicatorValue", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorValue(value: StringFilterList): Self = this.set("ThreatIntelIndicatorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatIntelIndicatorValue: Self = this.set("ThreatIntelIndicatorValue", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: StringFilter*): Self = this.set("Title", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: StringFilterList): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: StringFilter*): Self = this.set("Type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: StringFilterList): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUpdatedAtVarargs(value: DateFilter*): Self = this.set("UpdatedAt", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAt(value: DateFilterList): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
    
    @scala.inline
    def setUserDefinedFieldsVarargs(value: MapFilter*): Self = this.set("UserDefinedFields", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFields(value: MapFilterList): Self = this.set("UserDefinedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedFields: Self = this.set("UserDefinedFields", js.undefined)
    
    @scala.inline
    def setVerificationStateVarargs(value: StringFilter*): Self = this.set("VerificationState", js.Array(value :_*))
    
    @scala.inline
    def setVerificationState(value: StringFilterList): Self = this.set("VerificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationState: Self = this.set("VerificationState", js.undefined)
    
    @scala.inline
    def setWorkflowStateVarargs(value: StringFilter*): Self = this.set("WorkflowState", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowState(value: StringFilterList): Self = this.set("WorkflowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowState: Self = this.set("WorkflowState", js.undefined)
    
    @scala.inline
    def setWorkflowStatusVarargs(value: StringFilter*): Self = this.set("WorkflowStatus", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowStatus(value: StringFilterList): Self = this.set("WorkflowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowStatus: Self = this.set("WorkflowStatus", js.undefined)
  }
}
