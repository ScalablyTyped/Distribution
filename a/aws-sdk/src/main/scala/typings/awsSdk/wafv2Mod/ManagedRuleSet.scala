package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn
  
  /**
    * A description of the set that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the managed rule set. The ID is returned in the responses to commands like list. You provide it to operations like get and update.
    */
  var Id: EntityId
  
  /**
    * The label namespace prefix for the managed rule groups that are offered to customers from this managed rule set. All labels that are added by rules in the managed rule group have this prefix.    The syntax for the label namespace prefix for a managed rule group is the following:   awswaf:managed:&lt;vendor&gt;:&lt;rule group name&gt;:   When a rule with a label matches a web request, WAF adds the fully qualified label to the request. A fully qualified label is made up of the label namespace from the rule group or web ACL where the rule is defined and the label from the rule, separated by a colon:   &lt;label namespace&gt;:&lt;label from rule&gt;   
    */
  var LabelNamespace: js.UndefOr[LabelName] = js.undefined
  
  /**
    * The name of the managed rule set. You use this, along with the rule set ID, to identify the rule set. This name is assigned to the corresponding managed rule group, which your customers can access and use. 
    */
  var Name: EntityName
  
  /**
    * The versions of this managed rule set that are available for use by customers. 
    */
  var PublishedVersions: js.UndefOr[typings.awsSdk.wafv2Mod.PublishedVersions] = js.undefined
  
  /**
    * The version that you would like your customers to use.
    */
  var RecommendedVersion: js.UndefOr[VersionKeyString] = js.undefined
}
object ManagedRuleSet {
  
  inline def apply(ARN: ResourceArn, Id: EntityId, Name: EntityName): ManagedRuleSet = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleSet]
  }
  
  extension [Self <: ManagedRuleSet](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespace(value: LabelName): Self = StObject.set(x, "LabelNamespace", value.asInstanceOf[js.Any])
    
    inline def setLabelNamespaceUndefined: Self = StObject.set(x, "LabelNamespace", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersions(value: PublishedVersions): Self = StObject.set(x, "PublishedVersions", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersionsUndefined: Self = StObject.set(x, "PublishedVersions", js.undefined)
    
    inline def setRecommendedVersion(value: VersionKeyString): Self = StObject.set(x, "RecommendedVersion", value.asInstanceOf[js.Any])
    
    inline def setRecommendedVersionUndefined: Self = StObject.set(x, "RecommendedVersion", js.undefined)
  }
}
