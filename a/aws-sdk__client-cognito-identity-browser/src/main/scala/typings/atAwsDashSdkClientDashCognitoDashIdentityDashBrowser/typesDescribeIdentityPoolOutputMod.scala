package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCognitoIdentityProviderMod._UnmarshalledCognitoIdentityProvider
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/DescribeIdentityPoolOutput", JSImport.Namespace)
@js.native
object typesDescribeIdentityPoolOutputMod extends js.Object {
  @js.native
  trait DescribeIdentityPoolOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>TRUE if the identity pool supports unauthenticated logins.</p>
      */
    var AllowUnauthenticatedIdentities: Boolean = js.native
    /**
      * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
      */
    var CognitoIdentityProviders: js.UndefOr[js.Array[_UnmarshalledCognitoIdentityProvider]] = js.native
    /**
      * <p>The "domain" by which Cognito will refer to your users.</p>
      */
    var DeveloperProviderName: js.UndefOr[String] = js.native
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String = js.native
    /**
      * <p>A string that you provide.</p>
      */
    var IdentityPoolName: String = js.native
    /**
      * <p>A list of OpendID Connect provider ARNs.</p>
      */
    var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
    /**
      * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
      */
    var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
    /**
      * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
      */
    var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
  }
  
}

