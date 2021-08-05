package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExportJobOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
object GetExportJobOutput {
  
  inline def apply($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): GetExportJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportJobOutput]
  }
}
