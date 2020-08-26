package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to only include those with the specified names.
    */
  var ApplicationNames: js.UndefOr[ApplicationNamesList] = js.native
}

object DescribeApplicationsMessage {
  @scala.inline
  def apply(): DescribeApplicationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationsMessage]
  }
  @scala.inline
  implicit class DescribeApplicationsMessageOps[Self <: DescribeApplicationsMessage] (val x: Self) extends AnyVal {
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
    def setApplicationNamesVarargs(value: ApplicationName*): Self = this.set("ApplicationNames", js.Array(value :_*))
    @scala.inline
    def setApplicationNames(value: ApplicationNamesList): Self = this.set("ApplicationNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationNames: Self = this.set("ApplicationNames", js.undefined)
  }
  
}

