package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateIngestEndpointCredentialsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.native
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.EgressAccessLogs] = js.native
  
  var HlsIngest: js.UndefOr[typings.awsSdk.mediapackageMod.HlsIngest] = js.native
  
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.native
  
  var IngressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.IngressAccessLogs] = js.native
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.native
}
object RotateIngestEndpointCredentialsResponse {
  
  @scala.inline
  def apply(): RotateIngestEndpointCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateIngestEndpointCredentialsResponse]
  }
  
  @scala.inline
  implicit class RotateIngestEndpointCredentialsResponseMutableBuilder[Self <: RotateIngestEndpointCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    @scala.inline
    def setHlsIngest(value: HlsIngest): Self = StObject.set(x, "HlsIngest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsIngestUndefined: Self = StObject.set(x, "HlsIngest", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIngressAccessLogs(value: IngressAccessLogs): Self = StObject.set(x, "IngressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressAccessLogsUndefined: Self = StObject.set(x, "IngressAccessLogs", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
