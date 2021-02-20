package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUploadRequest extends StObject {
  
  /**
    * The upload's ARN.
    */
  var arn: AmazonResourceName = js.native
}
object GetUploadRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadRequest]
  }
  
  @scala.inline
  implicit class GetUploadRequestMutableBuilder[Self <: GetUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
