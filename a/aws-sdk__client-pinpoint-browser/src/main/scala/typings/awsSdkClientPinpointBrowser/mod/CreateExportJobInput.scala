package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesExportJobRequestMod.ExportJobRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportJobInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
object CreateExportJobInput {
  
  @scala.inline
  def apply(ApplicationId: String, ExportJobRequest: ExportJobRequest): CreateExportJobInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ExportJobRequest = ExportJobRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobInput]
  }
}
