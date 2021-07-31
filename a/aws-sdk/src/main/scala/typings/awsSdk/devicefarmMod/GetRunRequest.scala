package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunRequest extends StObject {
  
  /**
    * The run's ARN.
    */
  var arn: AmazonResourceName
}
object GetRunRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunRequest]
  }
  
  @scala.inline
  implicit class GetRunRequestMutableBuilder[Self <: GetRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
