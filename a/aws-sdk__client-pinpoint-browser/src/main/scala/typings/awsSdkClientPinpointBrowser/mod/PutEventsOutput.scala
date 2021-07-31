package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEventsResponseMod.UnmarshalledEventsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
object PutEventsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EventsResponse: UnmarshalledEventsResponse): PutEventsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventsResponse = EventsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsOutput]
  }
}
