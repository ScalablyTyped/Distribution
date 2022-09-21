package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupVersion extends StObject {
  
  /**
    * The date and time that the managed rule group owner updated the rule group version information. 
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version name. 
    */
  var Name: js.UndefOr[VersionKeyString] = js.undefined
}
object ManagedRuleGroupVersion {
  
  inline def apply(): ManagedRuleGroupVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupVersion]
  }
  
  extension [Self <: ManagedRuleGroupVersion](x: Self) {
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setName(value: VersionKeyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
