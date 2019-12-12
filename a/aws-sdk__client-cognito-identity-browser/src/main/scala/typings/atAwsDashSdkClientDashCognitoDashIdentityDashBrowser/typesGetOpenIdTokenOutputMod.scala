package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/GetOpenIdTokenOutput", JSImport.Namespace)
@js.native
object typesGetOpenIdTokenOutputMod extends js.Object {
  @js.native
  trait GetOpenIdTokenOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
    /**
      * <p>An OpenID token, valid for 15 minutes.</p>
      */
    var Token: js.UndefOr[String] = js.native
  }
  
}

