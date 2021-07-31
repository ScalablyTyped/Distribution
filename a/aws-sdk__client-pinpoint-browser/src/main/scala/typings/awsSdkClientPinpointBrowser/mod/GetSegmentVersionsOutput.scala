package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentVersionsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
object GetSegmentVersionsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): GetSegmentVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionsOutput]
  }
}
