package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetStreamKeyRequest extends StObject {
  
  /**
    * Array of ARNs, one per channel.
    */
  var arns: StreamKeyArnList
}
object BatchGetStreamKeyRequest {
  
  inline def apply(arns: StreamKeyArnList): BatchGetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetStreamKeyRequest]
  }
  
  extension [Self <: BatchGetStreamKeyRequest](x: Self) {
    
    inline def setArns(value: StreamKeyArnList): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
    
    inline def setArnsVarargs(value: StreamKeyArn*): Self = StObject.set(x, "arns", js.Array(value :_*))
  }
}
