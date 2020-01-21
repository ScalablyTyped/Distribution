package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod.UnmarshalledIdentityPoolShortDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/ListIdentityPoolsOutput", JSImport.Namespace)
@js.native
object typesListIdentityPoolsOutputMod extends js.Object {
  @js.native
  trait ListIdentityPoolsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The identity pools returned by the ListIdentityPools action.</p>
      */
    var IdentityPools: js.UndefOr[js.Array[UnmarshalledIdentityPoolShortDescription]] = js.native
    /**
      * <p>A pagination token.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  
}

