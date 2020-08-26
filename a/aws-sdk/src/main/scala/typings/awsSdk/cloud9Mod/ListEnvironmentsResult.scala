package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnvironmentsResult extends js.Object {
  /**
    * The list of environment identifiers.
    */
  var environmentIds: js.UndefOr[EnvironmentIdList] = js.native
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListEnvironmentsResult {
  @scala.inline
  def apply(): ListEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResult]
  }
  @scala.inline
  implicit class ListEnvironmentsResultOps[Self <: ListEnvironmentsResult] (val x: Self) extends AnyVal {
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
    def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = this.set("environmentIds", js.Array(value :_*))
    @scala.inline
    def setEnvironmentIds(value: EnvironmentIdList): Self = this.set("environmentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentIds: Self = this.set("environmentIds", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

