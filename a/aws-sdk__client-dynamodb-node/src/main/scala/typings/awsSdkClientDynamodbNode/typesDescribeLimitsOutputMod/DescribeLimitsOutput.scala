package typings.awsSdkClientDynamodbNode.typesDescribeLimitsOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    AccountMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    AccountMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined,
    TableMaxReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    TableMaxWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(AccountMaxReadCapacityUnits)) __obj.updateDynamic("AccountMaxReadCapacityUnits")(AccountMaxReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AccountMaxWriteCapacityUnits)) __obj.updateDynamic("AccountMaxWriteCapacityUnits")(AccountMaxWriteCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TableMaxReadCapacityUnits)) __obj.updateDynamic("TableMaxReadCapacityUnits")(TableMaxReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TableMaxWriteCapacityUnits)) __obj.updateDynamic("TableMaxWriteCapacityUnits")(TableMaxWriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

