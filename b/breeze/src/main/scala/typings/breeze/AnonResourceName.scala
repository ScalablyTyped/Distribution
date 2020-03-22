package typings.breeze

import typings.breeze.breeze.DataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResourceName extends js.Object {
  var dataService: DataService
  var resourceName: String
}

object AnonResourceName {
  @scala.inline
  def apply(dataService: DataService, resourceName: String): AnonResourceName = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResourceName]
  }
}

