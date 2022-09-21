package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action, specify a client token in the request.
    */
  var ClientToken: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var ClusterName: stringMin1Max64PatternS
  
  /**
    * The tags associated with the cluster.
    */
  var Tags: js.UndefOr[mapOfStringMin0Max256PatternS] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(ClusterName: stringMin1Max64PatternS): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  extension [Self <: CreateClusterRequest](x: Self) {
    
    inline def setClientToken(value: stringMin1Max64PatternS): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setClusterName(value: stringMin1Max64PatternS): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfStringMin0Max256PatternS): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
