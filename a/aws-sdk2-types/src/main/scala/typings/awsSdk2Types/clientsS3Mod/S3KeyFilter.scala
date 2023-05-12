package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3KeyFilter extends StObject {
  
  var FilterRules: js.UndefOr[FilterRuleList] = js.undefined
}
object S3KeyFilter {
  
  inline def apply(): S3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3KeyFilter] (val x: Self) extends AnyVal {
    
    inline def setFilterRules(value: FilterRuleList): Self = StObject.set(x, "FilterRules", value.asInstanceOf[js.Any])
    
    inline def setFilterRulesUndefined: Self = StObject.set(x, "FilterRules", js.undefined)
    
    inline def setFilterRulesVarargs(value: FilterRule*): Self = StObject.set(x, "FilterRules", js.Array(value*))
  }
}
