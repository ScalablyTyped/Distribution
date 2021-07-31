package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventStreamOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
object DeleteEventStreamOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): DeleteEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventStreamOutput]
  }
}
