package typings.awsSdkClientDynamodbBrowser.typesDescribeLimitsOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLimitsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The maximum total read capacity units that your account allows you to provision across all of your tables in this region.</p>
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The maximum total write capacity units that your account allows you to provision across all of your tables in this region.</p>
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The maximum read capacity units that your account allows you to provision for a new table that you are creating in this region, including the read capacity units provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The maximum write capacity units that your account allows you to provision for a new table that you are creating in this region, including the write capacity units provisioned for its global secondary indexes (GSIs).</p>
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[Double] = js.native
}

object DescribeLimitsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  @scala.inline
  implicit class DescribeLimitsOutputOps[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
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
    def setAccountMaxReadCapacityUnits(value: Double): Self = this.set("AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountMaxReadCapacityUnits: Self = this.set("AccountMaxReadCapacityUnits", js.undefined)
    @scala.inline
    def setAccountMaxWriteCapacityUnits(value: Double): Self = this.set("AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountMaxWriteCapacityUnits: Self = this.set("AccountMaxWriteCapacityUnits", js.undefined)
    @scala.inline
    def setTableMaxReadCapacityUnits(value: Double): Self = this.set("TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableMaxReadCapacityUnits: Self = this.set("TableMaxReadCapacityUnits", js.undefined)
    @scala.inline
    def setTableMaxWriteCapacityUnits(value: Double): Self = this.set("TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableMaxWriteCapacityUnits: Self = this.set("TableMaxWriteCapacityUnits", js.undefined)
  }
  
}

