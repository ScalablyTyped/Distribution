package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestRequest extends StObject {
  
  /**
    * The test's ARN.
    */
  var arn: AmazonResourceName = js.native
}
object GetTestRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetTestRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestRequest]
  }
  
  @scala.inline
  implicit class GetTestRequestMutableBuilder[Self <: GetTestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
