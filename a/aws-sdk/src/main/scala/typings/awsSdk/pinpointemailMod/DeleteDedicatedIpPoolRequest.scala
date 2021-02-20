package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool that you want to delete.
    */
  var PoolName: typings.awsSdk.pinpointemailMod.PoolName = js.native
}
object DeleteDedicatedIpPoolRequest {
  
  @scala.inline
  def apply(PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
  }
  
  @scala.inline
  implicit class DeleteDedicatedIpPoolRequestMutableBuilder[Self <: DeleteDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
  }
}
