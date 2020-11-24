package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestEndpoint extends js.Object {
  
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
  implicit class IngestEndpointOps[Self <: IngestEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setPassword(value: string): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
