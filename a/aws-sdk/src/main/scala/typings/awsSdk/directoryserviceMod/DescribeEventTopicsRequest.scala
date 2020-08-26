package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsRequest extends js.Object {
  /**
    * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[typings.awsSdk.directoryserviceMod.TopicNames] = js.native
}

object DescribeEventTopicsRequest {
  @scala.inline
  def apply(): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
  @scala.inline
  implicit class DescribeEventTopicsRequestOps[Self <: DescribeEventTopicsRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setTopicNamesVarargs(value: TopicName*): Self = this.set("TopicNames", js.Array(value :_*))
    @scala.inline
    def setTopicNames(value: TopicNames): Self = this.set("TopicNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicNames: Self = this.set("TopicNames", js.undefined)
  }
  
}

