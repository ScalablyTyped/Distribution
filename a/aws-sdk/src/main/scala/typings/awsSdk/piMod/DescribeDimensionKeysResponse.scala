package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionKeysResponse extends js.Object {
  /**
    * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * The dimension keys that were requested.
    */
  var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
    */
  var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.native
}

object DescribeDimensionKeysResponse {
  @scala.inline
  def apply(): DescribeDimensionKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDimensionKeysResponse]
  }
  @scala.inline
  implicit class DescribeDimensionKeysResponseOps[Self <: DescribeDimensionKeysResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignedEndTime(value: ISOTimestamp): Self = this.set("AlignedEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedEndTime: Self = this.set("AlignedEndTime", js.undefined)
    @scala.inline
    def setAlignedStartTime(value: ISOTimestamp): Self = this.set("AlignedStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedStartTime: Self = this.set("AlignedStartTime", js.undefined)
    @scala.inline
    def setKeysVarargs(value: DimensionKeyDescription*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: DimensionKeyDescriptionList): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("Keys", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPartitionKeysVarargs(value: ResponsePartitionKey*): Self = this.set("PartitionKeys", js.Array(value :_*))
    @scala.inline
    def setPartitionKeys(value: ResponsePartitionKeyList): Self = this.set("PartitionKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionKeys: Self = this.set("PartitionKeys", js.undefined)
  }
  
}

