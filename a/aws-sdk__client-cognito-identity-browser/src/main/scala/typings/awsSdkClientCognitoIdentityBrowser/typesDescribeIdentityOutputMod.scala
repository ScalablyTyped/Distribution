package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/DescribeIdentityOutput", JSImport.Namespace)
@js.native
object typesDescribeIdentityOutputMod extends js.Object {
  @js.native
  trait DescribeIdentityOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Date on which the identity was created.</p>
      */
    var CreationDate: js.UndefOr[Date] = js.native
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    var LastModifiedDate: js.UndefOr[Date] = js.native
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[js.Array[String]] = js.native
  }
  
}

