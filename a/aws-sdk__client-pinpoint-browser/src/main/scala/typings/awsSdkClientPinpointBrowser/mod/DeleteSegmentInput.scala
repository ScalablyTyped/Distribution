package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSegmentInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
object DeleteSegmentInput {
  
  @scala.inline
  def apply(ApplicationId: String, SegmentId: String): DeleteSegmentInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSegmentInput]
  }
}
