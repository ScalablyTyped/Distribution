package typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityPoolRolesOutput]
  }
}

