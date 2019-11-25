package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDescribeIdentityOutputMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Date on which the identity was created.</p>
    */
  var CreationDate: js.UndefOr[Date] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  var Logins: js.UndefOr[js.Array[String]] = js.undefined
}

object DescribeIdentityOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CreationDate: Date = null,
    IdentityId: String = null,
    LastModifiedDate: Date = null,
    Logins: js.Array[String] = null
  ): DescribeIdentityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Logins != null) __obj.updateDynamic("Logins")(Logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityOutput]
  }
}

