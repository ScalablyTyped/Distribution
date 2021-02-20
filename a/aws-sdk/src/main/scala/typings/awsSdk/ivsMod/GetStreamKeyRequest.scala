package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStreamKeyRequest extends StObject {
  
  /**
    * ARN for the stream key to be retrieved.
    */
  var arn: StreamKeyArn = js.native
}
object GetStreamKeyRequest {
  
  @scala.inline
  def apply(arn: StreamKeyArn): GetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamKeyRequest]
  }
  
  @scala.inline
  implicit class GetStreamKeyRequestMutableBuilder[Self <: GetStreamKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: StreamKeyArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
