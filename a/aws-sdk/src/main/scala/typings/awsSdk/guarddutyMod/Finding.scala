package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  /**
    * The ID of the account in which the finding was generated.
    */
  var AccountId: String
  
  /**
    * The ARN of the finding.
    */
  var Arn: String
  
  /**
    * The confidence score for the finding.
    */
  var Confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * The time and date when the finding was created.
    */
  var CreatedAt: String
  
  /**
    * The description of the finding.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the finding.
    */
  var Id: String
  
  /**
    * The partition associated with the finding.
    */
  var Partition: js.UndefOr[String] = js.undefined
  
  /**
    * The Region where the finding was generated.
    */
  var Region: String
  
  var Resource: typings.awsSdk.guarddutyMod.Resource
  
  /**
    * The version of the schema used for the finding.
    */
  var SchemaVersion: String
  
  var Service: js.UndefOr[typings.awsSdk.guarddutyMod.Service] = js.undefined
  
  /**
    * The severity of the finding.
    */
  var Severity: Double
  
  /**
    * The title of the finding.
    */
  var Title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of finding.
    */
  var Type: FindingType
  
  /**
    * The time and date when the finding was last updated.
    */
  var UpdatedAt: String
}
object Finding {
  
  @scala.inline
  def apply(
    AccountId: String,
    Arn: String,
    CreatedAt: String,
    Id: String,
    Region: String,
    Resource: Resource,
    SchemaVersion: String,
    Severity: Double,
    Type: FindingType,
    UpdatedAt: String
  ): Finding = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit class FindingMutableBuilder[Self <: Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: String): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersion(value: String): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    @scala.inline
    def setSeverity(value: Double): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setType(value: FindingType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
