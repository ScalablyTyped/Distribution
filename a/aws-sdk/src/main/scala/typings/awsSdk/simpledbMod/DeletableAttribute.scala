package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletableAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: String = js.native
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[String] = js.native
}

object DeletableAttribute {
  @scala.inline
  def apply(Name: String, Value: String = null): DeletableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableAttribute]
  }
}

