package typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpenIdTokenForDeveloperIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  /**
    * <p>An OpenID token.</p>
    */
  var Token: js.UndefOr[String] = js.native
}

object GetOpenIdTokenForDeveloperIdentityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetOpenIdTokenForDeveloperIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityOutput]
  }
  @scala.inline
  implicit class GetOpenIdTokenForDeveloperIdentityOutputOps[Self <: GetOpenIdTokenForDeveloperIdentityOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityId(value: String): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("Token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("Token", js.undefined)
  }
  
}

