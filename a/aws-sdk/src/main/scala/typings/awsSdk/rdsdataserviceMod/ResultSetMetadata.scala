package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetMetadata extends js.Object {
  /**
    * The number of columns in the result set.
    */
  var columnCount: js.UndefOr[Long] = js.native
  /**
    * The metadata of the columns in the result set.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.native
}

object ResultSetMetadata {
  @scala.inline
  def apply(): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetMetadata]
  }
  @scala.inline
  implicit class ResultSetMetadataOps[Self <: ResultSetMetadata] (val x: Self) extends AnyVal {
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
    def setColumnCount(value: Long): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    @scala.inline
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = this.set("columnMetadata", js.Array(value :_*))
    @scala.inline
    def setColumnMetadata(value: Metadata): Self = this.set("columnMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMetadata: Self = this.set("columnMetadata", js.undefined)
  }
  
}

