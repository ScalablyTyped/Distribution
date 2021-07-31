package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateChannelCredentialsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.EgressAccessLogs] = js.undefined
  
  var HlsIngest: js.UndefOr[typings.awsSdk.mediapackageMod.HlsIngest] = js.undefined
  
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  var IngressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.IngressAccessLogs] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.undefined
}
object RotateChannelCredentialsResponse {
  
  @scala.inline
  def apply(): RotateChannelCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateChannelCredentialsResponse]
  }
  
  @scala.inline
  implicit class RotateChannelCredentialsResponseMutableBuilder[Self <: RotateChannelCredentialsResponse] (val x: Self) extends AnyVal {
    
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
