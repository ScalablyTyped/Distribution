package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseFilter extends js.Object {
  /**
    *  The status used to filter test cases. Valid statuses are SUCCEEDED, FAILED, ERROR, SKIPPED, and UNKNOWN. A TestCaseFilter can have one status. 
    */
  var status: js.UndefOr[String] = js.native
}

object TestCaseFilter {
  @scala.inline
  def apply(): TestCaseFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseFilter]
  }
  @scala.inline
  implicit class TestCaseFilterOps[Self <: TestCaseFilter] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

