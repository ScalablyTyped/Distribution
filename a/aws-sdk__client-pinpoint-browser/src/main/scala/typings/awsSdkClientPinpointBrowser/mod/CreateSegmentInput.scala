package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod.WriteSegmentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
object CreateSegmentInput {
  
  inline def apply(ApplicationId: String, WriteSegmentRequest: WriteSegmentRequest): CreateSegmentInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentInput]
  }
}
