package typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object GetOpenIdTokenOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetOpenIdTokenOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenOutput]
  }
  @scala.inline
  implicit class GetOpenIdTokenOutputOps[Self <: GetOpenIdTokenOutput] (val x: Self) extends AnyVal {
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

