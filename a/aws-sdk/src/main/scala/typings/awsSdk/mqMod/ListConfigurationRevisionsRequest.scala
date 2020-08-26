package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationRevisionsRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mqMod.MaxResults] = js.native
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListConfigurationRevisionsRequest {
  @scala.inline
  def apply(ConfigurationId: string): ListConfigurationRevisionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationRevisionsRequest]
  }
  @scala.inline
  implicit class ListConfigurationRevisionsRequestOps[Self <: ListConfigurationRevisionsRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: string): Self = this.set("ConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

