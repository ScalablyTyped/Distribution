package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNameQuery extends js.Object {
  /**
    * Text that begins a property's name.
    */
  var PropertyNameHint: typings.awsSdk.sagemakerMod.PropertyNameHint = js.native
}

object PropertyNameQuery {
  @scala.inline
  def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNameQuery]
  }
}

