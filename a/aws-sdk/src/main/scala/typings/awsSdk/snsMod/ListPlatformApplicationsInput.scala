package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlatformApplicationsInput extends js.Object {
  /**
    * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListPlatformApplicationsInput {
  @scala.inline
  def apply(): ListPlatformApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsInput]
  }
  @scala.inline
  implicit class ListPlatformApplicationsInputOps[Self <: ListPlatformApplicationsInput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

