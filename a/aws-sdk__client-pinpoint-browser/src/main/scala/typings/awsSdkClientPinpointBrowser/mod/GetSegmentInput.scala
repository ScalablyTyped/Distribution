package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
object GetSegmentInput {
  
  inline def apply(ApplicationId: String, SegmentId: String): GetSegmentInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentInput]
  }
}
