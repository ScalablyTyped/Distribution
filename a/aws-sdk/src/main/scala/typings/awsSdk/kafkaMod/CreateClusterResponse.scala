package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The name of the MSK cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.undefined
}
object CreateClusterResponse {
  
  @scala.inline
  def apply(): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResponse]
  }
  
  @scala.inline
  implicit class CreateClusterResponseMutableBuilder[Self <: CreateClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterName(value: string): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    @scala.inline
    def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
