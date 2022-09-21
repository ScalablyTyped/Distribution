package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareRule extends StObject {
  
  /**
    * The IDs of the Amazon Web Services accounts with which to share the snapshots.
    */
  var TargetAccounts: ShareTargetAccountList
  
  /**
    * The period after which snapshots that are shared with other Amazon Web Services accounts are automatically unshared.
    */
  var UnshareInterval: js.UndefOr[Interval] = js.undefined
  
  /**
    * The unit of time for the automatic unsharing interval.
    */
  var UnshareIntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
}
object ShareRule {
  
  inline def apply(TargetAccounts: ShareTargetAccountList): ShareRule = {
    val __obj = js.Dynamic.literal(TargetAccounts = TargetAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareRule]
  }
  
  extension [Self <: ShareRule](x: Self) {
    
    inline def setTargetAccounts(value: ShareTargetAccountList): Self = StObject.set(x, "TargetAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetAccountsVarargs(value: AwsAccountId*): Self = StObject.set(x, "TargetAccounts", js.Array(value*))
    
    inline def setUnshareInterval(value: Interval): Self = StObject.set(x, "UnshareInterval", value.asInstanceOf[js.Any])
    
    inline def setUnshareIntervalUndefined: Self = StObject.set(x, "UnshareInterval", js.undefined)
    
    inline def setUnshareIntervalUnit(value: RetentionIntervalUnitValues): Self = StObject.set(x, "UnshareIntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setUnshareIntervalUnitUndefined: Self = StObject.set(x, "UnshareIntervalUnit", js.undefined)
  }
}
