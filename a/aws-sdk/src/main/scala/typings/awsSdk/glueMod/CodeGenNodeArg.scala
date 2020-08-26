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
  def apply(Name: CodeGenArgName, Value: CodeGenArgValue): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNodeArg]
  }
  @scala.inline
  implicit class CodeGenNodeArgOps[Self <: CodeGenNodeArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: CodeGenArgName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: CodeGenArgValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: Boolean): Self = this.set("Param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("Param", js.undefined)
  }
  
}

