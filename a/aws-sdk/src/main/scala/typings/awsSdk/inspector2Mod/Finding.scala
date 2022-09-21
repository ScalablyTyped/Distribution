package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  /**
    * The Amazon Web Services account ID associated with the finding.
    */
  var awsAccountId: AccountId
  
  /**
    * The description of the finding.
    */
  var description: FindingDescription
  
  /**
    * The Amazon Resource Number (ARN) of the finding.
    */
  var findingArn: FindingArn
  
  /**
    * The date and time that the finding was first observed.
    */
  var firstObservedAt: js.Date
  
  /**
    * Details on whether a fix is available through a version update. This value can be YES, NO, or PARTIAL. A PARTIAL fix means that some, but not all, of the packages identified in the finding have fixes available through updated versions.
    */
  var fixAvailable: js.UndefOr[FixAvailable] = js.undefined
  
  /**
    * The Amazon Inspector score given to the finding.
    */
  var inspectorScore: js.UndefOr[Double] = js.undefined
  
  /**
    * An object that contains details of the Amazon Inspector score.
    */
  var inspectorScoreDetails: js.UndefOr[InspectorScoreDetails] = js.undefined
  
  /**
    * The date and time that the finding was last observed.
    */
  var lastObservedAt: js.Date
  
  /**
    * An object that contains the details of a network reachability finding.
    */
  var networkReachabilityDetails: js.UndefOr[NetworkReachabilityDetails] = js.undefined
  
  /**
    * An object that contains the details of a package vulnerability finding.
    */
  var packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails] = js.undefined
  
  /**
    * An object that contains the details about how to remediate a finding.
    */
  var remediation: Remediation
  
  /**
    * Contains information on the resources involved in a finding.
    */
  var resources: ResourceList
  
  /**
    * The severity of the finding.
    */
  var severity: Severity
  
  /**
    * The status of the finding.
    */
  var status: FindingStatus
  
  /**
    * The title of the finding.
    */
  var title: js.UndefOr[FindingTitle] = js.undefined
  
  /**
    * The type of the finding.
    */
  var `type`: FindingType
  
  /**
    * The date and time the finding was last updated at.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Finding {
  
  inline def apply(
    awsAccountId: AccountId,
    description: FindingDescription,
    findingArn: FindingArn,
    firstObservedAt: js.Date,
    lastObservedAt: js.Date,
    remediation: Remediation,
    resources: ResourceList,
    severity: Severity,
    status: FindingStatus,
    `type`: FindingType
  ): Finding = {
    val __obj = js.Dynamic.literal(awsAccountId = awsAccountId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], findingArn = findingArn.asInstanceOf[js.Any], firstObservedAt = firstObservedAt.asInstanceOf[js.Any], lastObservedAt = lastObservedAt.asInstanceOf[js.Any], remediation = remediation.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  extension [Self <: Finding](x: Self) {
    
    inline def setAwsAccountId(value: AccountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FindingDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFindingArn(value: FindingArn): Self = StObject.set(x, "findingArn", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAt(value: js.Date): Self = StObject.set(x, "firstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFixAvailable(value: FixAvailable): Self = StObject.set(x, "fixAvailable", value.asInstanceOf[js.Any])
    
    inline def setFixAvailableUndefined: Self = StObject.set(x, "fixAvailable", js.undefined)
    
    inline def setInspectorScore(value: Double): Self = StObject.set(x, "inspectorScore", value.asInstanceOf[js.Any])
    
    inline def setInspectorScoreDetails(value: InspectorScoreDetails): Self = StObject.set(x, "inspectorScoreDetails", value.asInstanceOf[js.Any])
    
    inline def setInspectorScoreDetailsUndefined: Self = StObject.set(x, "inspectorScoreDetails", js.undefined)
    
    inline def setInspectorScoreUndefined: Self = StObject.set(x, "inspectorScore", js.undefined)
    
    inline def setLastObservedAt(value: js.Date): Self = StObject.set(x, "lastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setNetworkReachabilityDetails(value: NetworkReachabilityDetails): Self = StObject.set(x, "networkReachabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setNetworkReachabilityDetailsUndefined: Self = StObject.set(x, "networkReachabilityDetails", js.undefined)
    
    inline def setPackageVulnerabilityDetails(value: PackageVulnerabilityDetails): Self = StObject.set(x, "packageVulnerabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageVulnerabilityDetailsUndefined: Self = StObject.set(x, "packageVulnerabilityDetails", js.undefined)
    
    inline def setRemediation(value: Remediation): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: FindingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: FindingTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: FindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
