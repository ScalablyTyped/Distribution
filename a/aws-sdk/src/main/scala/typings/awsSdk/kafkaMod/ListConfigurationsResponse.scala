package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationsResponse extends js.Object {
  /**
    * 
    An array of MSK configurations.
    
    */
  var Configurations: js.UndefOr[listOfConfiguration] = js.native
  /**
    * 
    The paginated results marker. When the result of a ListConfigurations operation is truncated, the call returns NextToken in the response. 
    To get another batch of configurations, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  @scala.inline
  implicit class ListConfigurationsResponseOps[Self <: ListConfigurationsResponse] (val x: Self) extends AnyVal {
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
    def setConfigurationsVarargs(value: Configuration*): Self = this.set("Configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: listOfConfiguration): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

