package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACLsUpdateStatus extends StObject {
  
  /**
    * A list of ACLs pending to be applied.
    */
  var ACLToApply: js.UndefOr[ACLName] = js.undefined
}
object ACLsUpdateStatus {
  
  inline def apply(): ACLsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ACLsUpdateStatus]
  }
  
  extension [Self <: ACLsUpdateStatus](x: Self) {
    
    inline def setACLToApply(value: ACLName): Self = StObject.set(x, "ACLToApply", value.asInstanceOf[js.Any])
    
    inline def setACLToApplyUndefined: Self = StObject.set(x, "ACLToApply", js.undefined)
  }
}
