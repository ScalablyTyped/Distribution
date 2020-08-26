package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HITLayoutParameter extends js.Object {
  /**
    *  The name of the parameter in the HITLayout. 
    */
  var Name: String = js.native
  /**
    * The value substituted for the parameter referenced in the HITLayout. 
    */
  var Value: String = js.native
}

object HITLayoutParameter {
  @scala.inline
  def apply(Name: String, Value: String): HITLayoutParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HITLayoutParameter]
  }
  @scala.inline
  implicit class HITLayoutParameterOps[Self <: HITLayoutParameter] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

