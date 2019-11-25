package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeLimitsOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLimitsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The maximum total read capacity units that your account allows you to provision across all of your tables in this region.</p>
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum total write capacity units that your account allows you to provision across all of your tables in this region.</p>
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum read capacity units that your account allows you to provision for a new table that you are creating in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum write capacity units that your account allows you to provision for a new table that you are creating in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AccountMaxReadCapacityUnits: Int | Double = null,
    AccountMaxWriteCapacityUnits: Int | Double = null,
    TableMaxReadCapacityUnits: Int | Double = null,
    TableMaxWriteCapacityUnits: Int | Double = null
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AccountMaxReadCapacityUnits != null) __obj.updateDynamic("AccountMaxReadCapacityUnits")(AccountMaxReadCapacityUnits.asInstanceOf[js.Any])
    if (AccountMaxWriteCapacityUnits != null) __obj.updateDynamic("AccountMaxWriteCapacityUnits")(AccountMaxWriteCapacityUnits.asInstanceOf[js.Any])
    if (TableMaxReadCapacityUnits != null) __obj.updateDynamic("TableMaxReadCapacityUnits")(TableMaxReadCapacityUnits.asInstanceOf[js.Any])
    if (TableMaxWriteCapacityUnits != null) __obj.updateDynamic("TableMaxWriteCapacityUnits")(TableMaxWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

