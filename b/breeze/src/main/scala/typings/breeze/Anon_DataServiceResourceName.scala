package typings.breeze

import typings.breeze.breezeNs.DataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataServiceResourceName extends js.Object {
  var dataService: DataService
  var resourceName: String
}

object Anon_DataServiceResourceName {
  @scala.inline
  def apply(dataService: DataService, resourceName: String): Anon_DataServiceResourceName = {
    val __obj = js.Dynamic.literal(dataService = dataService, resourceName = resourceName)
  
    __obj.asInstanceOf[Anon_DataServiceResourceName]
  }
}

