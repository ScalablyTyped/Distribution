package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod.WriteSegmentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSegmentInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
object UpdateSegmentInput {
  
  inline def apply(ApplicationId: String, SegmentId: String, WriteSegmentRequest: WriteSegmentRequest): UpdateSegmentInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentInput]
  }
}
