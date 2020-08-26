package typings.couchbase.mod.Bucket.ViewQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a view query response.
  */
@js.native
trait Meta extends js.Object {
  /**
    * The total number of rows available in the index of the view that was queried.
    */
  var total_rows: Double = js.native
}

object Meta {
  @scala.inline
  def apply(total_rows: Double): Meta = {
    val __obj = js.Dynamic.literal(total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
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
    def setTotal_rows(value: Double): Self = this.set("total_rows", value.asInstanceOf[js.Any])
  }
  
}

