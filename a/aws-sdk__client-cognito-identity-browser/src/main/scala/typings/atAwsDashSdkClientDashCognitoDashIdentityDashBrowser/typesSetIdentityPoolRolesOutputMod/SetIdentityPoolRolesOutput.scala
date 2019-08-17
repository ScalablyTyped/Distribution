package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesSetIdentityPoolRolesOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIdentityPoolRolesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
}

object SetIdentityPoolRolesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): SetIdentityPoolRolesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[SetIdentityPoolRolesOutput]
  }
}

