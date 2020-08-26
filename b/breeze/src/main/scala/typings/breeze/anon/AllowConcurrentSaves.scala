package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowConcurrentSaves extends js.Object {
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.native
  var dataService: js.UndefOr[typings.breeze.breeze.DataService] = js.native
  var resourceName: js.UndefOr[String] = js.native
  var tag: js.UndefOr[js.Any] = js.native
}

object AllowConcurrentSaves {
  @scala.inline
  def apply(): AllowConcurrentSaves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowConcurrentSaves]
  }
  @scala.inline
  implicit class AllowConcurrentSavesOps[Self <: AllowConcurrentSaves] (val x: Self) extends AnyVal {
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
    def setAllowConcurrentSaves(value: Boolean): Self = this.set("allowConcurrentSaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowConcurrentSaves: Self = this.set("allowConcurrentSaves", js.undefined)
    @scala.inline
    def setDataService(value: typings.breeze.breeze.DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataService: Self = this.set("dataService", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

