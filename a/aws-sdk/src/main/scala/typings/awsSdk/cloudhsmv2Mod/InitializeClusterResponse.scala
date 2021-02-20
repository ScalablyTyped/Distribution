package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeClusterResponse extends StObject {
  
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
}
object InitializeClusterResponse {
  
  @scala.inline
  def apply(): InitializeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeClusterResponse]
  }
  
  @scala.inline
  implicit class InitializeClusterResponseMutableBuilder[Self <: InitializeClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessage(value: StateMessage): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
