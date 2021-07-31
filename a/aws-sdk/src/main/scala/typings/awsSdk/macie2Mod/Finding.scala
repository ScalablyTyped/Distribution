package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  /**
    * The unique identifier for the AWS account that the finding applies to. This is typically the account that owns the affected resource.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the finding is archived.
    */
  var archived: js.UndefOr[boolean] = js.undefined
  
  /**
    * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for a policy finding.
    */
  var category: js.UndefOr[FindingCategory] = js.undefined
  
  /**
    * The details of a sensitive data finding. This value is null for a policy finding.
    */
  var classificationDetails: js.UndefOr[ClassificationDetails] = js.undefined
  
  /**
    * The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All sensitive data findings are considered new (unique) because they derive from individual classification jobs.
    */
  var count: js.UndefOr[long] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a finding when it creates the finding.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS partition that Amazon Macie created the finding in.
    */
  var partition: js.UndefOr[string] = js.undefined
  
  /**
    * The details of a policy finding. This value is null for a sensitive data finding.
    */
  var policyDetails: js.UndefOr[PolicyDetails] = js.undefined
  
  /**
    * The AWS Region that Amazon Macie created the finding in.
    */
  var region: js.UndefOr[string] = js.undefined
  
  /**
    * The resources that the finding applies to.
    */
  var resourcesAffected: js.UndefOr[ResourcesAffected] = js.undefined
  
  /**
    * Specifies whether the finding is a sample finding. A sample finding is a finding that uses example data to demonstrate what a finding might contain.
    */
  var sample: js.UndefOr[boolean] = js.undefined
  
  /**
    * The version of the schema that was used to define the data structures in the finding.
    */
  var schemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The severity level and score for the finding.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
    * The brief description of the finding.
    */
  var title: js.UndefOr[string] = js.undefined
  
  /**
    * The type of the finding.
    */
  var `type`: js.UndefOr[FindingType] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data findings, this value is the same as the value for the createdAt property. All sensitive data findings are considered new (unique) because they derive from individual classification jobs.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.undefined
}
object Finding {
  
  @scala.inline
  def apply(): Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit class FindingMutableBuilder[Self <: Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArchived(value: boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setCategory(value: FindingCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setClassificationDetails(value: ClassificationDetails): Self = StObject.set(x, "classificationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationDetailsUndefined: Self = StObject.set(x, "classificationDetails", js.undefined)
    
    @scala.inline
    def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPartition(value: string): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = StObject.set(x, "policyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDetailsUndefined: Self = StObject.set(x, "policyDetails", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setResourcesAffected(value: ResourcesAffected): Self = StObject.set(x, "resourcesAffected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesAffectedUndefined: Self = StObject.set(x, "resourcesAffected", js.undefined)
    
    @scala.inline
    def setSample(value: boolean): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    @scala.inline
    def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: FindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: timestampIso8601): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
