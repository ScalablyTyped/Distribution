package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExportJobOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
object CreateExportJobOutput {
  
  inline def apply($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): CreateExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportJobOutput]
  }
}
