package typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod.UnmarshalledCredentials
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsForIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Credentials for the provided identity ID.</p>
    */
  var Credentials: js.UndefOr[UnmarshalledCredentials] = js.native
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
}

object GetCredentialsForIdentityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetCredentialsForIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityOutput]
  }
  @scala.inline
  implicit class GetCredentialsForIdentityOutputOps[Self <: GetCredentialsForIdentityOutput] (val x: Self) extends AnyVal {
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
    def setCredentials(value: UnmarshalledCredentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setIdentityId(value: String): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
  }
  
}

