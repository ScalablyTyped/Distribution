package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceableAttribute extends js.Object {
  /**
    * The name of the replaceable attribute.
    */
  var Name: String = js.native
  /**
    * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The default setting is false.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The value of the replaceable attribute.
    */
  var Value: String = js.native
}

object ReplaceableAttribute {
  @scala.inline
  def apply(Name: String, Value: String, Replace: js.UndefOr[Boolean] = js.undefined): ReplaceableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceableAttribute]
  }
}

