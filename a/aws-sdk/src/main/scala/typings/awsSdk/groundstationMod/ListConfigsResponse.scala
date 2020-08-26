package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigsResponse extends js.Object {
  /**
    * List of Config items.
    */
  var configList: js.UndefOr[ConfigList] = js.native
  /**
    * Next token returned in the response of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListConfigsResponse {
  @scala.inline
  def apply(): ListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsResponse]
  }
  @scala.inline
  implicit class ListConfigsResponseOps[Self <: ListConfigsResponse] (val x: Self) extends AnyVal {
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
    def setConfigListVarargs(value: ConfigListItem*): Self = this.set("configList", js.Array(value :_*))
    @scala.inline
    def setConfigList(value: ConfigList): Self = this.set("configList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigList: Self = this.set("configList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

