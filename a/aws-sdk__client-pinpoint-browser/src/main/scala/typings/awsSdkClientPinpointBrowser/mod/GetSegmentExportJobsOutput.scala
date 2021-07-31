package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentExportJobsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
object GetSegmentExportJobsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): GetSegmentExportJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentExportJobsOutput]
  }
}
