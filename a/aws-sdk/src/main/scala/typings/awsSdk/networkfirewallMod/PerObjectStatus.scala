package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerObjectStatus extends StObject {
  
  /**
    * 
    */
  var SyncStatus: js.UndefOr[PerObjectSyncStatus] = js.native
}
object PerObjectStatus {
  
  @scala.inline
  def apply(): PerObjectStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerObjectStatus]
  }
  
  @scala.inline
  implicit class PerObjectStatusMutableBuilder[Self <: PerObjectStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyncStatus(value: PerObjectSyncStatus): Self = StObject.set(x, "SyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncStatusUndefined: Self = StObject.set(x, "SyncStatus", js.undefined)
  }
}
