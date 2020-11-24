package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParameter extends js.Object {
  
  /**
    * The name of the integer parameter.
    */
  var Name: NonEmptyString = js.native
  
  /**
    * The values for the integer parameter.
    */
  var Values: LongList = js.native
}
object IntegerParameter {
  
  @scala.inline
  def apply(Name: NonEmptyString, Values: LongList): IntegerParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameter]
  }
  
  @scala.inline
  implicit class IntegerParameterOps[Self <: IntegerParameter] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: Long_ *): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: LongList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
