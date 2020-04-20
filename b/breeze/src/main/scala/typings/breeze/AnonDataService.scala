package typings.breeze

import typings.breeze.breeze.DataService
import typings.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataService extends js.Object {
  var dataService: DataService
  var query: EntityQuery
  def getUrl(): String
}

object AnonDataService {
  @scala.inline
  def apply(dataService: DataService, getUrl: () => String, query: EntityQuery): AnonDataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataService]
  }
}

