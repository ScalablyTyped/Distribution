package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchOptions extends js.Object {
  /**
    *     Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  /**
    * Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}

object TouchOptions {
  @scala.inline
  def apply(): TouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptions]
  }
  @scala.inline
  implicit class TouchOptionsOps[Self <: TouchOptions] (val x: Self) extends AnyVal {
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
    def setPersist_to(value: Double): Self = this.set("persist_to", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist_to: Self = this.set("persist_to", js.undefined)
    @scala.inline
    def setReplicate_to(value: Double): Self = this.set("replicate_to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicate_to: Self = this.set("replicate_to", js.undefined)
  }
  
}

