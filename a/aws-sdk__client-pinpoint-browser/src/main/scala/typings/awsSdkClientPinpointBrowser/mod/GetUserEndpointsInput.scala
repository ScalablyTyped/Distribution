package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserEndpointsInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
object GetUserEndpointsInput {
  
  @scala.inline
  def apply(ApplicationId: String, UserId: String): GetUserEndpointsInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsInput]
  }
}
