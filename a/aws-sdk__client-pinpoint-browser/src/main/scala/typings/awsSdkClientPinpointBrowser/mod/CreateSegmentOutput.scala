package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
object CreateSegmentOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, SegmentResponse: UnmarshalledSegmentResponse): CreateSegmentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentOutput]
  }
}
