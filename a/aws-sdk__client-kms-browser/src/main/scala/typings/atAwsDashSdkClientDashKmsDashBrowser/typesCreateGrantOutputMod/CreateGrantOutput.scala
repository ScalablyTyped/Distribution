package typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateGrantOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGrantOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The unique identifier for the grant.</p> <p>You can use the <code>GrantId</code> in a subsequent <a>RetireGrant</a> or <a>RevokeGrant</a> operation.</p>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  /**
    * <p>The grant token.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var GrantToken: js.UndefOr[String] = js.undefined
}

object CreateGrantOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, GrantId: String = null, GrantToken: String = null): CreateGrantOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId)
    if (GrantToken != null) __obj.updateDynamic("GrantToken")(GrantToken)
    __obj.asInstanceOf[CreateGrantOutput]
  }
}

