package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLevelPermissionTagConfiguration extends StObject {
  
  /**
    * The status of row-level security tags. If enabled, the status is ENABLED. If disabled, the status is DISABLED.
    */
  var Status: js.UndefOr[typings.awsSdk.quicksightMod.Status] = js.undefined
  
  /**
    * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
    */
  var TagRules: RowLevelPermissionTagRuleList
}
object RowLevelPermissionTagConfiguration {
  
  inline def apply(TagRules: RowLevelPermissionTagRuleList): RowLevelPermissionTagConfiguration = {
    val __obj = js.Dynamic.literal(TagRules = TagRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionTagConfiguration]
  }
  
  extension [Self <: RowLevelPermissionTagConfiguration](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTagRules(value: RowLevelPermissionTagRuleList): Self = StObject.set(x, "TagRules", value.asInstanceOf[js.Any])
    
    inline def setTagRulesVarargs(value: RowLevelPermissionTagRule*): Self = StObject.set(x, "TagRules", js.Array(value*))
  }
}
