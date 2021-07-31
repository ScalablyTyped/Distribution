package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectRequest extends StObject {
  
  /**
    * The project's ARN.
    */
  var arn: AmazonResourceName
}
object GetProjectRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectRequest]
  }
  
  @scala.inline
  implicit class GetProjectRequestMutableBuilder[Self <: GetProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
