package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAllFeaturesResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.undefined
}
object EnableAllFeaturesResponse {
  
  @scala.inline
  def apply(): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
  
  @scala.inline
  implicit class EnableAllFeaturesResponseMutableBuilder[Self <: EnableAllFeaturesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
