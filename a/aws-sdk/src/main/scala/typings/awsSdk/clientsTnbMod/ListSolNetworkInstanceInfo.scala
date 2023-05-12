package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkInstanceInfo extends StObject {
  
  /**
    * Network instance ARN.
    */
  var arn: NsInstanceArn
  
  /**
    * ID of the network instance.
    */
  var id: NsInstanceId
  
  /**
    * The metadata of the network instance.
    */
  var metadata: ListSolNetworkInstanceMetadata
  
  /**
    * Human-readable description of the network instance.
    */
  var nsInstanceDescription: String
  
  /**
    * Human-readable name of the network instance.
    */
  var nsInstanceName: String
  
  /**
    * The state of the network instance.
    */
  var nsState: NsState
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdId: NsdId
  
  /**
    * ID of the network service descriptor in the network package.
    */
  var nsdInfoId: NsdInfoId
}
object ListSolNetworkInstanceInfo {
  
  inline def apply(
    arn: NsInstanceArn,
    id: NsInstanceId,
    metadata: ListSolNetworkInstanceMetadata,
    nsInstanceDescription: String,
    nsInstanceName: String,
    nsState: NsState,
    nsdId: NsdId,
    nsdInfoId: NsdInfoId
  ): ListSolNetworkInstanceInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nsInstanceDescription = nsInstanceDescription.asInstanceOf[js.Any], nsInstanceName = nsInstanceName.asInstanceOf[js.Any], nsState = nsState.asInstanceOf[js.Any], nsdId = nsdId.asInstanceOf[js.Any], nsdInfoId = nsdInfoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolNetworkInstanceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkInstanceInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NsInstanceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: NsInstanceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ListSolNetworkInstanceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceDescription(value: String): Self = StObject.set(x, "nsInstanceDescription", value.asInstanceOf[js.Any])
    
    inline def setNsInstanceName(value: String): Self = StObject.set(x, "nsInstanceName", value.asInstanceOf[js.Any])
    
    inline def setNsState(value: NsState): Self = StObject.set(x, "nsState", value.asInstanceOf[js.Any])
    
    inline def setNsdId(value: NsdId): Self = StObject.set(x, "nsdId", value.asInstanceOf[js.Any])
    
    inline def setNsdInfoId(value: NsdInfoId): Self = StObject.set(x, "nsdInfoId", value.asInstanceOf[js.Any])
  }
}
