package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventStreamOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
object PutEventStreamOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): PutEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventStreamOutput]
  }
}
