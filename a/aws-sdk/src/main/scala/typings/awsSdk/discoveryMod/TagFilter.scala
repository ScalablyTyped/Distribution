package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    * A name of the tag filter.
    */
  var name: FilterName = js.native
  /**
    * Values for the tag filter.
    */
  var values: FilterValues = js.native
}

object TagFilter {
  @scala.inline
  def apply(name: FilterName, values: FilterValues): TagFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
}

