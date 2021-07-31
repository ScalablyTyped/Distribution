package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
object GetImportJobOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): GetImportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobOutput]
  }
}
