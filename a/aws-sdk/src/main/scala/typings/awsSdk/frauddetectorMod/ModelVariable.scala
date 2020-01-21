package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVariable extends js.Object {
  /**
    * The model variable's index.&gt;
    */
  var index: js.UndefOr[ModelVariableIndex] = js.native
  /**
    * The model variable's name.&gt;
    */
  var name: String = js.native
}

object ModelVariable {
  @scala.inline
  def apply(name: String, index: Int | Double = null): ModelVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVariable]
  }
}

