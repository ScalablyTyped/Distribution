package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
object GetImportJobsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): GetImportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobsOutput]
  }
}
