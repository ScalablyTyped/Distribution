package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRunRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm run to stop.
    */
  var arn: AmazonResourceName
}
object StopRunRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): StopRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRunRequest]
  }
  
  @scala.inline
  implicit class StopRunRequestMutableBuilder[Self <: StopRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
