package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreIdentityDescriptionMod._UnmarshalledIdentityDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/ListIdentitiesOutput", JSImport.Namespace)
@js.native
object typesListIdentitiesOutputMod extends js.Object {
  @js.native
  trait ListIdentitiesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An object containing a set of identities and associated mappings.</p>
      */
    var Identities: js.UndefOr[js.Array[_UnmarshalledIdentityDescription]] = js.native
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.native
    /**
      * <p>A pagination token.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  
}

