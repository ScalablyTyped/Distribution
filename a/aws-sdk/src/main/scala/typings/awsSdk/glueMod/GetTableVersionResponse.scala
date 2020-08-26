package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableVersionResponse extends js.Object {
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[typings.awsSdk.glueMod.TableVersion] = js.native
}

object GetTableVersionResponse {
  @scala.inline
  def apply(): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionResponse]
  }
  @scala.inline
  implicit class GetTableVersionResponseOps[Self <: GetTableVersionResponse] (val x: Self) extends AnyVal {
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
    def setTableVersion(value: TableVersion): Self = this.set("TableVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableVersion: Self = this.set("TableVersion", js.undefined)
  }
  
}

