package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServerEngineAttributesResponse extends StObject {
  
  /**
    * Contains the response to an UpdateServerEngineAttributes request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.native
}
object UpdateServerEngineAttributesResponse {
  
  @scala.inline
  def apply(): UpdateServerEngineAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerEngineAttributesResponse]
  }
  
  @scala.inline
  implicit class UpdateServerEngineAttributesResponseMutableBuilder[Self <: UpdateServerEngineAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
