package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateHostsResult extends StObject {
  
  /**
    * The ID of the allocated Dedicated Host. This is used to launch an instance onto a specific host.
    */
  var HostIds: js.UndefOr[ResponseHostIdList] = js.native
}
object AllocateHostsResult {
  
  @scala.inline
  def apply(): AllocateHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateHostsResult]
  }
  
  @scala.inline
  implicit class AllocateHostsResultMutableBuilder[Self <: AllocateHostsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostIds(value: ResponseHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdsUndefined: Self = StObject.set(x, "HostIds", js.undefined)
    
    @scala.inline
    def setHostIdsVarargs(value: String*): Self = StObject.set(x, "HostIds", js.Array(value :_*))
  }
}
