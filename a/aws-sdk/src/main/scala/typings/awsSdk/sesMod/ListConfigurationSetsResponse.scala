package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * A list of configuration sets.
    */
  var ConfigurationSets: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSets] = js.native
  /**
    * A token indicating that there are additional configuration sets available to be listed. Pass this token to successive calls of ListConfigurationSets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  @scala.inline
  implicit class ListConfigurationSetsResponseOps[Self <: ListConfigurationSetsResponse] (val x: Self) extends AnyVal {
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
    def setConfigurationSetsVarargs(value: ConfigurationSet*): Self = this.set("ConfigurationSets", js.Array(value :_*))
    @scala.inline
    def setConfigurationSets(value: ConfigurationSets): Self = this.set("ConfigurationSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationSets: Self = this.set("ConfigurationSets", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

