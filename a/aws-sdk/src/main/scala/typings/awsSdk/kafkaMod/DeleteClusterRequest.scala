package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
}
object DeleteClusterRequest {
  
  @scala.inline
  def apply(ClusterArn: string): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  @scala.inline
  implicit class DeleteClusterRequestMutableBuilder[Self <: DeleteClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
  }
}
