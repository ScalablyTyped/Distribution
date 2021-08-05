package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesImportJobRequestMod.ImportJobRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImportJobInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
object CreateImportJobInput {
  
  inline def apply(ApplicationId: String, ImportJobRequest: ImportJobRequest): CreateImportJobInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ImportJobRequest = ImportJobRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobInput]
  }
}
