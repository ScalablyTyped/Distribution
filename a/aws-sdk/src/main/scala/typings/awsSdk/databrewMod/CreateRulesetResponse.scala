package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRulesetResponse extends StObject {
  
  /**
    * The unique name of the created ruleset.
    */
  var Name: RulesetName
}
object CreateRulesetResponse {
  
  inline def apply(Name: RulesetName): CreateRulesetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRulesetResponse]
  }
  
  extension [Self <: CreateRulesetResponse](x: Self) {
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
