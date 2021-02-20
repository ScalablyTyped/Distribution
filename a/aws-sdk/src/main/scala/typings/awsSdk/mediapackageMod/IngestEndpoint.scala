package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestEndpoint extends StObject {
  
  /**
    * The system generated unique identifier for the IngestEndpoint
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The system generated password for ingest authentication.
    */
  var Password: js.UndefOr[string] = js.native
  
  /**
    * The ingest URL to which the source stream should be sent.
    */
  var Url: js.UndefOr[string] = js.native
  
  /**
    * The system generated username for ingest authentication.
    */
  var Username: js.UndefOr[string] = js.native
}
object IngestEndpoint {
  
  @scala.inline
  def apply(): IngestEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestEndpoint]
  }
  
  @scala.inline
  implicit class IngestEndpointMutableBuilder[Self <: IngestEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setPassword(value: string): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
