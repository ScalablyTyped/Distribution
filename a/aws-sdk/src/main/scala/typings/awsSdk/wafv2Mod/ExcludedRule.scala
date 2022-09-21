package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedRule extends StObject {
  
  /**
    * The name of the rule whose action you want to override to Count.
    */
  var Name: EntityName
}
object ExcludedRule {
  
  inline def apply(Name: EntityName): ExcludedRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedRule]
  }
  
  extension [Self <: ExcludedRule](x: Self) {
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
