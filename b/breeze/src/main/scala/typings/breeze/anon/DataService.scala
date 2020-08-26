package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataService extends js.Object {
  var dataService: typings.breeze.breeze.DataService = js.native
  var query: EntityQuery = js.native
  def getUrl(): String = js.native
}

object DataService {
  @scala.inline
  def apply(dataService: typings.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
  @scala.inline
  implicit class DataServiceOps[Self <: DataService] (val x: Self) extends AnyVal {
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
    def setDataService(value: typings.breeze.breeze.DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setQuery(value: EntityQuery): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

