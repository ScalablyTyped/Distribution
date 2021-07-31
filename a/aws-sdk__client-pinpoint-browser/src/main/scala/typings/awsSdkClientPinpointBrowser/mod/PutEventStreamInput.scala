package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteEventStreamMod.WriteEventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventStreamInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
object PutEventStreamInput {
  
  @scala.inline
  def apply(ApplicationId: String, WriteEventStream: WriteEventStream): PutEventStreamInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteEventStream = WriteEventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventStreamInput]
  }
}
