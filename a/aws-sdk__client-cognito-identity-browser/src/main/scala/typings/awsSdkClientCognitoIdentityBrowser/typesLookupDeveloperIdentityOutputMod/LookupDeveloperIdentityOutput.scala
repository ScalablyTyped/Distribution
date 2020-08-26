package typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupDeveloperIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.</p>
    */
  var DeveloperUserIdentifierList: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  /**
    * <p>A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service will return <code>NextToken</code> values as needed. For example, let's say you make a request with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
}

object LookupDeveloperIdentityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): LookupDeveloperIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityOutput]
  }
  @scala.inline
  implicit class LookupDeveloperIdentityOutputOps[Self <: LookupDeveloperIdentityOutput] (val x: Self) extends AnyVal {
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
    def setDeveloperUserIdentifierListVarargs(value: String*): Self = this.set("DeveloperUserIdentifierList", js.Array(value :_*))
    @scala.inline
    def setDeveloperUserIdentifierList(value: js.Array[String]): Self = this.set("DeveloperUserIdentifierList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperUserIdentifierList: Self = this.set("DeveloperUserIdentifierList", js.undefined)
    @scala.inline
    def setIdentityId(value: String): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

