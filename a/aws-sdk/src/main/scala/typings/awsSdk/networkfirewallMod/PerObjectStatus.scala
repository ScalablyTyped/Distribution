package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerObjectStatus extends StObject {
  
  /**
    * 
    */
  var SyncStatus: js.UndefOr[PerObjectSyncStatus] = js.undefined
}
object PerObjectStatus {
  
  inline def apply(): PerObjectStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerObjectStatus]
  }
  
  extension [Self <: PerObjectStatus](x: Self) {
    
    inline def setSyncStatus(value: PerObjectSyncStatus): Self = StObject.set(x, "SyncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "SyncStatus", js.undefined)
  }
}
