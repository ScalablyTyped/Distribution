package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTestGridUrlRequest extends StObject {
  
  /**
    * Lifetime, in seconds, of the URL.
    */
  var expiresInSeconds: TestGridUrlExpiresInSecondsInput
  
  /**
    * ARN (from CreateTestGridProject or ListTestGridProjects) to associate with the short-term URL. 
    */
  var projectArn: DeviceFarmArn
}
object CreateTestGridUrlRequest {
  
  @scala.inline
  def apply(expiresInSeconds: TestGridUrlExpiresInSecondsInput, projectArn: DeviceFarmArn): CreateTestGridUrlRequest = {
    val __obj = js.Dynamic.literal(expiresInSeconds = expiresInSeconds.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridUrlRequest]
  }
  
  @scala.inline
  implicit class CreateTestGridUrlRequestMutableBuilder[Self <: CreateTestGridUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresInSeconds(value: TestGridUrlExpiresInSecondsInput): Self = StObject.set(x, "expiresInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
  }
}
