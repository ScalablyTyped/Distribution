package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The URL of the queue.
    */
  var URL: js.UndefOr[String] = js.native
}

object Queue {
  @scala.inline
  def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURL: Self = this.set("URL", js.undefined)
  }
  
}

