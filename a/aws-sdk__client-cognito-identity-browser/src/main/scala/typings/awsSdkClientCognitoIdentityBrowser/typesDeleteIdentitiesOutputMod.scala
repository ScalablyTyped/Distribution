package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnprocessedIdentityIdMod.UnmarshalledUnprocessedIdentityId
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/DeleteIdentitiesOutput", JSImport.Namespace)
@js.native
object typesDeleteIdentitiesOutputMod extends js.Object {
  @js.native
  trait DeleteIdentitiesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
      */
    var UnprocessedIdentityIds: js.UndefOr[js.Array[UnmarshalledUnprocessedIdentityId]] = js.native
  }
  
}

