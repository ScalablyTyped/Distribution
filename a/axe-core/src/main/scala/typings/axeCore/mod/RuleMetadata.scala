package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMetadata extends StObject {
  
  var description: String
  
  var help: String
  
  var helpUrl: String
  
  var ruleId: String
  
  var tags: js.Array[String]
}
object RuleMetadata {
  
  inline def apply(description: String, help: String, helpUrl: String, ruleId: String, tags: js.Array[String]): RuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpUrl = helpUrl.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleMetadata]
  }
  
  extension [Self <: RuleMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
