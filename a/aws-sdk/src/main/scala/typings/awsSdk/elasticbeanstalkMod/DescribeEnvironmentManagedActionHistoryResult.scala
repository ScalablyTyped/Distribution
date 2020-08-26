package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItems] = js.native
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEnvironmentManagedActionHistoryResult {
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
  @scala.inline
  implicit class DescribeEnvironmentManagedActionHistoryResultOps[Self <: DescribeEnvironmentManagedActionHistoryResult] (val x: Self) extends AnyVal {
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
    def setManagedActionHistoryItemsVarargs(value: ManagedActionHistoryItem*): Self = this.set("ManagedActionHistoryItems", js.Array(value :_*))
    @scala.inline
    def setManagedActionHistoryItems(value: ManagedActionHistoryItems): Self = this.set("ManagedActionHistoryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedActionHistoryItems: Self = this.set("ManagedActionHistoryItems", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

