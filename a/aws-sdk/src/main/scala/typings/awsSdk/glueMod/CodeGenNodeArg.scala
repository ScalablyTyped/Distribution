package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var Name: CodeGenArgName = js.native
  /**
    * True if the value is used as a parameter.
    */
  var Param: js.UndefOr[Boolean] = js.native
  /**
    * The value of the argument or property.
    */
  var Value: CodeGenArgValue = js.native
}

object CodeGenNodeArg {
  @scala.inline
  def apply(Name: CodeGenArgName, Value: CodeGenArgValue, Param: js.UndefOr[scala.Boolean] = js.undefined): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    if (!js.isUndefined(Param)) __obj.updateDynamic("Param")(Param.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNodeArg]
  }
}

