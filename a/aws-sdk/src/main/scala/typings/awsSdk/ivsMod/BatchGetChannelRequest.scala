package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetChannelRequest extends StObject {
  
  /**
    * Array of ARNs, one per channel.
    */
  var arns: ChannelArnList
}
object BatchGetChannelRequest {
  
  inline def apply(arns: ChannelArnList): BatchGetChannelRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetChannelRequest]
  }
  
  extension [Self <: BatchGetChannelRequest](x: Self) {
    
    inline def setArns(value: ChannelArnList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    inline def setArnsVarargs(value: ChannelArn*): Self = StObject.set(x, "arns", js.Array(value :_*))
  }
}
