package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesetItem extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that owns the ruleset.
    */
  var AccountId: js.UndefOr[typings.awsSdk.databrewMod.AccountId] = js.undefined
  
  /**
    * The date and time that the ruleset was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the ruleset.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.databrewMod.CreatedBy] = js.undefined
  
  /**
    * The description of the ruleset.
    */
  var Description: js.UndefOr[RulesetDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who last modified the ruleset.
    */
  var LastModifiedBy: js.UndefOr[typings.awsSdk.databrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The modification date and time of the ruleset.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ruleset.
    */
  var Name: RulesetName
  
  /**
    * The Amazon Resource Name (ARN) for the ruleset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The number of rules that are defined in the ruleset.
    */
  var RuleCount: js.UndefOr[typings.awsSdk.databrewMod.RuleCount] = js.undefined
  
  /**
    * Metadata tags that have been applied to the ruleset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
    */
  var TargetArn: Arn
}
object RulesetItem {
  
  inline def apply(Name: RulesetName, TargetArn: Arn): RulesetItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesetItem]
  }
  
  extension [Self <: RulesetItem](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDescription(value: RulesetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setRuleCount(value: RuleCount): Self = StObject.set(x, "RuleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleCountUndefined: Self = StObject.set(x, "RuleCount", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetArn(value: Arn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
