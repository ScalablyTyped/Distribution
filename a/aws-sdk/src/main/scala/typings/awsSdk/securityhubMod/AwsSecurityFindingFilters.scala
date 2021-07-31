package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSecurityFindingFilters extends StObject {
  
  /**
    * The AWS account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS AWS Foundations. Contains security standard-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured.
    */
  var CreatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * A finding's description.
    */
  var Description: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security-findings providers' solutions, this generator can be called a rule, a check, a detector, a plugin, etc.
    */
  var GeneratorId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The security findings provider-specific identifier for a finding.
    */
  var Id: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A keyword for a finding.
    */
  var Keyword: js.UndefOr[KeywordFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured.
    */
  var LastObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The name of the malware that was observed.
    */
  var MalwareName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The filesystem path of the malware that was observed.
    */
  var MalwarePath: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The state of the malware that was observed.
    */
  var MalwareState: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The type of the malware that was observed.
    */
  var MalwareType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The destination domain of network-related information about a finding.
    */
  var NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The destination port of network-related information about a finding.
    */
  var NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * Indicates the direction of network traffic associated with a finding.
    */
  var NetworkDirection: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The protocol of network-related information about a finding.
    */
  var NetworkProtocol: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The source domain of network-related information about a finding.
    */
  var NetworkSourceDomain: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var NetworkSourceMac: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The source port of network-related information about a finding.
    */
  var NetworkSourcePort: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The text of a note.
    */
  var NoteText: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The timestamp of when the note was updated.
    */
  var NoteUpdatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The principal that created a note.
    */
  var NoteUpdatedBy: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The date/time that the process was launched.
    */
  var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The name of the process.
    */
  var ProcessName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The parent process ID.
    */
  var ProcessParentPid: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The path to the process executable.
    */
  var ProcessPath: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The process ID.
    */
  var ProcessPid: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The date/time that the process was terminated.
    */
  var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A data type where security-findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
    */
  var ProductFields: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * The name of the solution (product) that generates findings.
    */
  var ProductName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The recommendation of what to do about the issue described in a finding.
    */
  var RecommendationText: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The solution-generated identifier for a related finding.
    */
  var RelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The ARN of the solution that generated a related finding.
    */
  var RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The IAM profile ARN of the instance.
    */
  var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The IPv4 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The IPv6 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.undefined
  
  /**
    * The key name associated with the instance.
    */
  var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The date and time the instance was launched.
    */
  var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The instance type of the instance.
    */
  var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The status of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The display name of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The identifier of the image related to a finding.
    */
  var ResourceContainerImageId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The name of the image related to a finding.
    */
  var ResourceContainerImageName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The date/time that the container was started.
    */
  var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The name of the container related to a finding.
    */
  var ResourceContainerName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * The canonical identifier for the given resource type.
    */
  var ResourceId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * Specifies the type of the resource that details are provided for.
    */
  var ResourceType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The label of a finding's severity.
    */
  var SeverityLabel: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The normalized severity of a finding.
    */
  var SeverityNormalized: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var SeverityProduct: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * A URL that links to a page about the current finding in the security-findings provider's solution.
    */
  var SourceUrl: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The category of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The date/time of the last observation of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The source of the threat intelligence.
    */
  var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The URL for more details from the source of the threat intelligence.
    */
  var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The type of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A finding's title.
    */
  var Title: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A finding type in the format of namespace/category/classifier that classifies a finding.
    */
  var Type: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. 
    */
  var UpdatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * The veracity of a finding.
    */
  var VerificationState: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The workflow state of a finding. Note that this field is deprecated. To search for a finding based on its workflow status, use WorkflowStatus.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The status of the investigation into a finding. Allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that the resource owner has been notified about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.   
    */
  var WorkflowStatus: js.UndefOr[StringFilterList] = js.undefined
}
object AwsSecurityFindingFilters {
  
  @scala.inline
  def apply(): AwsSecurityFindingFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
  
  @scala.inline
  implicit class AwsSecurityFindingFiltersMutableBuilder[Self <: AwsSecurityFindingFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: StringFilterList): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    @scala.inline
    def setAwsAccountIdVarargs(value: StringFilter*): Self = StObject.set(x, "AwsAccountId", js.Array(value :_*))
    
    @scala.inline
    def setCompanyName(value: StringFilterList): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    @scala.inline
    def setCompanyNameVarargs(value: StringFilter*): Self = StObject.set(x, "CompanyName", js.Array(value :_*))
    
    @scala.inline
    def setComplianceStatus(value: StringFilterList): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    @scala.inline
    def setComplianceStatusVarargs(value: StringFilter*): Self = StObject.set(x, "ComplianceStatus", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: NumberFilterList): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setConfidenceVarargs(value: NumberFilter*): Self = StObject.set(x, "Confidence", js.Array(value :_*))
    
    @scala.inline
    def setCreatedAt(value: DateFilterList): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCreatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "CreatedAt", js.Array(value :_*))
    
    @scala.inline
    def setCriticality(value: NumberFilterList): Self = StObject.set(x, "Criticality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalityUndefined: Self = StObject.set(x, "Criticality", js.undefined)
    
    @scala.inline
    def setCriticalityVarargs(value: NumberFilter*): Self = StObject.set(x, "Criticality", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: StringFilterList): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: StringFilter*): Self = StObject.set(x, "Description", js.Array(value :_*))
    
    @scala.inline
    def setFirstObservedAt(value: DateFilterList): Self = StObject.set(x, "FirstObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstObservedAtUndefined: Self = StObject.set(x, "FirstObservedAt", js.undefined)
    
    @scala.inline
    def setFirstObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "FirstObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setGeneratorId(value: StringFilterList): Self = StObject.set(x, "GeneratorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorIdUndefined: Self = StObject.set(x, "GeneratorId", js.undefined)
    
    @scala.inline
    def setGeneratorIdVarargs(value: StringFilter*): Self = StObject.set(x, "GeneratorId", js.Array(value :_*))
    
    @scala.inline
    def setId(value: StringFilterList): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: StringFilter*): Self = StObject.set(x, "Id", js.Array(value :_*))
    
    @scala.inline
    def setKeyword(value: KeywordFilterList): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    @scala.inline
    def setKeywordVarargs(value: KeywordFilter*): Self = StObject.set(x, "Keyword", js.Array(value :_*))
    
    @scala.inline
    def setLastObservedAt(value: DateFilterList): Self = StObject.set(x, "LastObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastObservedAtUndefined: Self = StObject.set(x, "LastObservedAt", js.undefined)
    
    @scala.inline
    def setLastObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "LastObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setMalwareName(value: StringFilterList): Self = StObject.set(x, "MalwareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMalwareNameUndefined: Self = StObject.set(x, "MalwareName", js.undefined)
    
    @scala.inline
    def setMalwareNameVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareName", js.Array(value :_*))
    
    @scala.inline
    def setMalwarePath(value: StringFilterList): Self = StObject.set(x, "MalwarePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMalwarePathUndefined: Self = StObject.set(x, "MalwarePath", js.undefined)
    
    @scala.inline
    def setMalwarePathVarargs(value: StringFilter*): Self = StObject.set(x, "MalwarePath", js.Array(value :_*))
    
    @scala.inline
    def setMalwareState(value: StringFilterList): Self = StObject.set(x, "MalwareState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMalwareStateUndefined: Self = StObject.set(x, "MalwareState", js.undefined)
    
    @scala.inline
    def setMalwareStateVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareState", js.Array(value :_*))
    
    @scala.inline
    def setMalwareType(value: StringFilterList): Self = StObject.set(x, "MalwareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMalwareTypeUndefined: Self = StObject.set(x, "MalwareType", js.undefined)
    
    @scala.inline
    def setMalwareTypeVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareType", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationDomain(value: StringFilterList): Self = StObject.set(x, "NetworkDestinationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDestinationDomainUndefined: Self = StObject.set(x, "NetworkDestinationDomain", js.undefined)
    
    @scala.inline
    def setNetworkDestinationDomainVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkDestinationDomain", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationIpV4(value: IpFilterList): Self = StObject.set(x, "NetworkDestinationIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDestinationIpV4Undefined: Self = StObject.set(x, "NetworkDestinationIpV4", js.undefined)
    
    @scala.inline
    def setNetworkDestinationIpV4Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkDestinationIpV4", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationIpV6(value: IpFilterList): Self = StObject.set(x, "NetworkDestinationIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDestinationIpV6Undefined: Self = StObject.set(x, "NetworkDestinationIpV6", js.undefined)
    
    @scala.inline
    def setNetworkDestinationIpV6Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkDestinationIpV6", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDestinationPort(value: NumberFilterList): Self = StObject.set(x, "NetworkDestinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDestinationPortUndefined: Self = StObject.set(x, "NetworkDestinationPort", js.undefined)
    
    @scala.inline
    def setNetworkDestinationPortVarargs(value: NumberFilter*): Self = StObject.set(x, "NetworkDestinationPort", js.Array(value :_*))
    
    @scala.inline
    def setNetworkDirection(value: StringFilterList): Self = StObject.set(x, "NetworkDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDirectionUndefined: Self = StObject.set(x, "NetworkDirection", js.undefined)
    
    @scala.inline
    def setNetworkDirectionVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkDirection", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProtocol(value: StringFilterList): Self = StObject.set(x, "NetworkProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProtocolUndefined: Self = StObject.set(x, "NetworkProtocol", js.undefined)
    
    @scala.inline
    def setNetworkProtocolVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkProtocol", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceDomain(value: StringFilterList): Self = StObject.set(x, "NetworkSourceDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSourceDomainUndefined: Self = StObject.set(x, "NetworkSourceDomain", js.undefined)
    
    @scala.inline
    def setNetworkSourceDomainVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkSourceDomain", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceIpV4(value: IpFilterList): Self = StObject.set(x, "NetworkSourceIpV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSourceIpV4Undefined: Self = StObject.set(x, "NetworkSourceIpV4", js.undefined)
    
    @scala.inline
    def setNetworkSourceIpV4Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkSourceIpV4", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceIpV6(value: IpFilterList): Self = StObject.set(x, "NetworkSourceIpV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSourceIpV6Undefined: Self = StObject.set(x, "NetworkSourceIpV6", js.undefined)
    
    @scala.inline
    def setNetworkSourceIpV6Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkSourceIpV6", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourceMac(value: StringFilterList): Self = StObject.set(x, "NetworkSourceMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSourceMacUndefined: Self = StObject.set(x, "NetworkSourceMac", js.undefined)
    
    @scala.inline
    def setNetworkSourceMacVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkSourceMac", js.Array(value :_*))
    
    @scala.inline
    def setNetworkSourcePort(value: NumberFilterList): Self = StObject.set(x, "NetworkSourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSourcePortUndefined: Self = StObject.set(x, "NetworkSourcePort", js.undefined)
    
    @scala.inline
    def setNetworkSourcePortVarargs(value: NumberFilter*): Self = StObject.set(x, "NetworkSourcePort", js.Array(value :_*))
    
    @scala.inline
    def setNoteText(value: StringFilterList): Self = StObject.set(x, "NoteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteTextUndefined: Self = StObject.set(x, "NoteText", js.undefined)
    
    @scala.inline
    def setNoteTextVarargs(value: StringFilter*): Self = StObject.set(x, "NoteText", js.Array(value :_*))
    
    @scala.inline
    def setNoteUpdatedAt(value: DateFilterList): Self = StObject.set(x, "NoteUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUpdatedAtUndefined: Self = StObject.set(x, "NoteUpdatedAt", js.undefined)
    
    @scala.inline
    def setNoteUpdatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "NoteUpdatedAt", js.Array(value :_*))
    
    @scala.inline
    def setNoteUpdatedBy(value: StringFilterList): Self = StObject.set(x, "NoteUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUpdatedByUndefined: Self = StObject.set(x, "NoteUpdatedBy", js.undefined)
    
    @scala.inline
    def setNoteUpdatedByVarargs(value: StringFilter*): Self = StObject.set(x, "NoteUpdatedBy", js.Array(value :_*))
    
    @scala.inline
    def setProcessLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ProcessLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessLaunchedAtUndefined: Self = StObject.set(x, "ProcessLaunchedAt", js.undefined)
    
    @scala.inline
    def setProcessLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ProcessLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setProcessName(value: StringFilterList): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNameUndefined: Self = StObject.set(x, "ProcessName", js.undefined)
    
    @scala.inline
    def setProcessNameVarargs(value: StringFilter*): Self = StObject.set(x, "ProcessName", js.Array(value :_*))
    
    @scala.inline
    def setProcessParentPid(value: NumberFilterList): Self = StObject.set(x, "ProcessParentPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessParentPidUndefined: Self = StObject.set(x, "ProcessParentPid", js.undefined)
    
    @scala.inline
    def setProcessParentPidVarargs(value: NumberFilter*): Self = StObject.set(x, "ProcessParentPid", js.Array(value :_*))
    
    @scala.inline
    def setProcessPath(value: StringFilterList): Self = StObject.set(x, "ProcessPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessPathUndefined: Self = StObject.set(x, "ProcessPath", js.undefined)
    
    @scala.inline
    def setProcessPathVarargs(value: StringFilter*): Self = StObject.set(x, "ProcessPath", js.Array(value :_*))
    
    @scala.inline
    def setProcessPid(value: NumberFilterList): Self = StObject.set(x, "ProcessPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessPidUndefined: Self = StObject.set(x, "ProcessPid", js.undefined)
    
    @scala.inline
    def setProcessPidVarargs(value: NumberFilter*): Self = StObject.set(x, "ProcessPid", js.Array(value :_*))
    
    @scala.inline
    def setProcessTerminatedAt(value: DateFilterList): Self = StObject.set(x, "ProcessTerminatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessTerminatedAtUndefined: Self = StObject.set(x, "ProcessTerminatedAt", js.undefined)
    
    @scala.inline
    def setProcessTerminatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ProcessTerminatedAt", js.Array(value :_*))
    
    @scala.inline
    def setProductArn(value: StringFilterList): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductArnUndefined: Self = StObject.set(x, "ProductArn", js.undefined)
    
    @scala.inline
    def setProductArnVarargs(value: StringFilter*): Self = StObject.set(x, "ProductArn", js.Array(value :_*))
    
    @scala.inline
    def setProductFields(value: MapFilterList): Self = StObject.set(x, "ProductFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductFieldsUndefined: Self = StObject.set(x, "ProductFields", js.undefined)
    
    @scala.inline
    def setProductFieldsVarargs(value: MapFilter*): Self = StObject.set(x, "ProductFields", js.Array(value :_*))
    
    @scala.inline
    def setProductName(value: StringFilterList): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    @scala.inline
    def setProductNameVarargs(value: StringFilter*): Self = StObject.set(x, "ProductName", js.Array(value :_*))
    
    @scala.inline
    def setRecommendationText(value: StringFilterList): Self = StObject.set(x, "RecommendationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTextUndefined: Self = StObject.set(x, "RecommendationText", js.undefined)
    
    @scala.inline
    def setRecommendationTextVarargs(value: StringFilter*): Self = StObject.set(x, "RecommendationText", js.Array(value :_*))
    
    @scala.inline
    def setRecordState(value: StringFilterList): Self = StObject.set(x, "RecordState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordStateUndefined: Self = StObject.set(x, "RecordState", js.undefined)
    
    @scala.inline
    def setRecordStateVarargs(value: StringFilter*): Self = StObject.set(x, "RecordState", js.Array(value :_*))
    
    @scala.inline
    def setRelatedFindingsId(value: StringFilterList): Self = StObject.set(x, "RelatedFindingsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedFindingsIdUndefined: Self = StObject.set(x, "RelatedFindingsId", js.undefined)
    
    @scala.inline
    def setRelatedFindingsIdVarargs(value: StringFilter*): Self = StObject.set(x, "RelatedFindingsId", js.Array(value :_*))
    
    @scala.inline
    def setRelatedFindingsProductArn(value: StringFilterList): Self = StObject.set(x, "RelatedFindingsProductArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedFindingsProductArnUndefined: Self = StObject.set(x, "RelatedFindingsProductArn", js.undefined)
    
    @scala.inline
    def setRelatedFindingsProductArnVarargs(value: StringFilter*): Self = StObject.set(x, "RelatedFindingsProductArn", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIamInstanceProfileArn(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceIamInstanceProfileArnUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIamInstanceProfileArnVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceImageId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceImageIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceImageIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV4Addresses(value: IpFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV4AddressesUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV4AddressesVarargs(value: IpFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV6Addresses(value: IpFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV6AddressesUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceIpV6AddressesVarargs(value: IpFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceKeyName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceKeyNameUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceKeyNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceLaunchedAtUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceSubnetId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceSubnetIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceSubnetIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceType(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceTypeUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceType", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceType", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsEc2InstanceVpcId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsEc2InstanceVpcIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", js.undefined)
    
    @scala.inline
    def setResourceAwsEc2InstanceVpcIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyCreatedAt(value: DateFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsIamAccessKeyCreatedAtUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyCreatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyStatus(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsIamAccessKeyStatusUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyStatusVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsIamAccessKeyUserName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsIamAccessKeyUserNameUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", js.undefined)
    
    @scala.inline
    def setResourceAwsIamAccessKeyUserNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsS3BucketOwnerId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsS3BucketOwnerIdUndefined: Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", js.undefined)
    
    @scala.inline
    def setResourceAwsS3BucketOwnerIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", js.Array(value :_*))
    
    @scala.inline
    def setResourceAwsS3BucketOwnerName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAwsS3BucketOwnerNameUndefined: Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", js.undefined)
    
    @scala.inline
    def setResourceAwsS3BucketOwnerNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerImageId(value: StringFilterList): Self = StObject.set(x, "ResourceContainerImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainerImageIdUndefined: Self = StObject.set(x, "ResourceContainerImageId", js.undefined)
    
    @scala.inline
    def setResourceContainerImageIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerImageId", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerImageName(value: StringFilterList): Self = StObject.set(x, "ResourceContainerImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainerImageNameUndefined: Self = StObject.set(x, "ResourceContainerImageName", js.undefined)
    
    @scala.inline
    def setResourceContainerImageNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerImageName", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ResourceContainerLaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainerLaunchedAtUndefined: Self = StObject.set(x, "ResourceContainerLaunchedAt", js.undefined)
    
    @scala.inline
    def setResourceContainerLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceContainerLaunchedAt", js.Array(value :_*))
    
    @scala.inline
    def setResourceContainerName(value: StringFilterList): Self = StObject.set(x, "ResourceContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainerNameUndefined: Self = StObject.set(x, "ResourceContainerName", js.undefined)
    
    @scala.inline
    def setResourceContainerNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerName", js.Array(value :_*))
    
    @scala.inline
    def setResourceDetailsOther(value: MapFilterList): Self = StObject.set(x, "ResourceDetailsOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDetailsOtherUndefined: Self = StObject.set(x, "ResourceDetailsOther", js.undefined)
    
    @scala.inline
    def setResourceDetailsOtherVarargs(value: MapFilter*): Self = StObject.set(x, "ResourceDetailsOther", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: StringFilterList): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceId", js.Array(value :_*))
    
    @scala.inline
    def setResourcePartition(value: StringFilterList): Self = StObject.set(x, "ResourcePartition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePartitionUndefined: Self = StObject.set(x, "ResourcePartition", js.undefined)
    
    @scala.inline
    def setResourcePartitionVarargs(value: StringFilter*): Self = StObject.set(x, "ResourcePartition", js.Array(value :_*))
    
    @scala.inline
    def setResourceRegion(value: StringFilterList): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    @scala.inline
    def setResourceRegionVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceRegion", js.Array(value :_*))
    
    @scala.inline
    def setResourceTags(value: MapFilterList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: MapFilter*): Self = StObject.set(x, "ResourceTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: StringFilterList): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setResourceTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceType", js.Array(value :_*))
    
    @scala.inline
    def setSeverityLabel(value: StringFilterList): Self = StObject.set(x, "SeverityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityLabelUndefined: Self = StObject.set(x, "SeverityLabel", js.undefined)
    
    @scala.inline
    def setSeverityLabelVarargs(value: StringFilter*): Self = StObject.set(x, "SeverityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSeverityNormalized(value: NumberFilterList): Self = StObject.set(x, "SeverityNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityNormalizedUndefined: Self = StObject.set(x, "SeverityNormalized", js.undefined)
    
    @scala.inline
    def setSeverityNormalizedVarargs(value: NumberFilter*): Self = StObject.set(x, "SeverityNormalized", js.Array(value :_*))
    
    @scala.inline
    def setSeverityProduct(value: NumberFilterList): Self = StObject.set(x, "SeverityProduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityProductUndefined: Self = StObject.set(x, "SeverityProduct", js.undefined)
    
    @scala.inline
    def setSeverityProductVarargs(value: NumberFilter*): Self = StObject.set(x, "SeverityProduct", js.Array(value :_*))
    
    @scala.inline
    def setSourceUrl(value: StringFilterList): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUrlUndefined: Self = StObject.set(x, "SourceUrl", js.undefined)
    
    @scala.inline
    def setSourceUrlVarargs(value: StringFilter*): Self = StObject.set(x, "SourceUrl", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorCategory(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorCategoryUndefined: Self = StObject.set(x, "ThreatIntelIndicatorCategory", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorCategoryVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorCategory", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorLastObservedAt(value: DateFilterList): Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorLastObservedAtUndefined: Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorLastObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorSource(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorSourceUndefined: Self = StObject.set(x, "ThreatIntelIndicatorSource", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorSourceUrl(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorSourceUrlUndefined: Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorSourceUrlVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorSourceVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorSource", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorType(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorTypeUndefined: Self = StObject.set(x, "ThreatIntelIndicatorType", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorType", js.Array(value :_*))
    
    @scala.inline
    def setThreatIntelIndicatorValue(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatIntelIndicatorValueUndefined: Self = StObject.set(x, "ThreatIntelIndicatorValue", js.undefined)
    
    @scala.inline
    def setThreatIntelIndicatorValueVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorValue", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: StringFilterList): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: StringFilter*): Self = StObject.set(x, "Title", js.Array(value :_*))
    
    @scala.inline
    def setType(value: StringFilterList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: StringFilter*): Self = StObject.set(x, "Type", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAt(value: DateFilterList): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    @scala.inline
    def setUpdatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "UpdatedAt", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFields(value: MapFilterList): Self = StObject.set(x, "UserDefinedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFieldsUndefined: Self = StObject.set(x, "UserDefinedFields", js.undefined)
    
    @scala.inline
    def setUserDefinedFieldsVarargs(value: MapFilter*): Self = StObject.set(x, "UserDefinedFields", js.Array(value :_*))
    
    @scala.inline
    def setVerificationState(value: StringFilterList): Self = StObject.set(x, "VerificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStateUndefined: Self = StObject.set(x, "VerificationState", js.undefined)
    
    @scala.inline
    def setVerificationStateVarargs(value: StringFilter*): Self = StObject.set(x, "VerificationState", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowState(value: StringFilterList): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowStateUndefined: Self = StObject.set(x, "WorkflowState", js.undefined)
    
    @scala.inline
    def setWorkflowStateVarargs(value: StringFilter*): Self = StObject.set(x, "WorkflowState", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowStatus(value: StringFilterList): Self = StObject.set(x, "WorkflowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowStatusUndefined: Self = StObject.set(x, "WorkflowStatus", js.undefined)
    
    @scala.inline
    def setWorkflowStatusVarargs(value: StringFilter*): Self = StObject.set(x, "WorkflowStatus", js.Array(value :_*))
  }
}
