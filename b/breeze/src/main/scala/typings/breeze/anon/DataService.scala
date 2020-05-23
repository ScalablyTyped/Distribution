package typings.breeze.anon

import typings.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataService extends js.Object {
  var dataService: typings.breeze.breeze.DataService
  var query: EntityQuery
  def getUrl(): String
}

object DataService {
  @scala.inline
  def apply(dataService: typings.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
}

