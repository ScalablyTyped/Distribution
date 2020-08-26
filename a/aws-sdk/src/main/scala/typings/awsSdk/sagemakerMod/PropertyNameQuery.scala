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
  @scala.inline
  implicit class PropertyNameQueryOps[Self <: PropertyNameQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPropertyNameHint(value: PropertyNameHint): Self = this.set("PropertyNameHint", value.asInstanceOf[js.Any])
  }
  
}

