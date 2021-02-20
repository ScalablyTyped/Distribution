package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to be paused.
    */
  var ClusterIdentifier: String = js.native
}
object PauseClusterMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): PauseClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseClusterMessage]
  }
  
  @scala.inline
  implicit class PauseClusterMessageMutableBuilder[Self <: PauseClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
