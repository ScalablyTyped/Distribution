package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowMediaStreamRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var FlowArn: string
  
  /**
    * The name of the media stream that you want to remove.
    */
  var MediaStreamName: string
}
object RemoveFlowMediaStreamRequest {
  
  inline def apply(FlowArn: string, MediaStreamName: string): RemoveFlowMediaStreamRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowMediaStreamRequest]
  }
  
  extension [Self <: RemoveFlowMediaStreamRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
  }
}
