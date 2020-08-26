package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicaOptions extends js.Object {
  /**
    * The index for which replica you wish to retrieve this value from, or if undefined, use the value from the first server that replies.
    */
  var index: js.UndefOr[Double] = js.native
}

object GetReplicaOptions {
  @scala.inline
  def apply(): GetReplicaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicaOptions]
  }
  @scala.inline
  implicit class GetReplicaOptionsOps[Self <: GetReplicaOptions] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

