package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPatternConditionConfig extends StObject {
  
  /**
    * One or more path patterns to compare against the request URL. The maximum size of each string is 128 characters. The comparison is case sensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If you specify multiple strings, the condition is satisfied if one of them matches the request URL. The path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use QueryStringConditionConfig.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}
object PathPatternConditionConfig {
  
  @scala.inline
  def apply(): PathPatternConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathPatternConditionConfig]
  }
  
  @scala.inline
  implicit class PathPatternConditionConfigMutableBuilder[Self <: PathPatternConditionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
