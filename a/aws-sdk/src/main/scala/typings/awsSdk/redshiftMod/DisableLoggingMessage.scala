package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableLoggingMessage extends StObject {
  
  /**
    * The identifier of the cluster on which logging is to be stopped. Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
}
object DisableLoggingMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): DisableLoggingMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableLoggingMessage]
  }
  
  @scala.inline
  implicit class DisableLoggingMessageMutableBuilder[Self <: DisableLoggingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
