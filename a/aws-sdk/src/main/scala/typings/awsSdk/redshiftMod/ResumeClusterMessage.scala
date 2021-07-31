package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to be resumed.
    */
  var ClusterIdentifier: String
}
object ResumeClusterMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ResumeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeClusterMessage]
  }
  
  @scala.inline
  implicit class ResumeClusterMessageMutableBuilder[Self <: ResumeClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
