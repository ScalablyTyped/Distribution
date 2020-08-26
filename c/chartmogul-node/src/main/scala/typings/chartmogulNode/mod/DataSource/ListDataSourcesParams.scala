package typings.chartmogulNode.mod.DataSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesParams extends js.Object {
  var name: js.UndefOr[String] = js.native
  var system: js.UndefOr[String] = js.native
}

object ListDataSourcesParams {
  @scala.inline
  def apply(): ListDataSourcesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesParams]
  }
  @scala.inline
  implicit class ListDataSourcesParamsOps[Self <: ListDataSourcesParams] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

