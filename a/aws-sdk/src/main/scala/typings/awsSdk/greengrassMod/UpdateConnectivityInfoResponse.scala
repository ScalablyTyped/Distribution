package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectivityInfoResponse extends StObject {
  
  /**
    * A message about the connectivity info update request.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The new version of the connectivity info.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object UpdateConnectivityInfoResponse {
  
  @scala.inline
  def apply(): UpdateConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectivityInfoResponse]
  }
  
  @scala.inline
  implicit class UpdateConnectivityInfoResponseMutableBuilder[Self <: UpdateConnectivityInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
