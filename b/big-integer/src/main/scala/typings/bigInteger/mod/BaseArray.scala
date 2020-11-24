package typings.bigInteger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseArray extends js.Object {
  
  var isNegative: Boolean = js.native
  
  var value: js.Array[Double] = js.native
}
object BaseArray {
  
  @scala.inline
  def apply(isNegative: Boolean, value: js.Array[Double]): BaseArray = {
    val __obj = js.Dynamic.literal(isNegative = isNegative.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseArray]
  }
  
  @scala.inline
  implicit class BaseArrayOps[Self <: BaseArray] (val x: Self) extends AnyVal {
    
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
    def setIsNegative(value: Boolean): Self = this.set("isNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
