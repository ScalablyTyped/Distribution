package typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod.UnmarshalledIdentityDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var Identities: js.UndefOr[js.Array[UnmarshalledIdentityDescription]] = js.native
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIdentitiesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListIdentitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesOutput]
  }
  @scala.inline
  implicit class ListIdentitiesOutputOps[Self <: ListIdentitiesOutput] (val x: Self) extends AnyVal {
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
    def setIdentitiesVarargs(value: UnmarshalledIdentityDescription*): Self = this.set("Identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[UnmarshalledIdentityDescription]): Self = this.set("Identities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentities: Self = this.set("Identities", js.undefined)
    @scala.inline
    def setIdentityPoolId(value: String): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

