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
  def apply(Configurations: listOfConfiguration = null, NextToken: string = null): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

