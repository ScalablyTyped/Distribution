package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finding extends js.Object {
  
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
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesVarargs(value: Attribute*): Self = this.set("userAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserAttributes(value: UserAttributeList): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetAttributes(value: AssetAttributes): Self = this.set("assetAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetAttributes: Self = this.set("assetAttributes", js.undefined)
    
    @scala.inline
    def setAssetType(value: AssetType): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setConfidence(value: IocConfidence): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setDescription(value: Text): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: FindingId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndicatorOfCompromise(value: Bool): Self = this.set("indicatorOfCompromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorOfCompromise: Self = this.set("indicatorOfCompromise", js.undefined)
    
    @scala.inline
    def setNumericSeverity(value: NumericSeverity): Self = this.set("numericSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericSeverity: Self = this.set("numericSeverity", js.undefined)
    
    @scala.inline
    def setRecommendation(value: Text): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendation: Self = this.set("recommendation", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: NumericVersion): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("schemaVersion", js.undefined)
    
    @scala.inline
    def setService(value: ServiceName): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setServiceAttributes(value: InspectorServiceAttributes): Self = this.set("serviceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAttributes: Self = this.set("serviceAttributes", js.undefined)
    
    @scala.inline
    def setSeverity(value: Severity): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setTitle(value: Text): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
