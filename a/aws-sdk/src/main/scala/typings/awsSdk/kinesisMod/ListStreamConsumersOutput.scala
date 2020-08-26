package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamConsumersOutput extends js.Object {
  /**
    * An array of JSON objects. Each object represents one registered consumer.
    */
  var Consumers: js.UndefOr[ConsumerList] = js.native
  /**
    * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of registered consumers, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. For more information about the use of this pagination token when calling the ListStreamConsumers operation, see ListStreamConsumersInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisMod.NextToken] = js.native
}

object ListStreamConsumersOutput {
  @scala.inline
  def apply(): ListStreamConsumersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamConsumersOutput]
  }
  @scala.inline
  implicit class ListStreamConsumersOutputOps[Self <: ListStreamConsumersOutput] (val x: Self) extends AnyVal {
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
    def setConsumersVarargs(value: Consumer*): Self = this.set("Consumers", js.Array(value :_*))
    @scala.inline
    def setConsumers(value: ConsumerList): Self = this.set("Consumers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumers: Self = this.set("Consumers", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

