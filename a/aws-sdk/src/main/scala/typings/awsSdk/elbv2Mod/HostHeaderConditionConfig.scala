package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostHeaderConditionConfig extends StObject {
  
  /**
    * One or more host names. The maximum size of each name is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If you specify multiple strings, the condition is satisfied if one of the strings matches the host name.
    */
  var Values: js.UndefOr[ListOfString] = js.undefined
}
object HostHeaderConditionConfig {
  
  inline def apply(): HostHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostHeaderConditionConfig]
  }
  
  extension [Self <: HostHeaderConditionConfig](x: Self) {
    
    inline def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
