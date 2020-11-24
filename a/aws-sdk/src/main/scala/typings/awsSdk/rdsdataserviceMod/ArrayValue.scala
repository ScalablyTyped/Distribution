package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayValue extends js.Object {
  
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.native
  
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.native
  
  /**
    * An array of integers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.native
  
  /**
    * An array of floating point numbers.
    */
  var longValues: js.UndefOr[LongArray] = js.native
  
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.native
}
object ArrayValue {
  
  @scala.inline
  def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  
  @scala.inline
  implicit class ArrayValueOps[Self <: ArrayValue] (val x: Self) extends AnyVal {
    
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
    def setArrayValuesVarargs(value: ArrayValue*): Self = this.set("arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setArrayValues(value: ArrayOfArray): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    
    @scala.inline
    def setBooleanValuesVarargs(value: BoxedBoolean*): Self = this.set("booleanValues", js.Array(value :_*))
    
    @scala.inline
    def setBooleanValues(value: BooleanArray): Self = this.set("booleanValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValues: Self = this.set("booleanValues", js.undefined)
    
    @scala.inline
    def setDoubleValuesVarargs(value: BoxedDouble*): Self = this.set("doubleValues", js.Array(value :_*))
    
    @scala.inline
    def setDoubleValues(value: DoubleArray): Self = this.set("doubleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValues: Self = this.set("doubleValues", js.undefined)
    
    @scala.inline
    def setLongValuesVarargs(value: BoxedLong*): Self = this.set("longValues", js.Array(value :_*))
    
    @scala.inline
    def setLongValues(value: LongArray): Self = this.set("longValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValues: Self = this.set("longValues", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: String*): Self = this.set("stringValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValues(value: StringArray): Self = this.set("stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValues: Self = this.set("stringValues", js.undefined)
  }
}
