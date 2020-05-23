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
  def apply(name: String, index: js.UndefOr[ModelVariableIndex] = js.undefined): ModelVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVariable]
  }
}

