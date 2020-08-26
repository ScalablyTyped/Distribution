package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecimalParameter extends js.Object {
  /**
    * A display name for the dataset.
    */
  var Name: NonEmptyString = js.native
  /**
    * Values.
    */
  var Values: DoubleList = js.native
}

object DecimalParameter {
  @scala.inline
  def apply(Name: NonEmptyString, Values: DoubleList): DecimalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalParameter]
  }
  @scala.inline
  implicit class DecimalParameterOps[Self <: DecimalParameter] (val x: Self) extends AnyVal {
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
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: DoubleList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

