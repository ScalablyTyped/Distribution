package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
object CreateAppOutput {
  
  inline def apply($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): CreateAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppOutput]
  }
}
