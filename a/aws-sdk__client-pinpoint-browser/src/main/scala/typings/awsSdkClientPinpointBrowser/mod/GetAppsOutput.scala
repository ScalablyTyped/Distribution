package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
object GetAppsOutput {
  
  inline def apply($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): GetAppsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsOutput]
  }
}
