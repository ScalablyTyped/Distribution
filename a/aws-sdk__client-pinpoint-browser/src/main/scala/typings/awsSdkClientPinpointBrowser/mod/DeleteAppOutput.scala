package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
object DeleteAppOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ApplicationResponse: UnmarshalledApplicationResponse): DeleteAppOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppOutput]
  }
}
