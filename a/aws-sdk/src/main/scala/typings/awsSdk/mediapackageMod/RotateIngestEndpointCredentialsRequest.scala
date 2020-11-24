package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateIngestEndpointCredentialsRequest extends js.Object {
  
  /**
    * The ID of the channel the IngestEndpoint is on.
    */
  var Id: string = js.native
  
  /**
    * The id of the IngestEndpoint whose credentials should be rotated
    */
  var IngestEndpointId: string = js.native
}
object RotateIngestEndpointCredentialsRequest {
  
  @scala.inline
  def apply(Id: string, IngestEndpointId: string): RotateIngestEndpointCredentialsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IngestEndpointId = IngestEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateIngestEndpointCredentialsRequest]
  }
  
  @scala.inline
  implicit class RotateIngestEndpointCredentialsRequestOps[Self <: RotateIngestEndpointCredentialsRequest] (val x: Self) extends AnyVal {
    
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
    def setIngestEndpointId(value: string): Self = this.set("IngestEndpointId", value.asInstanceOf[js.Any])
  }
}
