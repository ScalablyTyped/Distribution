package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringConditionConfig extends StObject {
  
  /**
    * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query string, you must escape these characters in Values using a '\' character. If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the query string.
    */
  var Values: js.UndefOr[QueryStringKeyValuePairList] = js.native
}
object QueryStringConditionConfig {
  
  @scala.inline
  def apply(): QueryStringConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringConditionConfig]
  }
  
  @scala.inline
  implicit class QueryStringConditionConfigMutableBuilder[Self <: QueryStringConditionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: QueryStringKeyValuePairList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: QueryStringKeyValuePair*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
