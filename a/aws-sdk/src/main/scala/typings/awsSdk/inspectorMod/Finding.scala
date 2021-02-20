package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finding extends StObject {
  
  /**
    * The ARN that specifies the finding.
    */
  var arn: Arn = js.native
  
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var assetAttributes: js.UndefOr[AssetAttributes] = js.native
  
  /**
    * The type of the host from which the finding is generated.
    */
  var assetType: js.UndefOr[AssetType] = js.native
  
  /**
    * The system-defined attributes for the finding.
    */
  var attributes: AttributeList = js.native
  
  /**
    * This data element is currently not used.
    */
  var confidence: js.UndefOr[IocConfidence] = js.native
  
  /**
    * The time when the finding was generated.
    */
  var createdAt: Timestamp = js.native
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[Text] = js.native
  
  /**
    * The ID of the finding.
    */
  var id: js.UndefOr[FindingId] = js.native
  
  /**
    * This data element is currently not used.
    */
  var indicatorOfCompromise: js.UndefOr[Bool] = js.native
  
  /**
    * The numeric value of the finding severity.
    */
  var numericSeverity: js.UndefOr[NumericSeverity] = js.native
  
  /**
    * The recommendation for the finding.
    */
  var recommendation: js.UndefOr[Text] = js.native
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: js.UndefOr[NumericVersion] = js.native
  
  /**
    * The data element is set to "Inspector".
    */
  var service: js.UndefOr[ServiceName] = js.native
  
  /**
    * This data type is used in the Finding data type.
    */
  var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.native
  
  /**
    * The finding severity. Values can be set to High, Medium, Low, and Informational.
    */
  var severity: js.UndefOr[Severity] = js.native
  
  /**
    * The name of the finding.
    */
  var title: js.UndefOr[Text] = js.native
  
  /**
    * The time when AddAttributesToFindings is called.
    */
  var updatedAt: Timestamp = js.native
  
  /**
    * The user-defined attributes that are assigned to the finding.
    */
  var userAttributes: UserAttributeList = js.native
}
object Finding {
  
  @scala.inline
  def apply(
    arn: Arn,
    attributes: AttributeList,
    createdAt: Timestamp,
    updatedAt: Timestamp,
    userAttributes: UserAttributeList
  ): Finding = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit class FindingMutableBuilder[Self <: Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetAttributes(value: AssetAttributes): Self = StObject.set(x, "assetAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetAttributesUndefined: Self = StObject.set(x, "assetAttributes", js.undefined)
    
    @scala.inline
    def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: IocConfidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndicatorOfCompromise(value: Bool): Self = StObject.set(x, "indicatorOfCompromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorOfCompromiseUndefined: Self = StObject.set(x, "indicatorOfCompromise", js.undefined)
    
    @scala.inline
    def setNumericSeverity(value: NumericSeverity): Self = StObject.set(x, "numericSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericSeverityUndefined: Self = StObject.set(x, "numericSeverity", js.undefined)
    
    @scala.inline
    def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    @scala.inline
    def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAttributes(value: InspectorServiceAttributes): Self = StObject.set(x, "serviceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAttributesUndefined: Self = StObject.set(x, "serviceAttributes", js.undefined)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: UserAttributeList): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesVarargs(value: Attribute*): Self = StObject.set(x, "userAttributes", js.Array(value :_*))
  }
}
