package typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod.UnmarshalledIdentityPoolShortDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ListIdentityPoolsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListIdentityPoolsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsOutput]
  }
  @scala.inline
  implicit class ListIdentityPoolsOutputOps[Self <: ListIdentityPoolsOutput] (val x: Self) extends AnyVal {
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
    def setIdentityPoolsVarargs(value: UnmarshalledIdentityPoolShortDescription*): Self = this.set("IdentityPools", js.Array(value :_*))
    @scala.inline
    def setIdentityPools(value: js.Array[UnmarshalledIdentityPoolShortDescription]): Self = this.set("IdentityPools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPools: Self = this.set("IdentityPools", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

