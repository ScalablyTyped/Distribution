package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexResponse extends js.Object {
  /**
    * The unique identifier of the index. Use this identifier when you query an index, set up a data source, or index a document.
    */
  var Id: js.UndefOr[IndexId] = js.native
}

object CreateIndexResponse {
  @scala.inline
  def apply(): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexResponse]
  }
  @scala.inline
  implicit class CreateIndexResponseOps[Self <: CreateIndexResponse] (val x: Self) extends AnyVal {
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
    def setId(value: IndexId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

