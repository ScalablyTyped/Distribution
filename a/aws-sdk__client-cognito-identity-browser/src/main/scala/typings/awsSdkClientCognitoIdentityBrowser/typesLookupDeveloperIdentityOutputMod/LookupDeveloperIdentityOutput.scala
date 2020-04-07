package typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupDeveloperIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.</p>
    */
  var DeveloperUserIdentifierList: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service will return <code>NextToken</code> values as needed. For example, let's say you make a request with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object LookupDeveloperIdentityOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    DeveloperUserIdentifierList: js.Array[String] = null,
    IdentityId: String = null,
    NextToken: String = null
  ): LookupDeveloperIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (DeveloperUserIdentifierList != null) __obj.updateDynamic("DeveloperUserIdentifierList")(DeveloperUserIdentifierList.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityOutput]
  }
}

