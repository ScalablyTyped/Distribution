package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidationSummary extends js.Object {
  /**
    * The time that an invalidation request was created.
    */
  var CreateTime: timestamp = js.native
  /**
    * The unique ID for an invalidation request.
    */
  var Id: String = js.native
  /**
    * The status of an invalidation request.
    */
  var Status: String = js.native
}

object InvalidationSummary {
  @scala.inline
  def apply(CreateTime: timestamp, Id: String, Status: String): InvalidationSummary = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidationSummary]
  }
  @scala.inline
  implicit class InvalidationSummaryOps[Self <: InvalidationSummary] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: timestamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

