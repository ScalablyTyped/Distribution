package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an instance profile.
    */
  var arn: AmazonResourceName
}
object GetInstanceProfileRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
  
  @scala.inline
  implicit class GetInstanceProfileRequestMutableBuilder[Self <: GetInstanceProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
