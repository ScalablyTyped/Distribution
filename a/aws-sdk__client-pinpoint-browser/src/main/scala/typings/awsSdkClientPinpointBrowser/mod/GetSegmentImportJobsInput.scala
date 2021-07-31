package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentImportJobsInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
object GetSegmentImportJobsInput {
  
  @scala.inline
  def apply(ApplicationId: String, SegmentId: String): GetSegmentImportJobsInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentImportJobsInput]
  }
}
