package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * Resource type
    */
  var resource: ResourceType
}

object Resource {
  @scala.inline
  def apply(resource: ResourceType): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Resource]
  }
}

