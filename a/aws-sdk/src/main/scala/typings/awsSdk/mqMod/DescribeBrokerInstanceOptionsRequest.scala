package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerInstanceOptionsRequest extends js.Object {
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.native
  /**
    * Filter response by host instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The maximum number of instance options that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mqMod.MaxResults] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Filter response by storage type.
    */
  var StorageType: js.UndefOr[string] = js.native
}

object DescribeBrokerInstanceOptionsRequest {
  @scala.inline
  def apply(): DescribeBrokerInstanceOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsRequest]
  }
  @scala.inline
  implicit class DescribeBrokerInstanceOptionsRequestOps[Self <: DescribeBrokerInstanceOptionsRequest] (val x: Self) extends AnyVal {
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
    def setEngineType(value: string): Self = this.set("EngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("EngineType", js.undefined)
    @scala.inline
    def setHostInstanceType(value: string): Self = this.set("HostInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostInstanceType: Self = this.set("HostInstanceType", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStorageType(value: string): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
  
}

