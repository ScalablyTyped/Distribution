package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRequest extends js.Object {
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  /**
    * A string informing Amazon SimpleDB where to start the next list of ItemNames.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The expression used to query the domain.
    */
  var SelectExpression: String = js.native
}

object SelectRequest {
  @scala.inline
  def apply(SelectExpression: String): SelectRequest = {
    val __obj = js.Dynamic.literal(SelectExpression = SelectExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRequest]
  }
  @scala.inline
  implicit class SelectRequestOps[Self <: SelectRequest] (val x: Self) extends AnyVal {
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
    def setSelectExpression(value: String): Self = this.set("SelectExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistentRead(value: Boolean): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

