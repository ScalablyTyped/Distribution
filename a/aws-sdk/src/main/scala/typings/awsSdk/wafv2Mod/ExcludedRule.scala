package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludedRule extends StObject {
  
  /**
    * The name of the rule to exclude.
    */
  var Name: EntityName = js.native
}
object ExcludedRule {
  
  @scala.inline
  def apply(Name: EntityName): ExcludedRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedRule]
  }
  
  @scala.inline
  implicit class ExcludedRuleMutableBuilder[Self <: ExcludedRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
