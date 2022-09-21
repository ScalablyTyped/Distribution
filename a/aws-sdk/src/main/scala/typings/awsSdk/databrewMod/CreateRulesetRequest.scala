package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRulesetRequest extends StObject {
  
  /**
    * The description of the ruleset.
    */
  var Description: js.UndefOr[RulesetDescription] = js.undefined
  
  /**
    * The name of the ruleset to be created. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and space.
    */
  var Name: RulesetName
  
  /**
    * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a DataBrew dataset.
    */
  var Rules: RuleList
  
  /**
    * Metadata tags to apply to the ruleset.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
    */
  var TargetArn: Arn
}
object CreateRulesetRequest {
  
  inline def apply(Name: RulesetName, Rules: RuleList, TargetArn: Arn): CreateRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRulesetRequest]
  }
  
  extension [Self <: CreateRulesetRequest](x: Self) {
    
    inline def setDescription(value: RulesetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetArn(value: Arn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
