package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRetrievalPolicy extends StObject {
  
  /**
    * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
    */
  var Rules: js.UndefOr[DataRetrievalRulesList] = js.native
}
object DataRetrievalPolicy {
  
  @scala.inline
  def apply(): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
  
  @scala.inline
  implicit class DataRetrievalPolicyMutableBuilder[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: DataRetrievalRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: DataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
