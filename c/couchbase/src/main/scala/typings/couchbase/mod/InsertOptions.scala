package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertOptions extends js.Object {
  /**
    * Set the initial expiration time for the document. A value of 0 represents never expiring.
    */
  var expiry: js.UndefOr[Double] = js.native
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  /**
    *     Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}

object InsertOptions {
  @scala.inline
  def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  @scala.inline
  implicit class InsertOptionsOps[Self <: InsertOptions] (val x: Self) extends AnyVal {
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
    def setExpiry(value: Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
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

